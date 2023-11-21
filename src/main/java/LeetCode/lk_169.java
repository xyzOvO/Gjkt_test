package LeetCode;

import java.util.Arrays;

public class lk_169 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 4, 2};
        int[] arr2 = {1, 2, 1, 3, 4, 2};
        sort1(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));

        String s1 = "s";
        System.out.println(s1.concat("s"));
        System.out.println(s1);
    }

    protected static void sort1(int[] nums, int l, int r) {
        if (l > r) {
            return;
        }
        int jz = nums[l];
        int left = l;
        int right = r;
        while (left < right) {
            // 一定要先看右边！！！
            while (left < right && nums[right] >= jz) {
                right--;
            }
            while (left < right && nums[left] <= jz) {
                left++;
            }
            if (left < right) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
            }
        }
        nums[l] = nums[left];
        nums[left] = jz;
        sort1(nums, l, right - 1);
        sort1(nums, right + 1, r);
    }
}

