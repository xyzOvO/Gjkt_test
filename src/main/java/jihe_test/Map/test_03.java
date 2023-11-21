package jihe_test.Map;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class test_03 {
    public static void main(String[] args) {
        Map<String,Integer> map = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;
            }
        });

    }
}
