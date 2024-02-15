package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class lk_206 {
    public static void main(String[] args) {

    }

    //    public ListNode reverseList(ListNode head) {
//        //递归终止条件是当前为空，或者下一个节点为空
//        if (head == null || head.next == null) {
//            return head;
//        }
//        //这里的cur就是最后一个节点
//        ListNode cur = reverseList(head.next);
//        //这里请配合动画演示理解
//        //如果链表是 1->2->3->4->5，那么此时的cur就是5
//        //而head是4，head的下一个是5，下下一个是空
//        //所以head.next.next 就是5->4
//        head.next.next = head;
//        //防止链表循环，需要将head.next设置为空
//        head.next = null;
//        //每层递归函数都返回cur，也就是最后一个节点
//        return cur;
//    }
//    public ListNode reverseList(ListNode head) {
//        ListNode pre = null;// 设定为新链表的头结点
//        ListNode cur = head;
//        // 理解
//        while (cur != null) {
//            ListNode temp = cur.next;// 存住下一个链表指针
//            //当前节点指向前一个链表
//            cur.next = pre;
//            // 向前移动指针
//            pre = cur;
//            cur = temp;
//        }
//        return pre;
//    }

    //    public ListNode reverseList(ListNode head) {
//        List<Integer> list = new ArrayList<>();
//        ListNode cur = head;
//        ListNode pre = new ListNode(-1);
//        ListNode end = pre;
//        while (cur != null) {
//            list.add(cur.val);
//            cur = cur.next;
//        }
//        Collections.reverse(list);
//        for (Integer i : list) {
//            ListNode newnode = new ListNode(i);
//            end.next = newnode;
//            end = end.next;
//        }
//        return pre.next;
//    }
    public ListNode reverseList(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode cur = head;// 设定为新链表的头结点
        // 定位到原链表尾部
        while (cur != null) {
            list.add(cur.val);// 用集合存放原链表的值
            cur = cur.next;
        }
        Collections.reverse(list);
        // 创建新链表
        ListNode newHead = new ListNode(-1);// -1表示新链表的头结点
        ListNode end = newHead; // 新链表尾部
        for (Integer i : list) {
            ListNode newnode = new ListNode(i);
            end.next = newnode;
            end = end.next;
        }
        return newHead.next;
    }
}

