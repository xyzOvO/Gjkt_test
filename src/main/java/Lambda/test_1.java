package Lambda;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author xyz66 Email:2910223554@qq.com
 * @date 2023/11/21 16:14
 */
public class test_1 {
    @Test
    public void cs_1() {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        List<String> longNames = new ArrayList<>();
        for (String name : names) {
            if (name.length() >= 5) {
                longNames.add(name);
            }
        }
        System.out.println(longNames.toString());
    }

    @Test
    public void cs_2() {
        // 使用Lambda表达式和Stream API的filter方法进行筛选：
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        List<Integer> list = Arrays.asList(2,3,1,9);
        List<String> longNames = names.stream()
                .filter(name -> name.length() >= 5)
                .collect(Collectors.toList());
        System.out.println(longNames.toString());
        // 使用Lambda表达式的map方法，可以对集合中的元素进行转换或映射操作。
        List<String> upperCaseNames = names.stream()
                .map(name -> name.toUpperCase())
                .collect(Collectors.toList());
        System.out.println(upperCaseNames);
        // 使用Lambda表达式的sorted方法，可以传递一个比较器，对集合中的元素进行排序。
        List<Integer> sortedNames = list.stream()
                .sorted((o1, o2 )-> o1.compareTo(o2))
                .collect(Collectors.toList());
        System.out.println(sortedNames);
    }

    @Test
    public void cs_3(){
        Integer i = 2;
        Integer j = 3;
        // 比较函数
        System.out.println(i.compareTo(3));
    }
    @Test
    public void cs_4(){
        teset_2 teset2 = () ->{
            System.out.println("Lambda测试");
        };
    }

}
