package LeetCode;

public class lk_9 {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }
    //    public boolean isPalindrome(int x) {
//        if (x < 0) return false;
//        int num = x;
//        int cur = 0;
//        // 倒序
//        while (num != 0) {
//            cur = cur * 10 + num % 10;// 循环进位
//            num /= 10;// 位数上面的值
//        }
//        return cur == x;
//    }
    public static boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        String s2 = new StringBuilder(s).reverse().toString();
        return s.equals(s2);
    }
}
