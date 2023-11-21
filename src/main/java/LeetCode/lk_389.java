package LeetCode;

import java.util.Arrays;

public class lk_389 {
    public static void main(String[] args) {
        String s1 = "sss";
        s1.chars();
        System.out.println(findTheDifference("bb","bab"));
    }
//    public char findTheDifference(String s, String t) {
//        char[] s1 = s.toCharArray();
//        char[] t1 = t.toCharArray();
//        int ssum=0,tsum=0;
//        for (int i = 0; i < s1.length; i++) {
//            ssum += s1[i];
//            tsum += t1[i];
//        }
//        return (char) (tsum - ssum);
//    }
    public static char findTheDifference(String s, String t) {
        char res = t.charAt(t.length()-1);
        System.out.println(res);
        for(int i=0; i<s.length();i++){
            res ^= s.charAt(i);
            res ^= t.charAt(i);
        }
        return res;
    }
}
