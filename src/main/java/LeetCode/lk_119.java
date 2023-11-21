package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class lk_119 {
    public static void main(String[] args) {
        getRow(3);
    }

    public static List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList<>();
        int pre = 1;
        res.add(1);// 0 第一行构建
        // 第几层
        for (int i = 1; i <= rowIndex; i++) {
            // 进行构建
            // 从第三层开始进入->1 2 1
            for (int j = 1; j < i; j++) {
                int temp = res.get(j);// 记录下标j的值
                res.set(j, pre + res.get(j));// 替换
                pre = temp;// 记录覆盖前
            }
            res.add(1);
        }
        return res;
    }
}

