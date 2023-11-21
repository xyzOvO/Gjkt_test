package Thread;

public class test_07 {
    // 消费者，生产者
    public static void main(String[] args) throws InterruptedException {
        scz scz = new scz();
        xfz xfz = new xfz();
        Thread xc1 = new Thread(scz);
        Thread xc2 = new Thread(xfz);
        xc1.start();
        xc2.start();
    }
}
