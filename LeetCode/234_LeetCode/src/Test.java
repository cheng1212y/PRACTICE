/**
 * @Description:  234 回文链表判断 请判断一个链表是否为回文链表。
 * 示例 1:
 * 输入: 1->2
 * 输出: false
 * 示例 2:
 * 输入: 1->2->2->1
 * 输出: true
 * 进阶：
 * 你能否用 O(n) 时间复杂度和 O(1) 空间复杂度解决此题？
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/palindrome-linked-list
 * @Create: 2020-04-26 17:08
 **/
public class Test {

    public boolean isPalindrome(ListNode head) {
        if ( head == null ) {  //为空情况
            return true;
        }
        if ( head.next == null ) { //为一个结点的情况
            return true;
        }
        ListNode slow = head;
        ListNode fast = head;
        //1 此时slow是中间结点
        while (fast != null && fast.next!= null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        //2从中间结点开始逆置链表
        ListNode prev = null;
        ListNode tmp = null;
        ListNode cur  = slow;
        while (cur != null) {
            tmp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = tmp;
        }           //  prev 是逆置后的头
        //3 prev 与 head从头和尾同时走一步 每次不相等就是回文
        while (head != prev ) {
            if (head.val != prev.val) {
                return false;
            }
            /**判断偶数的情况*/
            if (head.next == prev) {
                return true;
            }
            head = head.next;
            prev = prev.next;
        }
        /** 退出while 代表奇数情况*/
        return true;
    }


}
