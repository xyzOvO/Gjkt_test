package LeetCode;

import org.junit.Test;

/**
 * @author xyz66 Email:2910223554@qq.com
 * @date 2023/11/20 9:05
 */
public class lk_53 {
    public static void main(String[] args) {
        lk_53 lk = new lk_53();
        System.out.println(lk.maxSubArray(new int[]{1, -2, 3}));
    }

    //    public int maxSubArray(int[] nums) {
//        int len = nums.length;
//        int max = Integer.MIN_VALUE;
//        int sum = 0;// 当前和
//        for (int i = 0; i < len; i++) {
//            if (i == 0) {
//                sum = nums[i];
//            } else {
//                // 动态规划-贪心
//                sum = Math.max(sum + nums[i], nums[i]); // 子数组和为前一个元素和当前元素的和中的较大值
//            }
//            max = Math.max(max, sum);
//        }
//        return max;
//    }
    public int maxSubArray(int[] nums) {
        int len = nums.length;
        // dp[i] 表示：以 nums[i] 结尾的连续子数组的最大和
        int[] dp = new int[len];
        dp[0] = nums[0];

        // 状态转移方程
        for (int i = 1; i < len; i++) {
            if (dp[i - 1] > 0) {
                dp[i] = dp[i - 1] + nums[i];
            } else {
                dp[i] = nums[i];
            }
        }

        // 也可以在上面遍历的同时求出 res 的最大值，这里我们为了语义清晰分开写，大家可以自行选择
        int res = dp[0];
        for (int i = 1; i < len; i++) {
            res = Math.max(res, dp[i]);
        }
        return res;
    }


    @Test
    public void test1() {
        System.out.println(Integer.MIN_VALUE);
    }
}


