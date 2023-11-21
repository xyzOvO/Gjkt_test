package test;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class test_string {
    public static void main(String[] args) {
        String s1 = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s1));
//        System.out.println(s1.indexOf("c", 3));
        String babad = longestPalindrome("aaaa");
    }

    public static int lengthOfLongestSubstring(String s) {
        //用链表实现队列，队列是先进先出的
        Queue<Character> queue = new LinkedList<>();
        int res = 0;
        for (char c : s.toCharArray()) {
            while (queue.contains(c)) {
                //如果有重复的，队头出队
                queue.poll();
            }
            //添加到队尾
            queue.add(c);
            res = Math.max(res, queue.size());
        }
        return res;
    }

    public static String longestPalindrome1(String s) {
        // 暴力解法
        int len = s.length();
        if(len<2){
            return s;
        }
        int maxLen = 1;
        int res = 0;
        for(int i = 0;i<len-1;i++){
            for (int j = i+1; j < len; j++) {
                if (j-i+1 > maxLen && hwc_pd(s,i,j)){
                 maxLen=j-i+1;
                 res=i;
                }
            }
        }
        return s.substring(res,res+maxLen);
    }

    private static boolean hwc_pd(String s, int left, int right) {
        while(left<right){
            if (s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static String longestPalindrome(String s) {
        if(s==null||s.equals("")){
            return s;
        }
        boolean[][] dp = new boolean[s.length()][s.length()];
        int[] res = new int[2];
        for(int i =0;i<s.length();i++) dp[i][i]=true;
        for (int i = 0; i < s.length()-1; i++) {
            for (int j = i+1; j <s.length() ; j++) {
                if (s.charAt(i)==s.charAt(j)){
                    if(j-i==1){
                        dp[i][j] = true;
                    }
                    else{
                        dp[i][j] = dp[i+1][j-1];
                    }
                }else {
                    dp[i][j] = false;
                }
                if (dp[i][j]){
                    if (res[1]-res[0]<=j-i){
                        res[0]=i;
                        res[1]=j;
                    }
                }
            }
        }
        return s.substring(res[0],res[1]+1);
    }
}
