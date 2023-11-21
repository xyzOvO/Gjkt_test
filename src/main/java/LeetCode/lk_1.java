package LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class lk_1 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{3, 2, 4}, 6)));
    }

    //    public static int[] twoSum(int[] nums, int target) {
//        int[] res = new int[2];
//        int sum;
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[i] + nums[j] == target) {
//                    res[0] = i;
//                    res[1] = j;
//                }
//                return res;
//            }
//        }
//        return res;
//    }
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }
}

