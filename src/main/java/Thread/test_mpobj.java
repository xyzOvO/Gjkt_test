package Thread;

public class test_mpobj extends Thread{
    // 卖票
    private static int p = 0;

    static Object suo = new Object();

    @Override
    public void run() {
        while(true){
            // 解决线程安全：同步代码块
            synchronized (test_mpobj.class) {
                if (p<100){
                    p++;
                    System.out.println(getName()+"在卖："+p);
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }else {
                    break;
                }
            }
        }
    }
}
