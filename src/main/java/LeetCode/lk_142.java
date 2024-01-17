package LeetCode;

/**
 * @author Gjkt
 * @description
 * @since 2024/1/17 13:46
 */
public class lk_142 {
    public ListNode detectCycle(ListNode head) {
        // 返回节点
        ListNode fast = head;
        ListNode slow = head;
        ListNode res = null;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                res = head;
                // 从头开始遍历，定位到第一个相交节点
                while (res != slow) {
                    res = res.next;
                    slow = slow.next;
                }
                return res;
            }
        }
        return res;
    }
}
