package test;

/**
 * @author xyz66 Email:2910223554@qq.com
 * @since 2023/11/26 0:03
 */
public class test_07 {
    public static int testTry(){
        try {
            System.out.println("try");
            return 1;
        }finally{
            System.out.println("finally");
            return 2;
        }
    }
    public static void main(String[] args) {
        System.out.println(testTry());
    }
}
