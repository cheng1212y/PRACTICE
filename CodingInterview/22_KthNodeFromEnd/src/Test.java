/**
 * @Description: 面试题22. 链表中倒数第k个节点
 * 输入一个链表，输出该链表中倒数第k个节点。为了符合大多数人的习惯，本题从1开始计数，即链表的尾节点是倒数第1个节点。例如，一个链表有6个节点，从头节点开始，它们的值依次是1、2、3、4、5、6。这个链表的倒数第3个节点是值为4的节点。
 * 示例：
 * 给定一个链表: 1->2->3->4->5, 和 k = 2.
 * 返回链表 4->5.
 * @Create: 2020-04-25 22:06
 *   链接： https://leetcode-cn.com/problems/lian-biao-zhong-dao-shu-di-kge-jie-dian-lcof/
 **/
public class Test {



    public ListNode getKthFromEnd(ListNode head, int k) {
        if (head == null ) {
            return null;                   //有可能 链表为空
        }
        if ( k <= 0 /**|| k > size()*/) { //优化
            return null;                    //k的合法性
        }
        ListNode slow = head;
        ListNode fast = head;
        while ( k-1 > 0 ) {             // 快指针先走 k—1步数 然后两个一起走
            if (fast.next != null ) {    /**  加一个判断对 k  >  size()优化*/
                fast = fast.next;
                k--;
            }
            else {
                System.out.println("k值不合法");
                return null;
            }

        }
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }







}
