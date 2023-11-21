package LeetCode;

public class lk_459 {
    public static void main(String[] args) {
        repeatedSubstringPattern("ababc");
        // abababab -> bababa
        // ababcababc -> babcabab
        // abcabcabcabc -> bcabcabcab
    }
    public static boolean repeatedSubstringPattern(String s) {
        String str = s+s;
        return str.substring(1,str.length()-1).contains(s);

    }

}
