package API_test;

public class Exception_test {
    public static void main(String[] args) {
//        try {
//            savaAge(169);
//            System.out.println("底层执行成功！");
//        } catch (Exception e) {
//            e.printStackTrace();
//            System.out.println("底层执行错误");
//        }
        try {
            savaAge(1111);
            System.out.println("底层执行成功！");
        } catch (AgelllegaRuntimeException2 e) {
            e.printStackTrace();
            System.out.println("底层执行错误");
        }
    }

    public static void savaAge(int age) throws AgelllegaRuntimeException2{
        if (age > 0 && age < 150){
            System.out.println("年龄被成功保存");
        }else {
            // 用一个异常对象封装这个问题
            throw new AgelllegaRuntimeException2("年龄非法"+age);
        }
    }
}
