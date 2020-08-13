/**
 * @Description: 给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
 * 示例：
 *
 * 给定一个链表: 1->2->3->4->5, 和 n = 2.
 *
 * 当删除了倒数第二个节点后，链表变为 1->2->3->5.
 * 说明：
 *
 * 给定的 n 保证是有效的。
 *
 * 进阶：
 * 链接：https://leetcode-cn.com/problems/remove-nth-node-from-end-of-list
 * @Create: 2020-08-13 17:33
 **/
public class Test {
      class ListNode {
        int val;
       ListNode next;
       ListNode(int x) { val = x; }
  }
        public ListNode removeNthFromEnd(ListNode head, int n) {
            if (head == null || n<0 ) {
                return head;
            }
            ListNode newHead = new ListNode(-1);
            newHead.next = head;
            ListNode slow = newHead;
            ListNode fast = newHead;

            while ( n > 0 ) {
                if (fast.next != null) { //通过调节过滤了不合法的K
                    fast = fast.next;
                    n--;
                }else {
                    System.out.println("K不合法");
                    return null;
                }
            }
            //fast是删除结点的前驱
            while(fast.next != null) {
                slow = slow.next;
                fast = fast.next;
            }
            slow.next = slow.next.next;
            return newHead.next;
        }
    }
