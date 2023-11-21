package Thread;

import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

public class test_9 {
    public static void main(String[] args) {
//        RunThread run = new RunThread();
//        Thread xc1 = new Thread(run);
//        Thread xc2 = new Thread(run);
//        Thread xc3 = new Thread(run);
//        xc1.setName("线程1");
//        xc2.setName("线程2");
//        xc3.setName("线程3");
//        xc1.start();
//        xc2.start();
//        xc3.start();
        ExecutorService pool = Executors.newCachedThreadPool();
        pool.submit(new RunThread());
        pool.submit(new RunThread());
        pool.submit(new RunThread());
        pool.submit(new RunThread());
        pool.shutdown();
    }

}

//class RunThread implements Runnable {
//
//    private int temp = 1000;
//
//    @Override
//    public void run() {
//        while (true) {
//            synchronized (RunThread.class) {
//                if (temp == 0) {
//                    break;
//                } else {
//                    temp--;
//                    System.out.println(Thread.currentThread().getName()+"："+temp);
//                }
//
//            }
//        }
//    }
//}
class RunThread implements Runnable {

    private int temp = 1000;
    ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            try {
                lock.lock();
                if (temp == 0) {
                    break;
                } else {
                    temp--;
                    System.out.println(Thread.currentThread().getName() + "：" + temp);
                }
            } finally {
                lock.unlock();
            }

        }
    }
}

//class Solution {
//    public int countDigits(int num) {
//        List<Integer> list = new ArrayList<>();
//        int res = 0;
//        int temp = num;
//        while (temp != 0) {
//            int i = temp % 10;// 个位
//            temp /= 10;
//            list.add(i);
//        }
//        for (Integer i : list) {
//            if (num % i == 0) {
//                res++;
//            }
//        }
//        return res;
//    }
//}