/**
 * @Description: 142. 环形链表 II
 * 给定一个链表，返回链表开始入环的第一个节点。 如果链表无环，则返回 null
来源：https://leetcode-cn.com/problems/linked-list-cycle-ii/description/
 * @Create: 2020-04-27 23:27
 **/
public class Test {



    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            //速度是二倍 一个肯定会追上另一个
            if (fast == slow) {
                break;
            }
        }
        //1因为while退出 说明是没有环的
        if (fast == null || fast.next == null) {
            return null;
        }
        //2因为if的break退出 说明是相遇了有环 同时走 中间就是入口
        slow= head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }




}
