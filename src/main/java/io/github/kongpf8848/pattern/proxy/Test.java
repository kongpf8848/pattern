package io.github.kongpf8848.pattern.proxy;

import com.squareup.javapoet.FieldSpec;
import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeSpec;

import javax.lang.model.element.Modifier;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Test {
    public static void main(String[] args) {
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles","true");
        RealSubject realSubject = new RealSubject();
        InvocationHandler handler = new DynamicProxy(realSubject);
        Subject subject = (Subject) Proxy.newProxyInstance(Subject.class.getClassLoader(),
                new Class<?>[] { Subject.class }, handler);
        System.out.println(subject.getClass().getName());

        subject.hello("jack");

        aa();
    }

    public static void aa(){
        try {
            TypeSpec.Builder typeSpecBuilder = TypeSpec.classBuilder("TimeProxy").addSuperinterface(Subject.class);

            FieldSpec fieldSpec = FieldSpec.builder(Subject.class, "subject", Modifier.PRIVATE).build();
            typeSpecBuilder.addField(fieldSpec);

            //添加构造函数
            MethodSpec constructSpec= MethodSpec.constructorBuilder()
                    .addModifiers(Modifier.PUBLIC)
                    .addParameter(Subject.class,"subject")
                    .addStatement("this.subject=subject")
                    .build();

            typeSpecBuilder.addMethod(constructSpec);

            //

            JavaFile javaFile = JavaFile.builder("io.github.kongpf8848.pattern.proxy", typeSpecBuilder.build()).build();
            javaFile.writeTo(new File("/Users/kongpf/Desktop/"));
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
