package Thread.ex3;

public class Test {
    public static void main(String[] args) {

        //创建参数对象
        MyRunable mr = new MyRunable();

        //创建线程对象
        Thread t1 = new Thread(mr, "线程A");
        Thread t2 = new Thread(mr, "线程B");

        //启动线程
        t1.start();
        t2.start();
    }
}
