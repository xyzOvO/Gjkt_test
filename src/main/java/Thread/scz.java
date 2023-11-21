package Thread;

public class scz implements Runnable{
    @Override
    public void run() {
        while(true){
            synchronized (Desk.lock){
                if (Desk.count==0){
                    break;
                }else {
                    if (Desk.flag==1){
                        try {
                            Desk.lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }else {
                        System.out.println("生成！");
                        Desk.flag=1;
                        // 唤醒
                        Desk.lock.notifyAll();
                    }
                }
            }
        }
    }
}
