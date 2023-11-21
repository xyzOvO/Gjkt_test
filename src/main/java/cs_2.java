/**
 * @author xyz66 Email:2910223554@qq.com
 * @date 2023/11/15 16:48
 */
public class cs_2 {
    public static void main(String[] args) {
        cs_1 cs_1 = new cs_1();
        cs_1.setS("cs_Bean");
        System.out.println(cs_1.getS());
    }

    public int longestAlternatingSubarray(int[] nums, int threshold) {
        int len = nums.length;
        int l, r;
        int res = 0;
        for (l = 0; l < len; l++) {
            // 定位l
            if (nums[l] % 2 == 0 && nums[l] <= threshold) {
                // 定位r
                r = l + 1;
                while (r < len && nums[r] % 2 != nums[r - 1] % 2 && nums[r] <= threshold) {
                    r++;
                }
                res = Math.max(res, r - l);
            }
        }
        return res;
    }
}








