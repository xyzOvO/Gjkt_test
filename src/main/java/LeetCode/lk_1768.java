package LeetCode;

import java.util.Arrays;

public class lk_1768 {
    public static void main(String[] args) {
        System.out.println(mergeAlternately("abc", "bqr"));
    }
    public static String mergeAlternately(String word1, String word2) {
        int len1=word1.length(),len2=word2.length();
        int index = 0;
        char[] res = new char[len1+len2];
        for (int i = 0; i < len1+len2; i++) {
            if (i<len1) res[index++]=word1.charAt(i);
            if (i<len2) res[index++]=word2.charAt(i);
        }
        return new String(res);
    }
}
