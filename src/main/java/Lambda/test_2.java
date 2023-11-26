package Lambda;

import Thread.ex3.MyRunable;
import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author xyz66 Email:2910223554@qq.com
 * @since 2023/11/26 18:06
 */
public class test_2 {
    @Test
    public void cs1() {
        List<Integer> list = Arrays.asList(2, 3, 1, 1, 5, 2, 3);
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        System.out.println(list);

        List<Integer> list1 = Arrays.asList(2, 3, 1, 1, 5, 2, 3);
        Collections.sort(list1, (o1, o2) -> o1.compareTo(o2));
        System.out.println(list1);
    }
    @Test
    public void cs2(){
        // 过滤
        List<String> list = Arrays.asList("app","abc","cba");
        List<String> list2 = new ArrayList<>();
        for (String s : list) {
            if (s.startsWith("a")){
                list2.add(s);
            }
        }
        System.out.println(list2);
        List<String> c = list.stream()
                .filter(s -> s.startsWith("a"))
                .collect(Collectors.toList());
        System.out.println(c);
    }
    @Test
    public void cs3(){
        // 映射
        List<String> list = Arrays.asList("app4","abc55","cba666");
        List<Integer> collect = list.stream()
                .map(s -> s.length())
                .collect(Collectors.toList());
        System.out.println(collect);
    }
    @Test
    public void cs4(){
        // 求和
        List<Integer> list = Arrays.asList(2, 3, 1, 1, 5, 2, 3);
        Integer reduce = list.stream()
                // 初始0 取的是a,记的是b
                .reduce(0, (a, b) -> a + b);
        
        System.out.println(reduce);
    }
    
    interface My{
        public void cs(String s);
    }
    @Test
    public void cs5(){
        // 实现接口
        My my = (s)-> System.out.println(s);
        my.cs("你好！");
    }
    @Test
    public void cs6(){
        String s = "Hello World!";
        Optional.ofNullable(s).map(String::toUpperCase).ifPresent(System.out::println);
    }
}
