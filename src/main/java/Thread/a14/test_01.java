package Thread.a14;

import java.util.concurrent.ArrayBlockingQueue;

public class test_01 {
    public static void main(String[] args) {
        // 创建阻塞队列的对象
        ArrayBlockingQueue<String> zsdl = new ArrayBlockingQueue(1);// 阻塞队列
        scz scz = new scz(zsdl);
        xfz xfz = new xfz(zsdl);
        scz.start();
        xfz.start();
    }
}
