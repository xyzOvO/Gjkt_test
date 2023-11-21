package LeetCode;

public class lk_1822 {
    public static void main(String[] args) {
        int[] arr = {123};

    }

    public int arraySign(int[] nums) {
        int res = 1;
        for (int num : nums) {
            if (num == 0) return 0;
            if (num < 0) res *= -1;
        }
        return res;
    }
}
