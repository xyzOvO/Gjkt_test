package jihe_test;

import java.util.Set;
import java.util.TreeSet;

public class test_06 {
    public static void main(String[] args) {
//        Set<Integer> set = new HashSet<>();//多态，创建了一个HashSet的集合对象。经典代码 HashSet:无序，不重复，无索引
//        Set<Integer> set = new LinkedHashSet<>();//有序 不重复 无索引
        Set<Integer> set = new TreeSet<>();//可排序（默认升序） 不重复 无索引
        set.add(6);
        set.add(2);
        set.add(1);
        set.add(1);
        set.add(3);
        System.out.println(set);
    }
}
