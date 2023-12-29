package LeetCode;

/**
 * 给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。
 * <p>
 * 不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。
 * <p>
 * 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
 */
public class lk_27 {
    public static void main(String[] args) {
        System.out.println(new lk_27().removeElement(new int[]{0,1,2,2,3,0,4,2}, 2));
    }

    //    public static int removeElement(int[] nums, int val) {
//        int len = nums.length;
//        int fast = 0,slow=0;
//        if (nums.length==0){
//            return -1;
//        }
//        for (; fast < len; fast++) {
//            if (nums[fast]!=val){
//                nums[slow]= nums[fast];
//                slow++;
//            }
//        }
//        return slow;
//    }
    public int removeElement(int[] nums, int val) {
        int len = nums.length;
        int left = 0;
        for (int right = left; right < len; right++) {
            if (nums[right] != val) {
                nums[left] = nums[right];
                left++;
            }
        }
        return left;
    }
}
