package Thread.ex3;

import java.math.BigDecimal;
import java.util.Random;

public class main {
    public static void main(String[] args) {
        Thread_1 xc1 = new Thread_1();
        Thread_2 xc2 = new Thread_2();
        Thread_2 xc3 = new Thread_2();
        Thread_2 xc4 = new Thread_2();
        Thread_2 xc5 = new Thread_2();
        Thread_2 xc6 = new Thread_2();
        xc1.setName("线程1");
        xc2.setName("线程2");
        xc1.start();
        xc2.start();
//        Random r = new Random();
//        double d = r.nextDouble();
//        int temp = (int) (100-(3-1)*d);
//        double v = r.nextInt(temp);
//        // BigDecimal的setScale方法
//        double prize = new BigDecimal(v+d).setScale(2,BigDecimal.ROUND_UP).doubleValue();
//        System.out.println(prize);
//        // String的format方法
//        String s =String.format("%.2f",v+d);
//        double prize2 = Double.parseDouble(s);
//        System.out.println(prize2);
    }
}
