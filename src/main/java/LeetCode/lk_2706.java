package LeetCode;

/**
 * @author Gjkt
 * @description
 * @since 2023/12/29 9:25
 */

import java.util.Arrays;

/**
 * 给你一个整数数组 prices ，它表示一个商店里若干巧克力的价格。同时给你一个整数 money ，表示你一开始拥有的钱数。
 * <p>
 * 你必须购买 恰好 两块巧克力，而且剩余的钱数必须是 非负数 。同时你想最小化购买两块巧克力的总花费。
 * <p>
 * 请你返回在购买两块巧克力后，最多能剩下多少钱。如果购买任意两块巧克力都超过了你拥有的钱，请你返回 money 。注意剩余钱数必须是非负数。
 */
public class lk_2706 {
    /**
     * 不能买同一块巧克力
     */
    public int buyChoco(int[] prices, int money) {
        int len = prices.length;
        int res = Integer.MIN_VALUE;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                int sum = prices[i] + prices[j];
                res = Math.max(res, money - sum);
            }
        }
        if (res < 0) {
            return money;
        }
        return res;
    }

    public int buyChoco1(int[] prices, int money) {
        // 排序
        Arrays.sort(prices);
        int sum = prices[0] + prices[1];
        return money < sum ? money : money - sum;
    }

    public int buyChoco2(int[] prices, int money) {
        // 一次遍历-巧
        int a = 100, b = 100;
        for (int x : prices) {
            if (x < a) {
                // 找最小的
                b = a;// 把当前的小值赋值给b
                a = x;
            } else if (x < b) {
                // 找第二小的,
                b = x;
            }
        }
        int cost = a + b;
        return money < cost ? money : money - cost;
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 3, 1, 1, 3};
        int money = 3;
        System.out.println(new lk_2706().buyChoco2(arr, money));
    }
}
