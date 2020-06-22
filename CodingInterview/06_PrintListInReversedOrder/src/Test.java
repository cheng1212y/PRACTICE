import java.util.ArrayList;
import java.util.Stack;

/**
 * @Description:   反转链表 并且返回一个数组
 * 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
 * 示例 1：
 * 输入：head = [1,3,2]
 * 输出：[2,3,1]
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/cong-wei-dao-tou-da-yin-lian-biao-lcof
 * @Create: 2020-06-22 22:28
 **/
       class ListNode {
          int val;
          ListNode next;
          ListNode(int x) { val = x; }
      }


      /** 逆置链表 修改了结构的*/
public class Test {
    public int[] reversePrint(ListNode head) {
        ListNode prev  = null ;
        ListNode tmp = null;
        ListNode cur = head;
        Stack<Integer> stack = new Stack<>();
        while (cur != null) {
            tmp = cur.next;    //保存头结点的下一个结点 防止丢失
            cur.next = prev;   //从后倒前的动作
            prev = cur ;     //每次往后走一步
            cur = tmp;      //往后走一步
            stack.push(prev.val);
        }
        int siez = stack.size();
        int [] ret = new int[siez];
        for (int i = 0; i <siez ; i++) {
            ret[i] = stack.pop();
        }
        return ret;
    }

}

/**递归的做法*/
 class Solution {
    ArrayList<Integer> tmp = new ArrayList<Integer>();
    public int[] reversePrint(ListNode head) {
        recur(head);
        int[] res = new int[tmp.size()];
        for(int i = 0; i < res.length; i++)
            res[i] = tmp.get(i);
        return res;
    }
    void recur(ListNode head) {
        if(head == null) return;
        recur(head.next);
        tmp.add(head.val);
    }
}
