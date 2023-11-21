package test;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;
import java.util.concurrent.CyclicBarrier;

public class test_06 {
    static final String S = "abcqwe";
    int x, y;

    public static void main(String[] args) throws MalformedURLException {
//        System.out.println(x);
        URL u1 = new URL("123");
        URL u2 = new URL("http://www.baidu.com");
        System.out.println(u1);
        System.out.println(u2);
        Thread cs = new Thread();
        CyclicBarrier cyclicBarrier = new CyclicBarrier(3);
    }

    public void moveZeroes(int[] nums) {
        // 例：[0,1,0,3,12]
        int len = nums.length;
        int left = 0;
        for (int right = left + 1; right < len; right++) {
            if (nums[left] == 0 && nums[right] != 0) {
                nums[left] = nums[right];
                nums[right] = 0;
                left++;
            }
        }
    }
//    public void cs_Bean(int x){
//        int x = 1;
//    }
}

