package LeetCode;

import java.util.Arrays;

public class lk_283 {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));

    }

    //    public static void swapZeroes(int[] nums) {
//        int len = nums.length;
//        int left = len-1;
//        int right = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i]==0){
//                left=Math.min(left,i);
//                right=Math.max(right,i);
//            }
//        }
////        swap(nums,right-1,left);
//        int temp = nums[right-1];
//        nums[right-1] = nums[left];
//        nums[left] = temp;
//        left = right-1;
//        if (right-left==1) {
//            while (right < nums.length-1) {
////                swap(nums,++right, left++);
//                ++right;
//                int temp2 = nums[right];
//                nums[right] = nums[left];
//                nums[left] = temp2;
//                left++;
//            }
//        }
//    }
//    public static void swap(int[] nums,int a, int b){
//        int temp = nums[a];
//        nums[a] = nums[b];
//        nums[b] = temp;
//    }
    public static void moveZeroes(int[] nums) {
        int fast = 0;
        int slow = 0;

        for (; fast < nums.length; fast++) {
            if (nums[fast] != 0) {
                nums[slow] = nums[fast];
                slow++;
            }
        }
        for (int i = slow; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
