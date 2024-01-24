package LeetCode;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Gjkt
 * @description 同构字符串
 * @since 2024/1/24 20:22
 */
public class lk_205 {
    public boolean isIsomorphic(String s, String t) {
        int len = s.length();// s和t的长度相等
        Map<Character, Character> map = new HashMap<>();
        for (int i = 0; i < len; i++) {
            if (map.containsKey(s.charAt(i))) {
                if (map.get(s.charAt(i)) != t.charAt(i)) {
                    // 映射对应不上
                    return false;
                }
                // 关键：跳下一个字符，不然下面报空指针
                continue;
            }
            // 判断当前字符对应的t中的字符已经和s前面的某个字符建立过映射关系
            if (map.containsValue(t.charAt(i))) return false;
            //建立s,t中对应位置的映射关系
            map.put(s.charAt(i), t.charAt(i));
        }
        return true;
    }

    @Test
    public void test() {
        System.out.println(isIsomorphic("badc", "baba"));
    }

    public static void main(String[] args) {
        Character a = 'a';
        char a1 = 'a';
        System.out.println(a == a1);
    }
}
