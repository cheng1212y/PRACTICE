/**
 * @Description:    203 移除链表元素
 * 删除链表中等于给定值 val 的所有节点。
 * 示例:
 * 输入: 1->2->6->3->4->5->6, val = 6
 * 输出: 1->2->3->4->5
 * 来源: https://leetcode-cn.com/problems/remove-linked-list-elements/description/
 * @Create: 2020-04-24 13:33
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
        public ListNode removeElements(ListNode head, int val) {

            if ( head == null ) {
                return null;                    //防止空指针异常
            }
            ListNode prev = head;               //prev 永远在cur的前面
            ListNode cur = head.next;
            while ( cur != null) {                      //遍历完整个链表
                if (cur.val == val ) {
                    prev.next = cur.next;
                    cur = cur.next;           /** 删除完一个要往后挪一个位置 ，方便下次判断cur是不是和key想到 解决了连续key的问题*/
                }
                else {
                    prev = cur;              //每次key和cur不相等 prev和cur就依次往后走一个位置
                    cur = cur.next;
                }
            }
            if (head.val == val) {
                head = head.next;               //要删除的元素正好是第一个 在头结点的位置
            }
            return head;
        }
    }




}
