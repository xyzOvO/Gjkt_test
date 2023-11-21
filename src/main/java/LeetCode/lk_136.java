package LeetCode;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class lk_136 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 4, 2};
        lk_169 s1 = new lk_169();
//        s1.sort1(arr,0,arr.length-1);
        long l = 1L;
        double d = 3.3;
        String s = "";
        boolean a =true;

    }
    public int add(int a,String b){return 1;}
    public int add(String b,int a){return 1;}



    public int singleNumber(int[] nums) {
        int len = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            Integer count = map.get(num);
            count = count == null ? 1 : ++count;
            map.put(num, count);
        }
        Set<Integer> keys = map.keySet();
        for (Integer key : keys) {
            if (map.get(key).equals(1)) {
                return key;
            }
        }
        return -1;
    }
}

