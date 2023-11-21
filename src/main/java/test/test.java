package test;

import LeetCode.ListNode;

import java.io.Serializable;
import java.util.Arrays;

public class test implements Cloneable, Serializable {
    public static void main(String[] args) {
        // 快速排序
        int[] arr = {3, 6, 1, 7, 9, 2, 4, 5, 8};
//        int[] arr = {3, 6, 1};
        //3! 2 1 7 9 6 5 8
        //1 2 3! 7 9 6 5 8
        kp_sort(arr, 0, arr.length - 1);
//        System.out.println(Arrays.toString(arr));
        hIndex(new int[]{3, 0, 6, 1, 5});
    }

    private static void kp_sort(int[] arr, int left, int right) {
        int flag = left;// 存标志位下标
        int l = left, r = right;
        if (l > r) {
            return;
        }
        while (l < r) {
            while (l < r && arr[r] >= arr[flag]) {// 右边大于标志位的
                r--;
            }
            while (l < r && arr[l] <= arr[flag]) {// 左边小于标准位的
                l++;
            }
            swap(arr, l, r);
        }
        swap(arr, left, l);
        // 排序左边，右边的数
        kp_sort(arr, left, l - 1);
        kp_sort(arr, r + 1, right);
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void cs() {
        System.out.println("测试");
    }

    public test clone() {
        test test = null;
        try {
            test = (test) super.clone();
        } catch (CloneNotSupportedException e) {
            System.err.println(e);
        }
        return test;
    }

//        public static int hIndex(int[] citations) {
//        int len = citations.length;
//        int[] count = new int[len + 1]; // 从1计数
//        for (int i : citations) {
//            count[Math.min(i, len)]++;// 引用次数超过h范围取len
//        }
//        for (int i = len, sum = 0; i >= 0; i--) {
//            sum += count[i];
//            if (sum >= i) {
//                return i;// 至少i篇论文引用次数至少为i
//            }
//        }
//        return -1;
//    }

    //    public static int hIndex(int[] citations) {
//        int len = citations.length;
//        int left = 0;
//        int right = len;
//        while (left < right) {
//            // 猜论文篇数
//            int mid = (left + right + 1) / 2;
//            // 满足高引用的特点是：引用次数 >= 论文篇数
//            // count 的含义是：大于等于 mid 的论文篇数
//            int count = 0;
//            for (int citation : citations) {
//                if (citation >= mid) {
//                    count++;
//                }
//            }
//
//            if (count >= mid) {
//                left = mid;
//            } else {
//                right = mid - 1;
//            }
//        }
//        return left;
//    }
    public static int hIndex(int[] citations) {
        Arrays.sort(citations);
        int n = citations.length;
        int h = 0;
        for (int i = n - 1; i >= 0; i--) {
            // 当前论文的引用次数大于等于 h 时，满足 h 指数的定义
            if (citations[i] >= h + 1) {
                h++;
            } else {
                // 如果当前论文引用次数小于 h，后面的论文引用次数一定更小
                // 因此可以提前结束遍历，返回当前的 h 指数
                break;
            }
        }
        return h;
    }
}
