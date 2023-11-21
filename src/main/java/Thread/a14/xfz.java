package Thread.a14;

import java.util.concurrent.ArrayBlockingQueue;

public class xfz extends Thread{
    private ArrayBlockingQueue<String> xfzdl;// 消费者队列

    public xfz(ArrayBlockingQueue xfzdl) {
        this.xfzdl = xfzdl;
    }

    @Override
    public void run() {
        while(true){
            try {
                String take = xfzdl.take();
                System.out.println("消费者消费了！:"+take);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
