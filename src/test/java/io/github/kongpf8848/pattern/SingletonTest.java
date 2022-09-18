package io.github.kongpf8848.pattern;

import io.github.kongpf8848.pattern.singleton.Singleton;
import io.github.kongpf8848.pattern.singleton.Singleton3;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonTest {

    @Test
    public void testSingleton(){
//        //反射攻击
        Singleton s1=Singleton.getInstance();
        System.out.println("s1="+s1);
        Singleton s2= null;
        try {
            Constructor<Singleton> c= null;
            c = Singleton.class.getDeclaredConstructor();
            c.setAccessible(true);
            s2 = c.newInstance();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        System.out.println("s2="+s2);
        System.out.println(s1==s2);
    }

    @Test
    public void testEnum(){

        //反射攻击 enum
        try {
            Singleton3 s3=Singleton3.getInstance();
            System.out.println("s3="+s3);
            Constructor<Singleton3> c3=Singleton3.class.getDeclaredConstructor();
            c3.setAccessible(true);
            Singleton3 s4=c3.newInstance();
            System.out.println("s4="+s4);
            System.out.println(s3==s4);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
