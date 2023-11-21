package Thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class test_04 {
    public static void main(String[] args) throws InterruptedException {
        test_mpobj test_mpobj1 = new test_mpobj();
        test_mpobj test_mpobj2 = new test_mpobj();
        test_mpobj test_mpobj3 = new test_mpobj();
        test_mpobj1.setName("线程1");
        test_mpobj2.setName("线程2");
        test_mpobj3.setName("线程3");
        test_mpobj1.start();
        test_mpobj2.start();
        test_mpobj3.start();
        test_mpobj2.wait();
    }
}
