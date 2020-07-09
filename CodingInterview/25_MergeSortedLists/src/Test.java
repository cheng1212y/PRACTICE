
/**
 * @Description: 输入两个递增排序的链表，合并这两个链表并使新链表中的节点仍然是递增排序的。
 * 示例1：
 * 输入：1->2->4,
 *       1->3->4
 * 输出：1->1->2->3->4->4
 * 限制：
 * 0 <= 链表长度 <= 1000
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/he-bing-liang-ge-pai-xu-de-lian-biao-lcof
 * @Create: 2020-07-09 22:20
 **/
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
public class Test {
    public ListNode mergeTwoLists(ListNode A, ListNode B) {
        ListNode head = new ListNode(-1);
        ListNode  cur  = head;

        while (A != null && B != null) {
            if (A.val <= B.val) {
                cur.next = A;
                cur = A;
                A = A.next;
            } else {
                cur.next = B;
                cur = B;
                B = B.next;
            }
        }
        if(A == null) {
            cur.next = B;
        }
        if(B == null) {
            cur.next = A;
        }
        return head.next;

    }
}
