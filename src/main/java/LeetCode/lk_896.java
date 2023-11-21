package LeetCode;

public class lk_896 {
    public static void main(String[] args) {

    }

    public boolean isMonotonic(int[] nums) {
        int len = nums.length;
        int temp = nums[len - 1] - nums[0];// 记录单调性
        // 单调递增
        if (temp > 0) {
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i + 1] < nums[i]) return false;
            }
        } else {
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i + 1] > nums[i]) return false;
            }
        }
        return true;
    }
}

