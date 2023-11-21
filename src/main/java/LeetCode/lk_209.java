package LeetCode;

public class lk_209 {
    //209. 长度最小的子数组
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        // 2
        System.out.println(minSubArrayLen(18, arr));
    }

    private static int minSubArrayLen(int targer, int[] nums) {
        int sum = 0, res = nums.length + 1;
        int l = 0;
        // 单for右指针
        for (int r = 0; r < nums.length; r++) {
            sum += nums[r];
            while (sum >= targer) {
                res = Math.min(res, r - l + 1);
                sum -= nums[l++];
            }
        }
        return res == nums.length+1?0:res;
    }

//    public static int minSubArrayLen(int target, int[] nums) {
//        int res = nums.length+1; // 返回长度,因为要找最小值，所以设置为长度
//        int l = 0, r = -1;// r=-1使sum从数组下标0的元素开始。=
//        int sum = 0;
//        if (nums.length < 1) {
//            return 0;
//        }
//        while (l < nums.length) {
//            if (sum >= target) {
//                res = Math.min(res, r - l + 1);
//            }
//            if (r + 1 < nums.length && sum < target) {
//                r++;
//                sum += nums[r];
//            } else {
//                sum -= nums[l];
//                l++;
//            }
//        }
//        return res == nums.length+1?0:res;
//    }
}
