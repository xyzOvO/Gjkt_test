package test;

import java.util.Arrays;

public class test_kp {
    public static void main(String[] args) {
        int[] arr = {31,2, 3, 4, 1, 7, 8, 5, 6,1,3,4,6,7,32,4,5,6,2,1,};
        kp_sort(arr, 0, arr.length-1);// 传数组左右的下标
        System.out.println(Arrays.toString(arr));
        System.out.println(arr.hashCode());
    }

    private static void kp_sort(int[] arr, int left, int right) {
        int index = left, l = left, r = right;
        if (right == 0 || l > r) {
            return;
        }
        while (l < r) {
            while (l < r && arr[index] <= arr[r]) {
                r--;
            }
            while (l < r && arr[index] >= arr[l]) {
                l++;
            }
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
        }
        int temp = arr[r];
        arr[r] = arr[index];
        arr[index] = temp;
        kp_sort(arr, left, l - 1);
        kp_sort(arr, r + 1, right);
    }
}
