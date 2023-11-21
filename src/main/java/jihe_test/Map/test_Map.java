package jihe_test.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class test_Map {
    public static void main(String[] args) {
//        Map<String,Integer> map = new HashMap<>();//经典代码
        Map<String,Integer> map = new LinkedHashMap<>();
        map.put("手表",100);
        map.put("手表",200);
        map.put("手表",220);// 后面重复的数据会覆盖前面的数据（键）
        map.put("手机",2);
        map.put(null,null);
        System.out.println(map.get("手表"));

        Map<Integer,String> map1 = new TreeMap<>();
        map1.put(2,"1");
        map1.put(1,"1");
        map1.put(3,"3");
        System.out.println(map1);// 按键升序
        String s = new String();
        System.out.println(s.contains(""));
        System.out.println(map.keySet());
    }
}
