package jihe_test;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class test_09 {
    public static void main(String[] args) {
        Set<String> set1 = new TreeSet<>();
        set1.add("a");
        set1.add("b");
        set1.add("c");
        set1.add("1");

        Set<Student> set2 = new TreeSet<>((o1, o2) -> Double.compare(o1.getHeight(),o2.getHeight()));
        System.out.println(set1);
    }
}
