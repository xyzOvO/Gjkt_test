package Thread.ex6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Executors;

public class main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,1,5,10,20,50,100,200,500,100);
        Thread_1 xc1 = new Thread_1(list);
        Thread_1 xc2 = new Thread_1(list);
        Thread_1 xc3 = new Thread_1(list);
        Thread_1 xc4 = new Thread_1(list);
        xc1.setName("线程1");
        xc2.setName("线程2");
        xc3.setName("线程3");
        xc4.setName("线程4");
        xc1.start();
        xc2.start();
        xc3.start();
        xc4.start();
    }
}
