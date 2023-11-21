package jihe_test.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class test_01 {
    public static void main(String[] args) {
        Map<String,Double> map = new HashMap<>();
        map.put("蜘蛛精",162.5);
        map.put("蜘蛛精",163.5);
        map.put("紫霞",168.5);
        map.put("至尊宝",169.5);
        map.forEach((k,v)->{
            System.out.println(k+":"+v);
        });
    }
}
