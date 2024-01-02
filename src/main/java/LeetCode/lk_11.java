package LeetCode;

import org.junit.Test;

/**
 * @author Gjkt
 * @description 盛最多水的容器
 * @since 2024/1/2 9:35
 */
public class lk_11 {
    //    public int maxArea(int[] height) {
//        // 暴力
//        int len = height.length;
//        int resMax = -1;
//        for (int left = 0; left < len - 1; left++) {
//            for (int right = len - 1; right > left; right--) {
//                int heightMin = Math.min(height[left], height[right]);
//                int area = heightMin * (right - left);
//                resMax = Math.max(resMax, area);
//            }
//        }
//        return resMax;
//    }
    public int maxArea(int[] height) {
        // 证明性，只要板子有一边能框住就行，向内遍历的时候底板一定在拉短，看高度左右关系，最小的限制高度板
        // 如果固定左边的柱子，移动右边的柱子，那么水的高度一定不会增加，且宽度一定减少，所以水的面积一定减少。
        int len = height.length;
        int resMax = -1;
        int left = 0;
        int right = len - 1;
        while (left < right) {
            if (height[left]<height[right]){
                resMax = Math.max(resMax,(right-left)*height[left]);
                left++;
            }else{
                resMax = Math.max(resMax,(right-left)*height[right]);
                right--;
            }
        }
        return resMax;
    }

    @Test
    public void test() {
        System.out.println(maxArea(new int[]{1, 1}));
    }
}
