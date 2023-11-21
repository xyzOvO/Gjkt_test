package LeetCode;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class lk_125 {
    public static void main(String[] args) {
        isPalindrome("op");
    }

    //如果在将所有大写字符转换为小写字符、并移除所有非字母数字字符之后，短语正着读和反着读都一样。则可以认为该短语是一个 回文串 。
    //
    //字母和数字都属于字母数字字符。
    //
    //给你一个字符串 s，如果它是 回文串 ，返回 true ；否则，返回 false 。
    public static boolean isPalindrome(String s) {
        int len = s.length();
        if (len < 2) {
            return true;
        }
        char[] chars = s.toCharArray();
        int l = 0, r = len - 1;
        while (l < r) {
            if (!Character.isLetterOrDigit(chars[l])) {
                l++;
            } else if (!Character.isLetterOrDigit(chars[r])) {
                r--;
            } else {
                if (Character.toLowerCase(chars[l]) != Character.toLowerCase(chars[r])) {
                    return false;
                }
                l++;
                r--;
            }
        }
        return true;
    }
}
