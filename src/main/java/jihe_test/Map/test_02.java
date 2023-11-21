package jihe_test.Map;

import java.util.*;

public class test_02 {
    public static void main(String[] args) {
        List<String> data = new ArrayList<>();
        String[] s = {"A","test.B","C","D"};
        Random random = new Random();
        for (int i = 1; i <=80; i++) {
            int index = random.nextInt(4);
            data.add(s[index]);
        }
        System.out.println(data);
        //统计
        Map<String,Integer> rs = new HashMap<>();

        for (String s1 : data) {
            if (rs.containsKey(s1)){
                rs.put(s1,rs.get(s1)+1);
            }else{
                rs.put(s1,1);
            }
        }
        System.out.println(rs);
    }
}
