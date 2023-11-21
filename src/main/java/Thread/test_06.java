package Thread;

public class test_06 {
    // 测试死锁
    public static void main(String[] args) throws InterruptedException {
        MyThread4 myThread4 = new MyThread4();
        Thread xc1 = new Thread(myThread4);
        Thread xc2 = new Thread(myThread4);
        xc1.setName("线程1");
        xc2.setName("线程2");
        xc1.start();
        xc2.start();

    }
}
