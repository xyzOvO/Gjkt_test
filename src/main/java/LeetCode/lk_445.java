package LeetCode;

public class lk_445 {
    public static void main(String[] args) {

    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // 首先翻转两个链表，使得低位在前，高位在后
        ListNode l1pre = reverseList(l1);
        ListNode l2pre = reverseList(l2);

        // 调用 addTwoNumbers2 进行两个链表的相加
        ListNode res = addTwoNumbers2(l1pre, l2pre);

        // 最后再次翻转结果链表，使得高位在前，低位在后
        return reverseList(res);
    }

    // 翻转链表
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode cur = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return cur;
    }

    // 实际的链表相加操作
    public ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
        ListNode pre = new ListNode(0); // 创建一个虚拟头节点作为结果链表的起始点
        ListNode cur = pre; // 当前节点从虚拟头节点开始
        int carry = 0; // 进位，初始为0

        // 遍历两个链表，直到两个链表都为空
        while (l1 != null || l2 != null) {
            int x = l1 == null ? 0 : l1.val; // 如果链表1为空，用0代替
            int y = l2 == null ? 0 : l2.val; // 如果链表2为空，用0代替
            int sum = x + y + carry; // 当前位的和，包括进位
            carry = sum / 10; // 更新进位，取整除法
            sum = sum % 10; // 当前位的值，取余数

            cur.next = new ListNode(sum); // 创建新节点存储当前位的值
            cur = cur.next; // 移动当前节点到下一个节点

            // 移动两个链表的指针，如果链表为空，直接置为null
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }

        // 如果最高位有进位，创建一个新节点来存储进位
        if (carry == 1) {
            cur.next = new ListNode(carry);
        }

        return pre.next; // 返回结果链表的头节点，跳过虚拟头节点
    }

}


