package LeetCode;

import java.util.Arrays;

/**
 * 删除有序数组中的重复项
 */
public class lk_26 {
    public static void main(String[] args) {
        System.out.println(new lk_26().removeDuplicates(new int[]{1, 1, 2}));
    }

    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        int left = 0;
        for (int right = left + 1; right < len; right++) {
            if (nums[right] != nums[left]) {
                left++;
                nums[left] = nums[right];
            }
        }
//        Arrays.stream(nums).forEach(System.out::println);
        return left+1;
    }

//    public int removeDuplicates(int[] nums) {
//        int p = 1;// 指针1
//        int q = 0;// 指针2
//        int len = nums.length;
//        while (p < len) {
//            if (nums[p] != nums[q]) {
//                nums[++q] = nums[p];
//            }
//            p++;
//        }
//        return q + 1;
//    }
}
