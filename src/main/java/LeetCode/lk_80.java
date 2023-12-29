package LeetCode;

import java.util.Arrays;

/**
 * @author Gjkt
 * @description
 * @since 2023/12/29 11:40
 */
public class lk_80 {
    // 有序！！！
//    public int removeDuplicates(int[] nums) {
//        return process(nums, 1);
//    }
//
//    int process(int[] nums, int k) {
//        // 数组有序
//        int res = 0;
//        for (int x : nums) {
//            if (res < k || nums[res - k] != x) {
//                // 填数
//                nums[res++] = x;
//                System.out.println(Arrays.toString(nums));
//            }
//        }
//        return res;
//    }
    public int removeDuplicates(int[] nums) {
        // 快慢指针
        int len = nums.length;
        int slow = 1;// 用来定位当前范围,第一位不可能存在重复，直接跳
        int fast = 1;
        int count = 1;
        while (fast < len) {
            // 找条件特殊的->值变化
            if (nums[fast] != nums[fast - 1]) {
                count = 1;// 重置
                nums[slow] = nums[fast];
                slow++;
            } else {
                // 重复值情况
                count++;
                if (count <= 2) {
                    // 直接填数
                    nums[slow] = nums[fast];
                    slow++;
                }
            }
            fast++;
        }
        return slow;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 2, 3};
        System.out.println(new lk_80().removeDuplicates(arr));
        System.out.println(Arrays.toString(arr));
    }
}


