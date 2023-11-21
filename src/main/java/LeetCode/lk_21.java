package LeetCode;

public class lk_21 {
    public static void main(String[] args) {

    }


    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // 如果一个链表为空，直接返回另一个链表
        if (list1==null) return list2;
        if (list2==null) return list1;
        // 将list1的下一个节点与list2合并，list1就作为新链表的头结点
        if (list1.val<list2.val){
            list1.next = mergeTwoLists(list1.next,list2);
            return list1;
        }else {
            list2.next = mergeTwoLists(list1,list2.next);
            return list2;
        }
    }
}
