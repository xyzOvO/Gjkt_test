package LeetCode;

/**
 * @author xyz66 Email:2910223554@qq.com
 * @date 2023/11/8 9:24
 */
public class lk_2609 {
    public static void main(String[] args) {

    }

    //    public int findTheLongestBalancedSubstring(String s) {
//        int n = s.length();
//        int ans = 0;
//        for (int i = 0; i < n; ++i) {
//            for (int j = i; j < n; ++j) {
//                if (check(s, i, j)) {
//                    ans = Math.max(ans, j - i + 1);
//                }
//            }
//        }
//        return ans;
//    }
//
//    private boolean check(String s, int i, int j) {
//        int cnt = 0;
//        for (int k = i; k <= j; ++k) {
//            if (s.charAt(k) == '1') {
//                ++cnt;
//            } else if (cnt > 0) {
//                return false;
//            }
//        }
//        return cnt * 2 == j - i + 1;
//    }
    public int findTheLongestBalancedSubstring(String s) {
        int res = 0;
        int zeroPos = 0;    // 连续0的起点，初始为0【假设首个字符为0】
        int onePos = 0;     // 连续1的起点，初始为0【假设首个字符为1】
        int pos = zeroPos;  // 当前遍历位置
        int n = s.length();
        while (pos < n) {
            while (pos < n && s.charAt(pos) == '0') pos++;    // 找到连续0之后首个1的位置
            int zeroCnt = pos - zeroPos;                    // 计算这一段连续0的个数
            onePos = pos;   // 更新连续1起点
            while (pos < n && s.charAt(pos) == '1') pos++;     // 找到连续1之后首个0的位置
            int oneCnt = pos - onePos;                       // 计算这一段连续1的个数
            res = Math.max(res, Math.min(zeroCnt, oneCnt) * 2);     // 平衡子串为连续0和连续1中最小数目的两倍
            zeroPos = pos;  // 更新连续0的起点
        }
        return res;
    }
}
