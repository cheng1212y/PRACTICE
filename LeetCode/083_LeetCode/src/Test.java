/**
 * @Description:  83. 删除排序链表中的重复元素
 * 给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。
 * 示例 1:
 * 输入: 1->1->2
 * 输出: 1->2
 * 示例 2:
 *
 * 输入: 1->1->2->3->3
 * 输出: 1->2->3
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list
 * @Create: 2020-04-26 17:01
 **/
public class Test {


    public ListNode deleteDuplicates(ListNode head) {
        ListNode newHead = new ListNode(-1);
        ListNode tmp = newHead;             //tmp 是一直往后走 而 让newHead 保持不动
        ListNode cur = head;

        while ( cur != null)
            //1 有重复结点时候 就跳过
            if ( cur.next != null && cur.val == cur.next.val ) { //cur.next!= null是最后一个结点的筛选，直接进入else语句插入
                while (cur.next != null && cur.val == cur.next.val) {
                    cur = cur.next;
                }

            }
            //2.遇到不重复的结点时候 就开始插入新链中
            else {
                tmp.next = cur;
                tmp = tmp.next;
                cur = cur.next;            //cur往后走
            }
        tmp.next =null;    /** 排除1 2 2 3 3 这种情况 因为1 连接过去 next域不为null  */
        return newHead.next;
    }

}
