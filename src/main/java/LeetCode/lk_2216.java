package LeetCode;

/**
 * @author xyz66 Email:2910223554@qq.com
 * @date 2023/11/21 15:50
 */
public class lk_2216 {
    public static void main(String[] args) {

    }

    public int minDeletion(int[] nums) {
        int len = nums.length;
        if (len == 0) {
            return 0;
        }
        int ans = 0;
        int i = 0;
        while (i < len) {
            int j = i + 1;
            while (j < len && nums[i] == nums[j]) {
                // 不是美丽数组,记删
                j++;
            }
            ans = j - i + 1;// 美丽数组开始的下标
            i = j + 1;
        }
        return (len - ans) % 2 == 0 ? ans : ans + 1;
    }
}
