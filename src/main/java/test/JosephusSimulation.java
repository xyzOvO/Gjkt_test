package test;

public class JosephusSimulation {
    static class Node {
        int value;
        Node next;
        Node(int value) {
            this.value = value;
        }
    }
    public static void josephus(int n, int m, int k) {
        Node head = new Node(1);
        Node cur = head;
        for (int i = 2; i <= n; i++) {
            cur.next = new Node(i);
            cur = cur.next;
        }
        cur.next = head;// 循环链表
        // 定位到第一个报数的人
        Node start = head;
        while (start.next != head) {
            start = start.next;
        }
        // 报数并出列，直到只剩下k个人
        while (n > k) {
            // 找到要出列的人的前一个人
            for (int i = 0; i < m - 1; i++) {
                start = start.next;
            }
            // 输出出列的人的编号
            System.out.print(start.next.value + " ");
            // 将出列的人从链表中删除
            start.next = start.next.next;
            n--;
        }
        // 输出剩下的人的编号
        while (start.next != start) {
            start = start.next;
            System.out.print(start.value + " ");
        }
    }

    public static void main(String[] args) {
        int n = 7; // 总人数
        int m = 3; // 报数的规则
        int k = 3; // 剩下的人数
        josephus(n, m, k);
    }
}
