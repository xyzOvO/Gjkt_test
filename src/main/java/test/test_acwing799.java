package test;

import java.util.Scanner;

public class test_acwing799 {
    public static void main(String[] args) {
        // 最长连续不重复子序列
        //5
        // 1 2 2 3 5
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Scanner(System.in).nextInt();
        }
        int way = way(arr);
        System.out.println(way);
    }

    private static int way(int[] arr) {
        int res = -1;
        int left = 0;
        int N = 100010;
        int[] lastIndex = new int[N];
        // Java初始化数组存入的是0，会导致1 2的数返回1
        while (N>0){
            lastIndex[--N]=-1;
        }
        if (arr.length<2){
            return arr.length;
        }
        for (int right = 0; right < arr.length; right++) {
            int num = arr[right];// 当前右边界元素
            if (num == arr[left]) {
                left = lastIndex[num] + 1; // 更新左边界为重复元素的下一个位置
            }
            lastIndex[num] = right; // 更新数字的最新出现位置,这行代码相当于存（键-对）
            res = Math.max(res, right - left + 1);
        }
        return res;
    }
}
