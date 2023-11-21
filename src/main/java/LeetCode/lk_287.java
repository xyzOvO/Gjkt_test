package LeetCode;

import java.util.HashSet;
import java.util.Set;

public class lk_287 {
    public static void main(String[] args) {
        System.out.println(findDuplicate(new int[]{3,1,3,4,2}));
    }

    //    public static int findDuplicate(int[] nums) {
//        int len = nums.length;
//        int fast = 0, slow = 0;
//        int res = 0;
//        int temp = 0;
//        for (; fast < nums.length; fast++) {
//            if (nums[slow] == nums[fast]) {
//                temp++;
//            }
//            if (temp!=1){
//                return nums[slow];
//            }
//            if (fast == nums.length - 1) {
//                slow++;
//                fast = slow-1;
//                res = Math.max(res, temp);
//                temp = 0;
//            }
//        }
//        return -1;
//    }
    public static int findDuplicate(int[] nums) {
        int fast = 0, slow = 0;
        while (true) {
            fast = nums[nums[fast]];
            slow = nums[slow];
            if (fast == slow)
                break;
        }
        int finder = 0;
        while (true) {
            finder = nums[finder];
            slow = nums[slow];
            if (slow == finder)
                break;
        }
        return slow;
    }
//    public static int findDuplicate(int[] nums) {
//        int len = nums.length;
//        int left = 1;
//        int right = len-1;
//        while (left<right){
//            int mid = left+right>>1;
//            int count=0;
//            for (int num : nums) {
//                if (num<=mid){
//                    count++;
//                }
//            }
//            if(count>mid){
//                right=mid;
//            }else {
//                left=mid+1;
//            }
//        }
//        return left;
//    }
}
