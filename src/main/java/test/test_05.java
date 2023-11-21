package test;

public class test_05 {
    final int aa = 2;
    {
        System.out.println("cs123");
    }
    static {
        System.out.println("cs321");
    }
     test_05(){

    }
    public static void main(String[] args) {

    }
    final int cs(){
        final int i = 0;
        int b =i;
        b++;
        System.out.println(aa);
        return i;
    }
//    public String cs_Bean(){
//        System.out.println("3");
//        return "1";
//    }
    public int cs(int num){
        System.out.println("2");
        return 1;
    }
}
