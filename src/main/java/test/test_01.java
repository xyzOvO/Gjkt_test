package test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class test_01 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, IOException {
        // 1.new 关键字
        test test = new test();
        // 2.使用Class类的newInstance
        test test1 = (test) Class.forName("test.test").newInstance();
        test test2 = test.getClass().newInstance();
        // 3.使用Constructor类的newInstance
        Constructor<? extends test> constructor = test.getClass().getConstructor();
        test test3 = constructor.newInstance();
        test3.cs();
        // 4.使用cloone方法
        // 实现Cloneable接口并实现其定义的clone方法
        test test4 = (test) test3.clone();
        test4.cs();
        // 5.使用反序列化
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("test.test.obj"));
        test test5 = (test) in.readObject();
        test5.cs();
    }
}
