package test;

import java.util.*;

class Solution {
    public static void main(String[] args) {
        List<List<String>> res = new ArrayList<>();
        System.out.println(punishmentNumber(1000));
    }

    public static int punishmentNumber(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (cfs(i, i * i)) sum += i * i;
        }
        return sum;
    }

    public static boolean cfs(int num, int square) {
        System.out.println(square);
        //分割成若干连续子字符串判定
        if (num == square) {
            return true;
        }
        int temp = 10;
        // 当前值低位切位
        while (square >= num && num >= square % temp) {
            // 分治，找低位对应的值在高位有没有
            if (cfs(num - (square % temp), square / temp)) {
                return true;
            }
            temp *= 10;
        }
        return false;
    }
}

