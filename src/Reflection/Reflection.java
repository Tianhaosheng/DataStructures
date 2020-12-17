package Reflection;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Reflection {


    @Test
    public void test() throws Exception {

        //类获取
        Class personClass = Person.class;

        //获取类完整路径
        String name1 = personClass.getName();
        System.out.println(name1);

        //获取包路径
        String name2 = personClass.getPackage().getName();
        System.out.println(name2);

        //获取类名
        String simpleName = personClass.getSimpleName();
        System.out.println(simpleName);

        Constructor constructor1 = personClass.getConstructor();
        Object o = constructor1.newInstance();
        System.out.println(o);

        Constructor constructor = personClass.getDeclaredConstructor(String.class);
        constructor.setAccessible(true);
        Object obj = constructor.newInstance("tian");
        System.out.println(obj);

        Field name = personClass.getDeclaredField("name");
        name.setAccessible(true);
        name.set(obj,"ta");
        System.out.println(obj);

        Method show = personClass.getDeclaredMethod("show");
        show.setAccessible(true);
        Object invoke = show.invoke(obj);
        System.out.println(invoke);

        Constructor declaredConstructor = personClass.getDeclaredConstructor();
    }
}
