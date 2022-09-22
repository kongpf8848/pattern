package io.github.kongpf8848.pattern;

import com.squareup.javapoet.*;

import javax.lang.model.element.Modifier;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MyProxy implements java.io.Serializable{

    private static final Class<?>[] constructorParams = { InvocationHandler.class };

    protected InvocationHandler h;

    private MyProxy() {
    }

    protected MyProxy(InvocationHandler h) {
        Objects.requireNonNull(h);
        this.h = h;
    }

    public static Object newProxyInstance(Class clazz, InvocationHandler h) {
        try {
            TypeSpec.Builder typeSpecBuilder = TypeSpec.classBuilder("TimeProxy")
                    .addSuperinterface(clazz)
                    .superclass(MyProxy.class)
                    .addModifiers(Modifier.PUBLIC);

            //添加构造函数
            MethodSpec constructMethodSpec = MethodSpec.constructorBuilder()
                    .addModifiers(Modifier.PUBLIC)
                    .addParameter(InvocationHandler.class, "h")
                    .addStatement("super(h)")
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
                        .addStatement("\tsuper.h.invoke(this,$L, new Object[]{$L})",fieldName,Utils.join(",", parameterNameList))
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

            String sourceDir = "/Users/kongpf/Desktop/";
            String packageName="io.github.kongpf8848.pattern.proxy";
            //生成.java文件
            JavaFile javaFile = JavaFile.builder(packageName, typeSpecBuilder.build()).build();
            javaFile.writeTo(new File(sourceDir));

            //编译
            JavaCompiler.compile(new File(sourceDir+packageName.replace(".","/")+"/TimeProxy.java"));

            //加载class
            try {
                URL[] urls = new URL[]{new File(sourceDir).toURL()};
                URLClassLoader classLoader = new URLClassLoader(urls);
                Class c = classLoader.loadClass("io.github.kongpf8848.pattern.proxy.TimeProxy");
                final Constructor constructor = c.getConstructor(constructorParams);
                return constructor.newInstance(new Object[]{h});
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

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;

    }
}
