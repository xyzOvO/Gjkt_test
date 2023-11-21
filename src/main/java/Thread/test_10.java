package Thread;

import java.util.concurrent.CopyOnWriteArrayList;

public class test_10 {
    public static void main(String[] args) throws InterruptedException {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
        for (int i = 0; i < 1000; i++) {
            new Thread(()->{
                list.add(Thread.currentThread().getName());
            }).start();
        }
        Thread.sleep(100);// 不加sleep也不安全
        System.out.println(list.size());
    }
}
