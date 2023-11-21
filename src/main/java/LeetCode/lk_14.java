package LeetCode;

public class lk_14 {
    public static void main(String[] args) {

    }

    public String longestCommonPrefix(String[] strs) {
        int len = strs.length;
        if (len == 0) return "";
        String res;
        String str = strs[0];
        int reslong = len;
        // 遍历第几个字符串
        for (int i = 1; i < strs.length; i++) {
            // 遍历字符串内部字符
            int j = 0;
            for (; j < strs[i].length(); j++) {
                String s = strs[i];
                if (str.charAt(j) != s.charAt(j)) {
                    // 不匹配进入下一个字符串
                    break;
                }
            }
            reslong = j;
        }
        return str.substring(0, reslong);
    }
}

