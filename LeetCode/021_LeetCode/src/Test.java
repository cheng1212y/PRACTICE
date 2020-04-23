/**
 * @Description: 将两个升序链表合并为一个新的升序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 
 * 示例：
 * 输入：1->2->4, 1->3->4                  输出：1->1->2->3->4->4
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/merge-two-sorted-lists
 * @Author: Cheng
 * @Create: 2020-04-23 16:25
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
        public ListNode mergeTwoLists(ListNode a, ListNode b) {
            ListNode Node = new ListNode( -1 );  //构造方法生成一个结点
            ListNode cur  = Node;                //为了拿到head 而不改变原本的head
            while ( a != null && b != null ) {
                if ( a.val <= b.val ) {
                    cur.next = a ;              //a的头结点绑到cur上
                    a = a.next;                 //a往后走一步

                }
                else {
                    cur.next = b;
                    b = b.next;
                }
                cur  = cur.next;        //cur往后走一步
            }
            cur.next = a == null ? b:a;  /** 当a走到null cur在a的最后一个结点，b在最后一个结点  判断出cur的next */

            return Node.next;
        }






}
