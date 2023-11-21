package Thread;

public class MyThread2 implements Runnable{
    @Override
    public void run() {
        // 获取当前线程对象
        Thread thread = Thread.currentThread();
        // 书写线程要执行的代码
        for (int i = 0; i < 100; i++) {
            System.out.println(thread.getName()+"hello");
        }
    }
}
