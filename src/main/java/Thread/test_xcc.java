package Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class test_xcc {
    // 线程池
    public static void main(String[] args) {
        new Thread(()->System.out.println("你好！")).start();
        // 1.获取线程池对象
//        ExecutorService pool1 = Executors.newCachedThreadPool();// 线程1
        ExecutorService pool1 = Executors.newFixedThreadPool(3);// 线程1
        // 2.提交任务
        pool1.submit(new MyRunnable());
        pool1.submit(new MyRunnable());
        pool1.submit(new MyRunnable());
        pool1.submit(new MyRunnable());
        pool1.submit(new MyRunnable());
        pool1.submit(new MyRunnable());
        // 3.销毁线程池
//        pool1.shutdown();
    }
}


