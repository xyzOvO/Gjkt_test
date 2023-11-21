package error;

public class test_01 {
    public static void main(String[] args) throws Exception{
        String s = "123";
//        if (s==null){
//            throw new NullPointerException("有错。");
//        }
        try{
            System.out.println(s.length());
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            System.out.println("我都会执行！");
        }
        System.out.println("嘿嘿嘿");
    }
}
