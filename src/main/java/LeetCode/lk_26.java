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
        int p = 0;
        for (int q = p + 1; q < len; q++) {
            if (nums[q] != nums[p]) {
                p++;
                nums[p] = nums[q];
            }
        }
//        Arrays.stream(nums).forEach(System.out::println);
        return p+1;
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
