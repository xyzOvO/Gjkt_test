package error;

public class test_04 {
    // return和finally的执行顺序对返回值影响
    public static void main(String[] args) {
        System.out.println(getString());
        ;
    }

    public static String getString() {
        String str = "A";
        try {
            return str;
        } finally {
            str = "C";
            System.out.println(str);
//            return str;
        }
    }

}
