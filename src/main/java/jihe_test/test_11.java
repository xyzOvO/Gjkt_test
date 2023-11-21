package jihe_test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class test_11 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Collections.addAll(list,"1","2","4","3","桃花","♣");//批量添加
        Collections.shuffle(list);
        System.out.println(list);
    }
}
