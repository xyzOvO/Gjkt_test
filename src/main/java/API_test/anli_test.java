package API_test;

import java.text.ParseException;
import java.util.Scanner;

public class anli_test {
    // 正则表达式案例
    public static void main(String[] args) throws ParseException {
        while (true) {
            System.out.println("请输入您的邮箱:");
            Scanner sc = new Scanner(System.in);
            String email = sc.nextLine();
            // @前面数字，字母：\\w{2,}
            // .com.cn 点可能有二个
            // @后面数字，字母：\w{2,20}(\.\w{2,10}){1,2}
            if (email.matches("\\w{2,}@\\w{2,20}(\\.\\w{2,10}){1,2}")) {
                System.out.println("输入正确");
                break;
            } else {
                System.out.println("输入错误");
            }
        }
    }
}

