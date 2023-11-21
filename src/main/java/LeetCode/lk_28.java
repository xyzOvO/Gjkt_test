package LeetCode;

import java.util.Arrays;

public class lk_28 {
    //输入：haystack = "sadbutsad", needle = "sad"
    //输出：0
    //解释："sad" 在下标 0 和 6 处匹配。
    //第一个匹配项的下标是 0 ，所以返回 0
    public static void main(String[] args) {
        String s = "1234";
        System.out.println(s.substring(0, 4));
//        System.out.println(strStr("sadbutsad", "ad"));
        String s1 = "sadbutsad";
        int[] arr = new int[6];
        getNext(arr, "aabaaf");
        System.out.println(Arrays.toString(arr));
//        System.out.println(s1.indexOf("ad"));
    }

    //    public static int strStr(String haystack, String needle) {
//        int res = haystack.length();// 题目找最小的索引，设置长度方便后续res比较
//        int left=0,right=needle.length()-1; // 窗口大小为needle字符串大小
//        for (;right<haystack.length();right++) {
//            String temp = haystack.substring(left, right+1);
//            if (temp.equals(needle)){
//                res = Math.min(res,left);
//                return res; // 因为第一次窗口碰见的一定是最小的
//            }else {
//                left++;
//            }
//        }
//        return -1;
//    }
//    public static int strStr(String haystack, String needle) {
//        int hlen = haystack.length(), nlen = needle.length();
//        for (int i = 0; i <= hlen - nlen; i++) {
//            if (haystack.substring(i, i + nlen).equals(needle)) return i;
//        }
//        return -1;
//    }
    public int strStr(String haystack, String needle) {
        // KMP
        int[] next = new int[needle.length()];
        if (needle.length()==0){
            return 0;
        }
        getNext(next,needle);// 构造next数组（最长相等前后缀表）
        // 已匹配的前缀的最后一个字符
        int j = -1;
        // 遍历主字符串
        for (int i = 0; i < haystack.length(); i++) {
            // 如果当前字符不匹配，回溯j
            while(j>=0 && haystack.charAt(i)!=needle.charAt(j+1)){
                j=next[j];
            }
            if (haystack.charAt(i)==needle.charAt(j+1)){
                j++;
            }
            // 找到匹配子串
            if (j==needle.length()-1){
                // 返回子串在主字符串的起始位置
                return (i-needle.length()+1);
            }
        }
        return -1;
    }

    // 构建 aabaaf
    private static void getNext(int[] next, String needle) {
        // 减1构建
        // 双指针
        int j = -1;// 指示前缀的最后一个字符位置
        next[0] = -1;// 第一个元素没有前缀匹配
        // 从第二个字符开始遍历,匹配最长相等前后缀表
        for (int i = 1; i < needle.length(); i++) {
            // 前后缀不相等，通过循环找到一个更小的j值
            System.out.println(needle.charAt(i));
            while (j >= 0 && needle.charAt(j + 1) != needle.charAt(i)) {
                // 这里是KMP算法的关键之一，通过不断回溯j的值，找到一个更小的匹配前缀
                j = next[j];
            }
            // 如果needle中的第j+1个字符和第i个字符相等，说明找到了一个更长的匹配前缀
            if (needle.charAt(j + 1) == needle.charAt(i)) {
                j++;
            }
            next[i] = j;
        }
    }

}
