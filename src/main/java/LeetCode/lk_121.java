package LeetCode;

public class lk_121 {
    public static void main(String[] args) {

    }

    public int maxProfit(int[] prices) {
        int len=prices.length;
        if(len<2) return 0;
        // 二列，已买入（状态0），没买入(状态1)
        int[][] dp = new int[len][2];
        // 初始化
        // 已买入后存在：1.继续持有 2.卖出
        // 没买入后存在：1.保留成本 2.买入
        dp[0][0]=0;
        dp[0][1]=-prices[0];//
        for(int i = 1;i<len;i++){
            dp[i][0]=Math.max(dp[i-1][0],dp[i-1][1]+prices[i]);
            dp[i][1]=Math.max(dp[i-1][1],-prices[i]);
        }
        return dp[len-1][0];
    }
}


