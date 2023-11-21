package Thread.ex1;

public class main {
    public static void main(String[] args) {
        Thread_1 xc1 = new Thread_1();
        Thread_2 xc2 = new Thread_2();
        xc1.setName("线程1");
        xc2.setName("线程2");
        xc1.start();
        xc2.start();
    }
}
