/**
 * @Description: 面试题24. 反转链表
 * 定义一个函数，输入一个链表的头节点，反转该链表并输出反转后链表的头节点。
 *
 * 示例:
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL
来源： https://leetcode-cn.com/problems/fan-zhuan-lian-biao-lcof/
 * @Create: 2020-04-28 22:32
 **/
public class Test {

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode tmp  = null;
        ListNode cur = head;
        while (cur != null) {
            tmp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = tmp;
        }
        return prev;
    }




}
