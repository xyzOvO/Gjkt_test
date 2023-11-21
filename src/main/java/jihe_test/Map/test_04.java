package jihe_test.Map;

import java.util.*;

public class test_04 {
    public static void main(String[] args) {
        Map<String, List<String>> map = new HashMap<>();
        List<String> list1 = new ArrayList<>();
        Collections.addAll(list1,"1","2","3","4");
        map.put("自然数",list1);
        System.out.println(map);

        for (String s : list1) {
            System.out.println(s);
        }

        map.forEach((k,v)->System.out.println(k+v));
    }
}
