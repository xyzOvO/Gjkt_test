package Thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class test_03 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        /*
        *   第三种启动方式
        *   1.自定义类实现Callable接口
        *   2.重写call方法(有返回值，表示多线程运行的结果)
        *   3.创建自定义类的对象（多线程要执行的任务），创建FutureTask的对象（管理多线程运行的结果）
        *   4.创建一个Thread类的对象，并启动线程
        *
         */

        // 自定义类
        MyThread3 call = new MyThread3();
        // 创建管理线程对象
        FutureTask futureTask = new FutureTask(call);
        // 创建Thread类
        Thread t1 = new Thread(futureTask);
        Thread t2 = new Thread(futureTask);
        t1.setName("线程1");
        t2.setName("线程2");
        t1.start();
        t2.start();
        System.out.println(t1.getPriority());

        System.out.println(futureTask.get());
    }
}
