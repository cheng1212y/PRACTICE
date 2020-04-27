/**
 * @Description: 141. 环形链表
 * 给定一个链表，判断链表中是否有环。
 * 为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。 如果 pos 是 -1，则在该链表中没有环

 来源：https://leetcode-cn.com/problems/linked-list-cycle/description/
 * @Create: 2020-04-27 23:23
 **/
public class Test {

    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next !=null) {
            slow = slow.next;
            fast = fast.next.next;
            //速度是二倍 一个肯定会追上另一个
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }






}
