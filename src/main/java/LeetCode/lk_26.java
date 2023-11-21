package LeetCode;

public class lk_26 {
    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{1,1,2,2}));
    }

    public static int removeDuplicates(int[] nums) {
        int p = 1;// 指针1
        int q = 0;// 指针2
        int len = nums.length;
        while (p < len) {
            if (nums[p] != nums[q]) {
                nums[++q] = nums[p];
            }
            p++;
        }
        return q + 1;
    }
}
