package Thread.ex1;

public class Thread_1 extends Thread{
    @Override
    public void run() {
        while (true) {
            synchronized (temp.suo) {
                if (temp.dyp==0){
                    break;
                }else {
                    temp.dyp--;
                    System.out.println(getName()+"售票成功，当前电影票剩余:" + temp.dyp);
                }
            }
        }
    }
}
