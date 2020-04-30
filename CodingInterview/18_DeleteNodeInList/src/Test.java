/**
 * @Description: 给定单向链表的头指针和一个要删除的节点的值，定义一个函数删除该节点。 返回删除后的链表的头节点。
 * 输入: head = [4,5,1,9], val = 5
 * 输出: [4,1,9]
 * 解释: 给定你链表中值为 5 的第二个节点，那么在调用了你的函数之后，该链表应变为 4 -> 1 -> 9.
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/shan-chu-lian-biao-de-jie-dian-lcof
 * @Create: 2020-04-30 22:07
 **/

 class ListNode {
     int val;
    ListNode next;
      ListNode(int x) { val = x; }
  }



public class Test {


    public ListNode deleteNode(ListNode head, int val) {
        if (head.val == val ) {
            head = head.next; //要删除的元素正好是第一个 在头结点的位置
            return head ;
        }
        ListNode prev = head;
        while ( prev.next != null) {    /**若是 prev 走到最后一个 prev.next.data 空指针异常 ;一定是 prev.next !=null   这时候最后结点的data已经被验证了  */
            if (prev.next.val == val ) {

                if ( prev == null ) {
                    return null;                       //找不到这个 元素 链表里面没有
                }
                ListNode del = prev.next;        // 创建一个del结点  代表删除的结点
                prev.next = del.next;
                return head;
            }
            else {
                prev = prev.next; // 找不到相等 每次prev就往后走一步
            }
        }
        if(prev.next == null) {
            return null;//所以的走完了 也没有找到相等的就返回null
        }
        return head;
    }




}
