package LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class lk_242 {
    public static void main(String[] args) {
        boolean anagram = isAnagram("rat", "tar");
        System.out.println(anagram);
    }

    //    public static boolean isAnagram(String s, String t) {
//        int ssum = 0,tsum=0;
//        if (s.length()!=t.length()) return false;
//        for (int i = 0; i < s.length(); i++) {
//            ssum+=(int)s.charAt(i)-'a';
//            tsum+=(int)t.charAt(i)-'a';
//        }
//        if (ssum==tsum){
//            return true;
//        }
//        else {
//            return false;
//        }
//    }
//    public static boolean isAnagram(String s, String t) {
//        char[] sc = s.toCharArray();
//        char[] tc = t.toCharArray();
//        if (s.length()!=t.length()) return false;
//        Arrays.sort(sc);
//        Arrays.sort(tc);
//        System.out.println(Arrays.toString(sc));
//
//        if (Arrays.equals(sc,tc)) return true;
//        return false;
//    }
    public static boolean isAnagram(String s, String t) {
        // 哈希
        Map<Character, Integer> cont = new HashMap<>();
        if (s.length() != t.length()) return false;
        for (int i = 0; i < s.length(); i++) {
            cont.put(s.charAt(i), cont.getOrDefault(s.charAt(i), 0) + 1);
            cont.put(t.charAt(i), cont.getOrDefault(t.charAt(i), 0) - 1);
        }
        for (Integer value : cont.values()) {
            if (value != 0) {
                return false;
            }
        }
        return true;
    }
}
