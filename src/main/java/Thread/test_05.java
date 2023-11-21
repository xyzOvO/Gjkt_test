package Thread;


public class test_05 {
    private int s = 1;
    public static void main(String[] args) throws InterruptedException {
        test_mpobj2 rumthrad = new test_mpobj2();
        Thread test_mpobj1 = new Thread(rumthrad);
        Thread test_mpobj2 = new Thread(rumthrad);
        Thread test_mpobj3 = new Thread(rumthrad);
        Integer i1 = 59;
        Integer i2 = Integer.valueOf(59);
        Integer i3 = new Integer(59);// 转成int了
        int i4 = 59;
        System.out.println(i1 == i2);
        System.out.println(i1 == i3);
        System.out.println(i4 == i3);
        test_mpobj1.setName("线程1");
        test_mpobj2.setName("线程2");
        test_mpobj3.setName("线程3");
//        test_mpobj1.start();
//        test_mpobj2.start();
//        test_mpobj3.start();
//        test_mpobj1.sleep(100000);
//        Thread.sleep(1000);
//        test_mpobj1.interrupt();
    }
}
