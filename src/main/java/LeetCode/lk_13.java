package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class lk_13 {
    public static void main(String[] args) {

    }
    public int romanToInt(String s) {
        Map<String,Integer> map = new HashMap<>();
        // 存入设定
        map.put("I", 1);
        map.put("IV", 4);
        map.put("V", 5);
        map.put("IX", 9);
        map.put("X", 10);
        map.put("XL", 40);
        map.put("L", 50);
        map.put("XC", 90);
        map.put("C", 100);
        map.put("CD", 400);
        map.put("D", 500);
        map.put("CM", 900);
        map.put("M", 1000);

        int sum = 0;
        for (int i = 0; i < s.length();) {
            // 优先判断二位罗马字符
            if (i+1<s.length() && map.containsKey(s.substring(i,i+2))){
                sum += map.get(s.substring(i,i+2));
                i+=2;
            }else {
                // 正常一位罗马字符
                sum += map.get(s.substring(i,i+1));
                i++;
            }
        }
        return sum;
    }
}
