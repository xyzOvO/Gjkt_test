package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lk_438 {
//    给定两个字符串 s 和 p，找到 s 中所有 p 的 异位词 的子串，返回这些子串的起始索引。不考虑答案输出的顺序。
//    异位词 指由相同字母重排列形成的字符串（包括相同的字符串）。
    public static void main(String[] args){
        String s = "cbaebabacd", p = "abc";// 0,6
        System.out.println(s.charAt(1));
        System.out.println(s.charAt(1) - 'a');
        List<Integer> list = findAnagrams(s, p);
        System.out.println(list.toString());
    }
    public static List<Integer> findAnagrams(String s, String p) {
        int slen=s.length(),plen=p.length();
        List<Integer> res = new ArrayList<>();
        if (plen>slen){
            return res;
        }
        int[] scount = new int[26];
        int[] pcount = new int[26];
        for (int i = 0; i < plen; i++) {
            scount[s.charAt(i)-'a']++;
            pcount[p.charAt(i)-'a']++;
        }
        if (Arrays.equals(scount,pcount)){
            res.add(0);
        }
        // 窗口
        for (int i = 0; i < slen - plen; i++) {
            // 因为窗口大小固定为p的大小才检查，整体窗口右移
            scount[s.charAt(i)-'a']--;
            scount[s.charAt(i+plen)-'a']++;
            if (Arrays.equals(scount,pcount)){
                res.add(i+1);
            }
        }
        return res;
    }
}

