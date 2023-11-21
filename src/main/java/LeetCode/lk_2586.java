package LeetCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author xyz66 Email:2910223554@qq.com
 * @date 2023/11/7 9:20
 */
public class lk_2586 {
    public static void main(String[] args) {

    }

//    public int vowelStrings(String[] words, int left, int right) {
//        List<Character> list = new ArrayList<>();
//        list.add('a');
//        list.add('e');
//        list.add('i');
//        list.add('o');
//        list.add('u');
//        int res = 0;
//        int len = words.length;
//        for (int l = left; l <= right; l++) {
//            String s1 = words[l];
//            int slen = s1.length();
//            char first = s1.charAt(0);
//            char end = s1.charAt(slen - 1);
//            if (list.contains(first) && list.contains(end)) {
//                res++;
//            }
//        }
//        return res;
//    }
    public int vowelStrings(String[] words, int left, int right) {
        int[] arr = new int[26];
        arr['a' - 'a']++;
        arr['e' - 'a']++;
        arr['i' - 'a']++;
        arr['o' - 'a']++;
        arr['u' - 'a']++;
        int res = 0;
        for (int l = left; l <= right; l++) {
            int length = words[l].length();
            if (arr[words[l].charAt(0) - 'a'] > 0 && arr[words[l].charAt(length - 1) - 'a'] > 0) {
                res++;
            }
        }
        return res;
    }
}
