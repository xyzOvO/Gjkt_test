package jihe_test;

import java.util.LinkedList;

public class test_03 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("你好1");
        list.add("你好2");
        list.add("你好3");
        System.out.println(list);
        for (String s : list) {
            System.out.println(s);
        }
        list.addFirst("前面加入1");
        list.forEach(System.out::println);
    }
}
