package jihe_test;

import java.util.LinkedList;

public class test_05 {
    public static void main(String[] args) {
        LinkedList<String> queue = new LinkedList<>();
        //入队
        queue.addLast("第1号人");
        queue.addLast("第2号人");
        queue.addLast("第3号人");
        queue.addLast("第4号人");
        System.out.println(queue);
        //出队
        System.out.println(queue.removeFirst());
        System.out.println(queue.removeFirst());
        System.out.println(queue.removeFirst());
        System.out.println(queue);
    }
}
