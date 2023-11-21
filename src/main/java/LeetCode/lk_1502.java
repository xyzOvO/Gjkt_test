package LeetCode;

import java.util.Arrays;

public class lk_1502 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 4};
        canMakeArithmeticProgression(arr);
    }

    //    public static boolean canMakeArithmeticProgression(int[] arr) {
//        int len = arr.length;
//        Arrays.sort(arr);// 快排
//        int sum = 0;
//        for (int i : arr) {
//            sum+=i;
//        }
//        int ssum = len*(arr[0]+arr[len-1])/2;
//        if (sum==ssum){
//            return true;
//        }else{
//            return false;
//        }
//    }
    public static boolean canMakeArithmeticProgression(int[] arr) {
        int len = arr.length;
        Arrays.sort(arr);// 快排
        int temp = arr[1]-arr[0];
        for (int i = 0; i < arr.length-1; i++) {
            int d = arr[i+1] - arr[i];
            if (d != temp) return false;
        }
        return true;
    }
}


