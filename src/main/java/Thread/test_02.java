package Thread;

public class test_02 {
    public static void main(String[] args) {
        /*
        *   第二种启动方式
        *   1.自定义类实现Runnable接口
        *   2.重写run方法
        *   3.创建自定义类的对象，
        *   4.创建一个Thread类的对象，并启动线程
        *
         */

        // 自定义类
        MyThread2 run = new MyThread2();
        // 创建线程对象
        Thread t1 = new Thread(run);
        Thread t2 = new Thread(run);
        t1.setName("线程1");
        t2.setName("线程2");
        t1.start();
        t2.start();
    }
}
