package Thread.ex6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Thread_1 extends Thread{
    ArrayList<Integer> list ;
    public Thread_1(ArrayList<Integer> list){
        this.list = list;
    }
    @Override
    public void run() {
        List<Integer> boxlist = new ArrayList<>();
        while (true){
            synchronized(Thread_1.class){
                if (list.size()==0){
                    System.out.println(getName()+boxlist);
                    break;
                }else {
                    // 继续抽奖
                    Collections.shuffle(list);
                    boxlist.add(list.remove(0));
                }
            }
        }
    }
}
