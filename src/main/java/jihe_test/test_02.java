package jihe_test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class test_02 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("你好1");
        list.add("你好2");
        list.add("你好4");
        Iterator<String> it = list.iterator();
//        while(it.hasNext()){
//            System.out.println(it.next());
//        }
//        list.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//
//        });
        list.forEach(System.out::println);

        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.println(s);
        }
    }
}
