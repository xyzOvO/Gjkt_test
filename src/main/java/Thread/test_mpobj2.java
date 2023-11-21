package Thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class test_mpobj2 implements Runnable {
    int p = 0;
    Lock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            lock.lock();
            try {
                //synchronized (test_mpobj2.class){
                if (p == 100) {
                    break;
                } else {
                    Thread.sleep(100);
                    p++;
                    System.out.println(Thread.currentThread().getName() + "卖：" + p);
                }
                //}
            } catch (Exception e) {
                throw new RuntimeException(e);
            } finally {
                lock.unlock();// 利用try-catch-finally每次线程都要释放锁，防止跳出循环不释放锁
            }
        }
    }
}
