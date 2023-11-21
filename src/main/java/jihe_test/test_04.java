package jihe_test;

import java.util.LinkedList;

public class test_04 {
    public static void main(String[] args) {
        LinkedList<String> stack = new LinkedList<>();
        //push
        stack.push("第1颗子弹");
        stack.push("第2颗子弹");
        stack.push("第3颗子弹");
        System.out.println(stack);
        //pop
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack);
    }
}
