package test;

class A {
    public A() {
        System.out.println("class test.A");
    }

    {
        System.out.println("I'm test.A class");
    }

    static {
        System.out.println("class test.A static");
    }
}

public class B extends A {
    public B() {
        System.out.println("class test.B");
    }

    {
        System.out.println("I'm test.B class");
    }

    static {
        System.out.println("class test.B static");
    }

    public static void main(String[] args) {
        new B();
        System.out.println("---------------------");
        new B();
    }
}
