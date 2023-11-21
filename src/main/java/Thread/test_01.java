package Thread;

public class test_01 {
    public static void main(String[] args) throws InterruptedException {
        /*
        *   第一种启动方式
        *   1.自定义类继承Thread
        *   2.重写run方法
        *   3.创建子类的对象，并启动线程
        *
         */
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        t1.setName("线程1");
        t2.setName("线程2");
//        t1.setPriority(10);
//        t2.setPriority(1);
//        t2.setDaemon(true);

        // 开启线程
        t1.start();
        t2.start();
        t1.join();
        for (int i = 0; i < 50; i++) {
            System.out.println("main线程执行中@"+i);
        }
    }
}
