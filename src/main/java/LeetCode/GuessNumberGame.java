package LeetCode;

import java.util.Random;
import java.util.Scanner;

public class GuessNumberGame {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1; // 生成1到100之间的随机数
        int guess;
        int attempts = 0;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("已经生成了一个1到100之间的随机数，猜:");
        
        do {
            System.out.print("请输入你猜测的数字：");
            guess = scanner.nextInt();
            attempts++;
            
            if (guess > randomNumber) {
                System.out.println("猜大了！再试一次。");
            } else if (guess < randomNumber) {
                System.out.println("猜小了！再试一次。");
            } else {
                System.out.println("恭喜你猜对了！你用了 " + attempts + " 次猜中了数字 " + randomNumber + "。");
            }
        } while (guess != randomNumber);
        
        scanner.close();
    }
}
