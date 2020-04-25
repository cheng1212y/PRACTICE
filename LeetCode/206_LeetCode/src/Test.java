/**
 * @Description:  206. 反转链表
 * 示例：
 * 输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
 * 通过次数236,264提交次数386,137
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/merge-two-sorted-lists
 * @Create: 2020-04-24 14:30
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
    class Solution {
        public ListNode reverseList(ListNode head) {
            ListNode tmp = null;
            ListNode cur = head;
            ListNode prev = null;
            while ( cur != null ) {

                tmp = cur.next;     //保存cur的next

                cur.next  = prev;   //完成连接

                prev = cur;          // pre向后走一步

                cur = tmp;     //cur向后走一步

            }
            return prev;
        }
    }


}



