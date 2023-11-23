package Stream;

import javafx.beans.binding.ObjectExpression;
import org.apache.commons.lang3.ObjectUtils;
import org.junit.Before;
import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author xyz66 Email:2910223554@qq.com
 * @date 2023/11/21 17:22
 */
public class test_1 {
    @Before
    public void init(){
        System.out.println("-----------------");
    }
    @Test
    public void cs_1() {
        // 1.Collection体系的集合可以使用默认方法stream()生成流：
        List<String> list = new ArrayList<String>();
        list.add("1");
        Stream<String> listStream = list.stream();
        System.out.println(listStream.collect(Collectors.toList()).toString());
    }

    @Test
    public void cs_2() {
        // 2.Map体系的集合间接的生成流：
        Map<String, Integer> map = new HashMap<String, Integer>();
        Stream<String> keyStream = map.keySet().stream(); // 通过map.keySet().stream()方法生成包含所有键的流
        Stream<Integer> valueStream = map.values().stream(); // 通过map.values().stream()方法生成包含所有值的流
        Stream<Map.Entry<String, Integer>> entryStream = map.entrySet().stream(); // 通过map.entrySet().stream()方法生成包含所有键值对的流
    }
    @Test
    public void cs_3(){
        // 3.数组可以通过Arrays中的静态方法stream生成流：
        String[] cs = {"1","2","3"};
        Stream<String> stream = Arrays.stream(cs);
        System.out.println(stream.collect(Collectors.toList()).toString());
    }
    @Test
    public void cs_4(){
        // 4.同种数据类型的多个数据可以通过Stream接口的静态方法of(T... values)生成流：
        Stream<String> strArrayStream2 = Stream.of("hello", "world", "java");
        Stream<Integer> intStream = Stream.of(10, 20, 30);
        /**
         * 注：该方法的形参是一个可变参数，可以传递零散的数据，也可以传递数组。
         * 但数组必须是引用数据类型的，传递基本数据类型，会把整个数组当作一个元素，放到Stream当中。
         */
        int[] cs = {1,2,3};
//        Stream<Integer> intStream2 = Stream.of(cs);// 直接报错
//        System.out.println(intStream2.collect(Collectors.toList()).toString());
    }
    @Test
    public void cs_5(){
        Integer[] nums = {1,2,3,4,5,6,7,8,9,10};
//        Stream<Integer>
        List<Integer> list = Arrays.stream(nums)
                .map(num -> num * 2)
                .collect(Collectors.toList());
        System.out.println(list.toString());
    }

}
