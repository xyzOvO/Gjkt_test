package Thread.ex3;

public class Thread_1 extends Thread{
    @Override
    public void run() {
        while (true) {
            synchronized (temp.suo) {
                if (temp.dyp==100){
                    break;
                }else {
                    if (temp.dyp%2==0){
                        System.out.println(getName()+":"+temp.dyp+"是偶数");
                    }
                    temp.dyp++;
                }
            }
        }
    }
}
