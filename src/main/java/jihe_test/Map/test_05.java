package jihe_test.Map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class test_05 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        List<String> list1 = new ArrayList<>();
        Collections.addAll(list,"张无忌","张三丰","周芷若","赵敏","张强");

        // 开始使用Stream流来解决
        List<String> list2 = list.stream().filter(s -> s.startsWith("张"))
                .filter(a -> a.length() == 3).collect(Collectors.toList());
        System.out.println(list2);
    }
}
