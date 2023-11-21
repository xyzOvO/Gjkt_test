package LeetCode;

public class lk_27 {
    public static void main(String[] args) {
        System.out.println(removeElement(new int[]{1, 2, 3, 4, 5}, 2));
    }
    public static int removeElement(int[] nums, int val) {
        int len = nums.length;
        int fast = 0,slow=0;
        if (nums.length==0){
            return -1;
        }
        for (; fast < len; fast++) {
            if (nums[fast]!=val){
                nums[slow]= nums[fast];
                slow++;
            }
        }
        return slow;
    }
}
