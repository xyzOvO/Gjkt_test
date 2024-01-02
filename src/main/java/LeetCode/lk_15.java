package LeetCode;

import org.junit.Test;

import java.sql.Array;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Gjkt
 * @description
 * @since 2024/1/2 10:41
 */
public class lk_15 {
    public List<List<Integer>> threeSum(int[] nums) {
        int len = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        // 排个序！！！
        Arrays.sort(nums);
        // 固定一个指针
        for (int i = 0; i < len; i++) {
            // 去重,当前指针表示数和上一个指针相同
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int l = i + 1;
            int r = len - 1;
            // 找满足条件的左右指针
            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                if (sum == 0) {
                    res.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    // 因为排序了，重复的数是挨在一起的
                    while (l < r && nums[l] == nums[l + 1]) l++;
                    while (l < r && nums[r] == nums[r - 1]) r--;
                    l++;
                    r--;
                } else if (sum < 0) {
                    // 左指针取出来的数过于小了
                    l++;
                } else {
                    // 右指针
                    r--;
                }
            }

        }
        return res;
    }
//    public List<List<Integer>> threeSum(int[] nums) {
//        int len = nums.length;
//        // 利用Set集合去重
//        Set<List<Integer>> set = new HashSet<>();
//        // 排个序！！！
//        Arrays.sort(nums);
//        for (int i = 0; i < len; i++) {
//            // 固定一个指针
//            int l = i + 1;
//            int r = len - 1;
//            // 找满足条件的左右指针
//            while (l < r) {
//                int sum = nums[i] + nums[l] + nums[r];
//                if (sum == 0){
//                    set.add(Arrays.asList(nums[i],nums[l],nums[r]));
//                    l++;
//                    r--;
//                }else if (sum<0){
//                    // 左指针取出来的数过于小了
//                    l++;
//                }else {
//                    // 右指针
//                    r--;
//                }
//            }
//
//        }
//        List<List<Integer>> res = new ArrayList<>(set);
//        return res;
//    }

    @Test
    public void test() {
        System.out.println(threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
    }
}
