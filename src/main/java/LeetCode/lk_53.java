package LeetCode;

/**
 * @author xyz66 Email:2910223554@qq.com
 * @date 2023/11/20 9:05
 */
public class lk_53 {
    public static void main(String[] args) {
        lk_53 lk = new lk_53();
        System.out.println(lk.maxSubArray(new int[]{1, -2, 3}));
    }

    public int maxSubArray(int[] nums) {
        int len = nums.length;
        int max = Integer.MIN_VALUE;
        int sum = 0;// 当前和
        for (int i = 0; i < len; i++) {
            if (i == 0) {
                sum = nums[i];
            } else {
                // 动态规划-贪心
                sum = Math.max(sum + nums[i], nums[i]); // 子数组和为前一个元素和当前元素的和中的较大值
            }
            max = Math.max(max, sum);
        }
        return max;
    }
}


