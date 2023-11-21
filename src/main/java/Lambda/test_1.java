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
        // 调用函数式接口的方法来使用Lambda表达式：
        teset2.doString();
    }

    @Test
    public void cs_5(){
        // 使用Lambda表达式创建线程（使用Runnable接口）：
        Runnable task = () -> {
            System.out.println("Runnable Thread:"+Thread.currentThread().getName());
        };
        Thread thread = new Thread(task);
        thread.start();
        /**
         * Lambda表达式有如下优势：
         * 简洁性：使用Lambda表达式可以避免编写繁琐的匿名内部类，使得线程和并发编程的代码更加简洁、易读。
         * 可读性：Lambda表达式将关注点集中在线程执行的逻辑上，使代码更加清晰和易于理解。
         * 灵活性：Lambda表达式可以轻松地实现自定义的线程执行逻辑，并与Java中的函数式接口配合使用，实现更加灵活的编程模型。
         * 并行处理：使用Lambda表达式结合ExecutorService和Callable，可以更方便地实现并行处理和异步任务执行。
         */
    }

    @Test
    public void cs_6(){

    }

}
