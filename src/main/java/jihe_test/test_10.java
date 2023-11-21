package jihe_test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class test_10 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("12");
        list.add("13");
        list.add("22");
        list.add("32");
        list.add("42");
        list.add("52");
        System.out.println(list);
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String name = it.next();
            if (name.contains("2")){//String方法，看是否含有“1”
                // list.remove(name); //并发修改异常错误
                it.remove(); //删除迭代器当前遍历到的数据，每修改一个数据后，相当于在底层做了i--
            }
        }
//        for (int i = 0; i < list.size(); i++) {
//            String name = list.get(i);
//            if (name.contains("1")){
//                list.remove(name);
//               i--;//解决并发关键
//            }
//        }
//        for (int i = list.size()-1; i >= 0; i--) {
//            String name = list.get(i);
//            if (name.contains("1")){
//                list.remove(name);
//            }
//        }
        System.out.println(list);
    }
}
