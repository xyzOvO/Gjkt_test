package test;

import java.io.Serializable;
import java.util.Arrays;
import java.util.HashSet;

public class test_04 implements Serializable {
    transient volatile int num = 0;
    transient int s = 2;// 不可序列化


    public static void main(String[] args) {
//        char i1 = 'a';
//        char i2 = 'a';
//        int num = i1;
//        System.out.println(num);
//        long i3 = 1;
//        float i4 = 1.0F;
//        double i5 = 1.0;
//        double i = i1 + i2+i4+i3+i5;
//        boolean b = false;
//        System.gc();
//        int[] a = {1,2,3};
//        String s = "1.32.121".replaceAll(".121","1");
//        System.out.println(s);
//        switch (s){
//            case "123":
//                System.out.println("1");
//                break;
//            default:
//                System.out.println("gg");
//        }
        longestConsecutive(new int[]{1, 2, 3, 4});
        HashSet<Integer> set = new HashSet<>();
        double d1=-0.5;
        System.out.println("Ceil d1="+Math.ceil(d1));
        System.out.println("floor d1="+Math.floor(d1));
    }

    public static synchronized int longestConsecutive(int[] nums) {
        int s1 = 3;
        int len = nums.length;
        if (len == 1 || len == 0) return len; // 如果数组长度为1或0，直接返回长度

        Arrays.sort(nums); // 先对数组进行排序，这不是最优解法，但在这个实现中使用了排序

        int temp = 1; // 当前连续序列的长度
        int res = 1; // 最长连续序列的长度，初始化为1
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                if (nums[i] + 1 == nums[i + 1]) {
                    // 如果当前元素与下一个元素相差1，表示当前序列仍然连续
                    temp++;
                } else {
                    // 否则，当前序列不再连续，更新最长连续序列长度并重置当前序列长度
                    res = Math.max(res, temp);
                    temp = 1;
                }
            }
        }
        // 返回最长连续序列的长度，最终要考虑最后一个连续序列的长度
        return Math.max(temp, res);
    }

    public static int hIndex(int[] citations) {
        // 实现对数时间复杂度的算法解决此问题-二分
        int len = citations.length;
        int left = -1;
        int right = len;
        while (left + 1 < right) {
            int mid = left + (right - left) / 2;
            if (citations[mid] < len - mid) {
                left = mid;
            } else {
                right = mid;
            }
        }
        return len - right;
    }



//    public final void cs1(){
//
//    }
//    int a = 0;
//    class cs_Bean {
//        //
//        static void cs1(){
//        }
//    }
//    static public void cs_Bean(){
//        a = 1;
//    }
}
