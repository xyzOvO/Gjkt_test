package LeetCode;

import org.junit.Test;

import java.util.*;

/**
 * @author Gjkt
 * @description
 * @since 2024/1/3 14:47
 */
public class lk_3 {
    //    public int lengthOfLongestSubstring(String s) {
//        int len = s.length();
//        int res = 0;
//        // 滑动窗口
//        HashMap<Character,Integer> map = new HashMap<>();
//        int left = -1;// 可能就一个字符
//        for (int right = 0; right < len; right++) {
//            if (map.containsKey(s.charAt(right))){
//                // 重复
////                left = map.get(s.charAt(right));// 更新左边界，1->0错误
//                left = Math.max(left,map.get(s.charAt(right)));// 更新左边界,只能向右靠
//            }
//            map.put(s.charAt(right),right);
//            res = Math.max(res,right-left);
//        }
//        return res;
//    }
    //不用HashMap
//    public int lengthOfLongestSubstring(String s) {
//        int len = s.length();
//        if (len == 0 || len == 1) return len;// 卡测试用例
//        int index = 0;
//        int r = 1;// 右边界
//        int max = 0;
//        for (int i = 1; i < len; i++) {
//            index = s.indexOf(s.charAt(i), i - r);// 要找这个字符，i-r是定下标
//            if (index < i) {
//                r = i - index;// 字符出现过，更新右边界
//            } else {
//                r++;// 向右走
//            }
//            max = Math.max(max, r);
//        }
//        return max;
//    }
    public int lengthOfLongestSubstring(String s) {
        // 队列
        Queue<Character> queue = new LinkedList<>();
        int len = s.length();
        if (len == 0 || len == 1) return len;// 卡测试用例  
        int res = -1;
        for (char c : s.toCharArray()) {
            while (queue.contains(c)){
                queue.poll();// 有重复，队列头出列到该字符
            }
            queue.add(c);// 入队
            res = Math.max(res,queue.size());// 记录队列最长
        }
        return res;
    }

    @Test
    public void test() {
        System.out.println(lengthOfLongestSubstring("abba"));
    }

    @Test
    public void test2() {
        // indexOf
        String s = "abcd";
        System.out.println(s.indexOf("c", 4));
    }
}
