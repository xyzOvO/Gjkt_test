package LeetCode;

import java.util.Arrays;

public class lk_58 {
    public static void main(String[] args) {
        String s = "a";
        char[] qw = s.toCharArray();
        System.out.println(Arrays.toString(qw));
        System.out.println(lengthOfLastWord(s));
    }

    public static int lengthOfLastWord(String s) {
        int len = s.length();
        if (len == 0 || s.equals(null)) {
            return -1;
        }
        char[] chars = s.toCharArray();
        int ins = len - 1;
        int sins = 0;
        while (ins >= 0 && chars[ins] == ' ') {
            ins--;
        }
        sins = ins;
        while (sins >= 0 && chars[sins] != ' ') {
            sins--;
        }
        return ins - sins;
    }
}
