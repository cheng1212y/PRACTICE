/**
 * @Description: 请编写一个函数，使其可以删除某个链表中给定的（非末尾）节点，你将只被给定要求被删除的节点。
 *
 * 输入: head = [4,5,1,9], node = 5
 * 输出: [4,1,9]
 * 解释: 给定你链表中值为 5 的第二个节点，那么在调用了你的函数之后，该链表应变为 4 -> 1 -> 9.
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/delete-node-in-a-linked-list
 * @Create: 2020-05-01 23:21
 **/

class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
  }

public class Test {

    class Solution {
        public void deleteNode(ListNode node) {
            node.val = node.next.val;  //删除 值等于下一个
            node.next = node.next.next;//开始删除
        }
    }






}
