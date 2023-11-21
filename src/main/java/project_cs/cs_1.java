package project_cs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * @author xyz66 Email:2910223554@qq.com
 * @date 2023/11/13 10:16
 */
public class cs_1 {
    public int maximizeSum(int[] nums, int k) {
        int len = nums.length;
        int numMax = 0;
        Arrays.sort(nums);
        while (k-- != 0) {
            numMax += nums[len - 1];
            nums[len - 1] += 1;
        }
        return numMax;
    }

}
