package Thread.a14;

import java.util.concurrent.ArrayBlockingQueue;

public class scz extends Thread{
    private ArrayBlockingQueue<String> sczdl;//生产者队列
    public scz(ArrayBlockingQueue sczdl) {
        this.sczdl = sczdl;
    }
    @Override
    public void run() {
        while(true){
            try {
                sczdl.put("生成");
                System.out.println("生产者生成了！");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
