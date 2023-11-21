package Thread;

public class Desk {
    // 控制消费者和生产者执行
    public static int flag = 0;
    // 计数，消费者能消耗多少个？
    public static int count = 10;
    // 锁
    public static Object lock = new Object();
}
