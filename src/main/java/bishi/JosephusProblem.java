package bishi;

public class JosephusProblem {
    public static boolean isJosephusSequence(int n, int k, int[] specifiedNumbers) {
        Node head = new Node(1);
        Node current = head;

        // 创建循环链表
        for (int i = 2; i <= n; i++) {
            current.next = new Node(i);
            current = current.next;
        }
        current.next = head;

        current = head;

        // 剩下的节点即为Josephus(n, m)排列的最后k个数
        int[] lastKNumbers = new int[k];

        // 移动到链表的第一个节点
        current = current.next;

        // 把最后k个数保存在数组中
        for (int i = 0; i < k; i++) {
            lastKNumbers[i] = current.data;
            current = current.next;
        }

        for (int m = 1; m < n; m++) {
            boolean found = true;
            
            // 检查当前的k个数是否与指定的k个数相同
            for (int i = 0; i < k; i++) {
                if (lastKNumbers[i] != specifiedNumbers[i] + m) {
                    found = false;
                    break;
                }
            }
            if (found) {
                return true; // 找到符合条件的m值
            }
            
            // 更新lastKNumbers数组
            for (int i = 0; i < k - 1; i++) {
                lastKNumbers[i] = lastKNumbers[i + 1];
            }
            lastKNumbers[k - 1] = current.data;
            
            // 移动current指针
            current = current.next;
        }
        return false; // 未找到符合条件的m值
    }

    public static void main(String[] args) {
        int n = 7;
        int k = 4;
        int[] specifiedNumbers = {7, 5, 1, 4};

        if (isJosephusSequence(n, k, specifiedNumbers)) {
            System.out.println("存在符合条件的m值。");
        } else {
            System.out.println("未找到符合条件的m值。");
        }
    }
}

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}