package test;

import java.util.Arrays;

public class test_maopao {
    // 冒泡
    public static void main(String[] args) {
        int[] arr = {1,3,4,5,1,2,6,7};
        maopao(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void maopao(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length -i- 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
