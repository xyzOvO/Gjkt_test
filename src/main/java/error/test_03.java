package error;

public class test_03 {
    public static void main(String[] args) {
        System.out.println(isIP("192.1681.0.1"));
    }

    // 判断ip地址
    public static boolean isIP(String input) {
        String[] s = input.split("\\.");// 正则表达式分割字符串
        if (s.length != 4) {
            return false;
        }
        for (String s1 : s) {
            try {
                int num = Integer.parseInt(s1);
                if (num < 0 || num > 255) {
                    throw new NumberFormatException("IP地址格式错误！！！");
                }
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
        return true;
    }
}
