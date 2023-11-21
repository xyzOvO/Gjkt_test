package jihe_test;

import java.util.LinkedHashSet;
import java.util.Set;

public class test_08 {
    public static void main(String[] args) {
        Set<String> link = new LinkedHashSet<>();
        link.add("2");
        link.add("3");
        link.add("3");
        link.add("4");
        link.add("3");
        System.out.println(link);
    }
}
