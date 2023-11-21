package LeetCode;

public class lk_682 {
    public static void main(String[] args) {
        String[] strings = {"5", "2", "C", "D", "+"};
        System.out.println(calPoints(strings));
    }

    public static int calPoints(String[] ops) {
        // 创建一个整数数组，用于存储每个操作的得分
        int[] arr = new int[ops.length];
        // 初始化数组索引
        int i = 0;

        // 遍历操作数组
        for (String s : ops) {
            if (s.equals("+")) {
                // 如果操作是 "+"，则将前两轮的得分相加，并存储到当前轮
                arr[i] = arr[i - 1] + arr[i - 2];
                i++;
            } else if (s.equals("D")) {
                // 如果操作是 "D"，则将上一轮得分翻倍，并存储到当前轮
                arr[i] = 2 * arr[i - 1];
                i++;
            } else if (s.equals("C")) {
                // 如果操作是 "C"，则取消上一轮的得分（将其置为0），并将索引回退一步
                arr[i - 1] = 0;
                i--;
            } else {
                // 如果操作是一个数字字符串，则将其解析为整数，并存储到当前轮
                arr[i] = Integer.valueOf(s);
                i++;
            }
        }

        // 计算并返回总得分
        int sum = 0;
        for (int j = 0; j < arr.length; j++) {
            sum += arr[j];
        }
        return sum;
    }
}

