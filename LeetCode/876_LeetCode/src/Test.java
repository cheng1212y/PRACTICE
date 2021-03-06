/**
 * @Description:   876. 链表的中间结点
 * 给定一个带有头结点 head 的非空单链表，返回链表的中间结点。如果有两个中间结点，则返回第二个中间结点。
 * 示例 1：
 * 输入：[1,2,3,4,5]
 * 输出：此列表中的结点 3 (序列化形式：[3,4,5])
 * 返回的结点值为 3 。 (测评系统对该结点序列化表述是 [3,4,5])。
 * 注意，我们返回了一个 ListNode 类型的对象 ans，这样：
 * ans.val = 3, ans.next.val = 4, ans.next.next.val = 5, 以及 ans.next.next.next = NULL.
 * 示例 2：
 * 输入：[1,2,3,4,5,6]
 * 输出：此列表中的结点 4 (序列化形式：[4,5,6])
 * 由于该列表有两个中间结点，值分别为 3 和 4，我们返回第二个结点。
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/middle-of-the-linked-list


 * @Create: 2020-04-24 15:28
 **/
public class Test {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     */

        public ListNode middleNode(ListNode head) {
            ListNode slow = head;   //通过快慢指针  速度是二倍关系 快的到达末尾时候 那么慢的一定在中间
            ListNode fast = head;
            while ( fast != null && fast.next != null ) { //偶数fast 奇数fast的情况都包含
                fast = fast.next.next;              /** fast!=null 写在前 否则偶数时候会空指针异常 */
                slow = slow.next;

            }
            return slow;
        }


}
