package test;

public class test_lamda {
    public static void main(String[] args) {
        nh nh = null;
        // 1.lambda表示简化
        nh = (String a) -> {
            System.out.println("你好:" + a);
        };
        // 2.简化参数括号
        nh = (a) -> {
            System.out.println("你好:" + a);
        };
        // 3.简化中括号
        nh = a -> System.out.println("你好:" + a);
        // 4.简化println
        nh = System.out::println;
        nh.nh("a");
        /*
         * 总结：
         * lambda表达式只能有一行代码的情况下才能简化为一行，如果有多行，需要用代码块包裹（2）。
         * 前提是接口为函数式接口
         * 多个参数也可以去掉参数类型，要去掉就都需去掉，必须加上括号。
         * */
    }
}

interface nh {
    void nh(String name);
}
//class nhimplem implements test.nh{
//
//    @Override
//    public void test.nh(String name) {
//        System.out.println("你好:"+name);
//    }
//}
