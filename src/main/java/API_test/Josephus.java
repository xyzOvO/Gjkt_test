package API_test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Josephus {
    public static int findM(int n, int k, List<Integer> lk) {
        // 约瑟夫环
        // 注意：按照出列顺序输出各人编号(队列！！！)
        // 找m的值
        for (int m = 1; m < n; m++) {
            int count = 0;
            int index = 0;
            List<Integer> res = new LinkedList<>();// 模拟圆桌
            LinkedList<Integer> queue = new LinkedList<>();// 出队队列
            // 模拟圆桌编号
            for (int i = 1; i <= n; i++) {
                res.add(i);
            }
            // 模拟出列过程（全出对比）
            while (res.size() !=0) {
                count++;
                if (count == m) {
                    count = 0;
                    queue.addLast(res.get(index));
                    res.remove(index);
                } else {
                    index = (index + 1) % res.size();// 循环
                }
            }
            System.out.println(queue);
            if (queue.subList(n-k,n).equals(lk)) {
                return m;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int n = 8;
        int k = 4;
        List<Integer> lk = new LinkedList<>();
//        lk.add(6);
//        lk.add(2);
        lk.add(7);
        lk.add(5);
        lk.add(1);
        lk.add(4);

        int m = findM(n, k, lk);
        System.out.println("m的值为：" + m);
    }
}

