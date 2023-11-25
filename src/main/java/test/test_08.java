package test;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author xyz66 Email:2910223554@qq.com
 * @since 2023/11/26 0:09
 */
public class test_08 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("1","1","2","2","3","2","1"));
        // 1. 去重-双指针
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    list.remove(j);
                    j--;
                }
            }
        }
        System.out.println(list);
        // 2. 去重-set
        List<String> list2 = new ArrayList<>(Arrays.asList("1","1","2","2","3","2","1"));
        Set<String> set = new HashSet<>(list2);
        List<String> collect = new ArrayList<>(set);
        System.out.println(collect);
        // 3. 去重-hashmap
        List<String> list3 = new ArrayList<>(Arrays.asList("1","1","2","2","3","2","1"));
        Map<String, Integer> map = new HashMap<>();
        for (String s : list3) {
            if (map.containsKey(s)) {
                map.put(s, map.get(s) + 1);
            } else {
                map.put(s, 1);
            }
        }
        System.out.println(map);
    }
}
