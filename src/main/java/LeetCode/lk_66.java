package LeetCode;

public class lk_66 {
    public static void main(String[] args) {
        int[] arr = {3,2,9};
        plusOne(arr);
    }
    public static int[] plusOne(int[] digits) {
        int len = digits.length;
        // for模拟有进位，但不多一位。
        for (int i = len-1;i>=0;i--){
            // 题目信息：只+1
            digits[i]++;
            digits[i]%=10;// 关键，直接赋值
            // <10的情况
            if (digits[i]!=0){
                return digits;// 直接退出
            }
        }
        digits = new int[len+1];// 考虑多一位情况
        digits[0] =1;
        return digits;
    }
}
