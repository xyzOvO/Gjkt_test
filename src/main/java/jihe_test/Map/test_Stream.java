package jihe_test.Map;

import java.util.*;
import java.util.stream.Stream;

public class test_Stream {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Collections.addAll(list,"你好1","你好2","你好3","你好4");
        Stream<String> stream = list.stream();
        stream.filter(s->s.contains("3")).forEach(s -> System.out.println(s));

        Set<String> set = new HashSet<>();
        Collections.addAll(set,"不好1","不好2","不好3","不好4");
        Stream<String> stream1 = set.stream();

        Map<String,Integer> map = new HashMap<>();
        map.put("古力娜扎",111);
        map.put("古力娜扎2",222);
        map.put("古力娜扎3",333);
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        Stream<Map.Entry<String, Integer>> stream2 = entries.stream();
        stream2.filter(e->e.getKey().contains("3"))
                .forEach(e-> System.out.println(e.getKey()+":"+e.getValue()));



    }
}
