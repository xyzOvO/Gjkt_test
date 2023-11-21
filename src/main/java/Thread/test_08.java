package Thread;

public class test_08 {
    public static void main(String[] args) throws InterruptedException {
        Thread233 thread233 = new Thread233();
        Thread xc1 = new Thread(thread233);
        Thread xc2 = new Thread(thread233);
        xc1.setName("线程1");
        xc2.setName("线程2");
        xc1.setPriority(10);
        System.out.println(xc2.getState());
        xc2.start();
        xc1.start();
        for (int i = 1; i <= 10; i++) {
            System.out.println("正常：" + i);
            System.out.println(xc2.getState());
//            System.out.println(xc1.getState());
            if (i == 5) {
                System.out.println(xc2.getState());
//                System.out.println(xc1.getState());
                xc2.join();
                System.out.println(xc2.getState());
            }
        }

    }
}

class Thread233 implements Runnable {
    @Override
    public void run() {
        int num = 0;
        while (true) {
            synchronized (Thread233.class) {
                if (num == 1000) {
                    break;
                } else {
                    num++;
                    System.out.println(Thread.currentThread().getName() + "-还在插队:" + num);
                    System.out.println(Thread.currentThread().getState());
                }
            }
        }
    }
}
