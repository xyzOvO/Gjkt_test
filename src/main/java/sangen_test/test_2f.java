package sangen_test;

import java.util.Arrays;

public class test_2f {
    public static void main(String[] args) {
        int[] arr = {-1,0,3,5,6};
        int num = 9;
        int f = find_2f(arr, num);
        System.out.println(f);
        System.out.println(Arrays.binarySearch(arr,9));
    }

    private static int find_2f(int[] arr, int num) {
        int len = arr.length, l = 0, r = len-1;
        while (l+1 < r) {
            int mid = (l + r) / 2;
            if (arr[mid] > num) {
                r = mid;
            } else {
                l = mid;
            }
            if (arr[mid] == num) {
                return mid;
            }
        }
        return -1;
    }
}
