package LeetCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class lk_20 {
    public static void main(String[] args) {

    }

    public boolean isValid(String s) {
        LinkedList<Character> stack = new LinkedList<>();
        int len = s.length();
        if (len == 0) return true;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(')');
            } else if (c == '{') {
                stack.push('}');
            } else if (c == '[') {
                stack.push(']');
            } else if (stack.isEmpty() || c != stack.pop()) {
                return false;
            }
        }
        return stack.isEmpty();
    }
}

