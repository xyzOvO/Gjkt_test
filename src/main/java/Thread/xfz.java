package Thread;

public class xfz implements Runnable {
    @Override
    public void run() {
        while (true) {
            synchronized (Desk.lock) {
                if (Desk.count == 0) {
                    break;
                } else {
                    if (Desk.flag == 0) {
                        try {
                            Desk.lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }

                    } else {
                        Desk.count--;
                        if (Desk.count == 0) {
                            System.out.println("吃完了，没了！");
                        } else {
                            System.out.println("消费者消耗，还有" + Desk.count);
                        }
                        Desk.lock.notifyAll();
                        Desk.flag = 0;
                    }
                }
            }
        }
    }
}
