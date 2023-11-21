package test;

public class test_03 {
    // 泛型测试
    public static void main(String[] args) {
        test_02<String> test = new test_02<>();
        test_02 cs = test;
        cs.set(8);



//        test.test.set("123");
//        System.out.println(cs_Bean.get());
        Pair<String,Integer> pair = new Pair<>("s",1);
//        System.out.println(pair.getKey());
//        System.out.println(pair.getValue());
        pair.inspect(1);
        Object someObject = new Object();
        Integer someInteger = new Integer(10);
        someObject = someInteger;   // OK
        try {
            cs.wait();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
