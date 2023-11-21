package LeetCode;

/**
 * @author xyz66 Email:2910223554@qq.com
 * @date 2023/11/6 11:45
 */
public class lk_318 {
    public static void main(String[] args) {
        String[] s = {"abcw","baz","foo","bar","xtfn","abcdef"};
        maxProduct(s);
    }
    public static int maxProduct(String[] words) {
        int[] bits = new int[words.length];
        int res = 0;
        // 将字符串转换为bit数组
        for (int i = 0; i < words.length; i++) {
            char[] chars = words[i].toCharArray();
            for (int j = 0; j < chars.length; j++) {
                bits[i] |= 1 << (chars[j] - 'a'); // 关键记录
            }
        }
        //双重for循环找到最大
        for (int i = 0; i < bits.length; i++) {
            for (int j = i + 1; j < bits.length; j++) {
                if((bits[i] & bits[j]) == 0)
                    res = Math.max(res, words[i].length() * words[j].length());
            }
        }
        return res;
    }
}
