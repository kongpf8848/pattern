package io.github.kongpf8848.pattern;

import com.squareup.javapoet.*;
import io.github.kongpf8848.pattern.proxy.DynamicProxy;
import io.github.kongpf8848.pattern.proxy.RealSubject;
import io.github.kongpf8848.pattern.proxy.Subject;

import javax.lang.model.element.Modifier;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.List;

public class MyProxy {

    public static void newProxyInstance(Class clazz, InvocationHandler h) {
        try {
            TypeSpec.Builder typeSpecBuilder = TypeSpec.classBuilder("TimeProxy")
                    .addSuperinterface(clazz)
                    .addModifiers(Modifier.PUBLIC);

            FieldSpec fieldSpec = FieldSpec.builder(InvocationHandler.class, "h", Modifier.PRIVATE).build();
            typeSpecBuilder.addField(fieldSpec);

            //添加构造函数
            MethodSpec constructMethodSpec = MethodSpec.constructorBuilder()
                    .addModifiers(Modifier.PUBLIC)
                    .addParameter(InvocationHandler.class, "h")
                    .addStatement("this.h=h")
                    .build();

            typeSpecBuilder.addMethod(constructMethodSpec);

            //静态代码块
            CodeBlock.Builder staticCodeBuilder = CodeBlock.builder()
                    .add("try {\n");

            //添加方法实现
            Method[] methods = clazz.getDeclaredMethods();
            int methodIndex = 3;
            for (Method method : methods) {

                String fieldName = "m" + (methodIndex++);

                //添加静态成员变量
                FieldSpec field = FieldSpec.builder(Method.class, fieldName, Modifier.PRIVATE, Modifier.STATIC).build();
                typeSpecBuilder.addField(field);

                MethodSpec.Builder methodBuilder = MethodSpec.methodBuilder(method.getName())
                        .addModifiers(Modifier.PUBLIC)
                        .returns(method.getReturnType())
                        .addAnnotation(Override.class);

                Parameter[] parameters = method.getParameters();
                List<String> parameterNameList = new ArrayList<>();
                List<String> classNameList = new ArrayList<>();
                if (parameters != null) {
                    for (Parameter parameter : parameters) {
                        methodBuilder.addParameter(parameter.getType(), parameter.getName());
                        parameterNameList.add(parameter.getName());
                        if("int".equals(parameter.getType().getName())){
                            classNameList.add("Integer.TYPE");
                        }else if("float".equals(parameter.getType().getName())){
                            classNameList.add("Float.TYPE");
                        }else if("double".equals(parameter.getType().getName())){
                            classNameList.add("Double.TYPE");
                        }else if("short".equals(parameter.getType().getName())){
                            classNameList.add("Short.TYPE");
                        }else if("long".equals(parameter.getType().getName())){
                            classNameList.add("Long.TYPE");
                        }else if("boolean".equals(parameter.getType().getName())){
                            classNameList.add("Boolean.TYPE");
                        }else if("byte".equals(parameter.getType().getName())){
                            classNameList.add("Byte.TYPE");
                        }else if("char".equals(parameter.getType().getName())){
                            classNameList.add("Character.TYPE");
                        }else {
                            classNameList.add("Class.forName(\"" + parameter.getType().getName() + "\")");
                        }
                    }
                }
                staticCodeBuilder.addStatement("\t$L=$T.class.getMethod($S,$L)",fieldName,clazz,method.getName(),Utils.join(",", classNameList));


                methodBuilder.addCode("try {\n")
                        .addStatement("\tthis.h.invoke(this,$L, new Object[]{$L})",fieldName,Utils.join(",", parameterNameList))
                        .addCode("} catch(Throwable e) {\n")
                        .addCode("\te.printStackTrace();\n")
                        .addCode("}\n")
                        .build();

                typeSpecBuilder.addMethod(methodBuilder.build());
            }

            //添加静态代码块
            staticCodeBuilder.add("} catch(Throwable e) {\n")
                    .addStatement("\te.printStackTrace()")
                    .add("}\n");
            typeSpecBuilder.addStaticBlock(staticCodeBuilder.build());

            //生成.java文件
            JavaFile javaFile = JavaFile.builder("io.github.kongpf8848.pattern.proxy", typeSpecBuilder.build()).build();
            javaFile.writeTo(new File("/Users/kongpf/Desktop/"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void createProxyClassFile() {
        String sourcePath = "/Users/kongpf/Desktop/";
        try {
            JavaCompiler.compile(new File(sourcePath + "io/github/kongpf8848/pattern/proxy/TimeProxy.java"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void loadClass() {
        String sourcePath = "/Users/kongpf/Desktop";
        try {
            URL[] urls = new URL[]{new File(sourcePath).toURL()};
            URLClassLoader classLoader = new URLClassLoader(urls);
            Class clazz = classLoader.loadClass("io.github.kongpf8848.pattern.proxy.TimeProxy");
            Constructor constructor = clazz.getDeclaredConstructor(InvocationHandler.class);
            Subject s = (Subject) constructor.newInstance(new DynamicProxy(new RealSubject()));
            s.hello("abc");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
