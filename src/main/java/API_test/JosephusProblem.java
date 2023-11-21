package API_test;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class JosephusProblem {
    public static int findM(int n, int k, int[] specifiedNumbers) {
        Node head = new Node(1);
        Node cur = head;
        for (int i = 2; i <= n; i++) {
            cur.next = new Node(i);
            cur = cur.next;
        }
        cur.next = head; // 构建循环链表
        cur = head;
        // 模拟出队
        while (cur.next != cur) {
            for (int i = 1; i < k - 1; i++) {
                cur = cur.next;
            }
            // 删除节点
            Node toRemove = cur.next;
            cur.next = toRemove.next;
            toRemove.next = null;
            cur = cur.next;
        }
        // 剩下的节点即为Josephus(n, m)排列的最后k个数
        int[] lastKNumbers = new int[k];// 队列
        cur = cur.next;
        for (int i = 0; i < k; i++) {
            lastKNumbers[i] = cur.data;
            cur = cur.next;
        }
        for (int m = 1; m < n; m++) {
            boolean found = true;
            for (int i = 0; i < k; i++) {
                if (lastKNumbers[i] != specifiedNumbers[i] + m) {
                    found = false;
                    break;
                }
            }
            if (found) {
                return m;
            }
        }
        return -1; // 未找到符合条件的m
    }

    public static void main(String[] args) {
        int n = 7;
        int k = 4;
        int[] specifiedNumbers = {7, 5, 1, 4};
        int m = findM(n, k, specifiedNumbers);
        if (m != -1) {
            System.out.println("找到符合条件的 m 值为: " + m);
        } else {
            System.out.println("未找到符合条件的 m 值。");
        }
    }
}