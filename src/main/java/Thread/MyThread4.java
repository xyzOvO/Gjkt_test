package Thread;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyThread4 implements Runnable {
    Lock s1 = new ReentrantLock();
    Lock s2 = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            if (Thread.currentThread().getName().equals("线程1")) {
                synchronized (s1) {
                    System.out.println("s1取到");
                    synchronized (s2) {
                        System.out.println("s2取到");
                    }
                }
            } else {
                try {
                    Thread.sleep(10);// 延迟看看
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (s2) {
                    System.out.println("s2取到");
                    synchronized (s1) {
                        System.out.println("s1取到");
                    }
                }
            }
        }
    }
}
