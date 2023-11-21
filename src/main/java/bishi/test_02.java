package bishi;

public class test_02 {
    public static void main(String[] args) {
        num(50,100);
    }
    public static void num(int M, int N){
        int count = 0;
        for (int i = M; i <= N; i++) {
            int num = i;
            while (num>0){
                if (num%10==5){
                    count++;
                    System.out.println(num+":"+count);
                }
                num/=10;
            }
        }
        System.out.println(count);
    }
}
