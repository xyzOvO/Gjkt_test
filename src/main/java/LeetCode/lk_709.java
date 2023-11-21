package LeetCode;

public class lk_709 {
    public static void main(String[] args) {
        char[] s1 = {'1', '1'};
        String s11 = "s1s1s1dddD";
        s11.toLowerCase();// 转换为小写字母
        s11.toUpperCase();// 转换为大写字母
    }

    public String toLowerCase(String s) {

        char[] schar = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (schar[i] >= 'A' && schar[i] <= 'Z') schar[i] |= 32;
        }
        return new String(schar);
    }
}
