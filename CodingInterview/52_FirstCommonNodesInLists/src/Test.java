/**
 * @Description: 52 找出两个链表的第一个公共节点
 *
 * 来源 ：https://leetcode-cn.com/problems/liang-ge-lian-biao-de-di-yi-ge-gong-gong-jie-dian-lcof/
 * @Create: 2020-04-29 23:47
 **/


 class ListNode {
     int val;
     ListNode next;
     ListNode(int x) {
          val = x;
          next = null;
      }
  }


public class Test {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = 0;
        int lenB = 0;
        ListNode pl = headA;
        ListNode ps = headB;
        //1计算 ps pl的长度
        while ( pl!= null) {
            lenA ++;
            pl = pl.next;
        }

        while ( ps != null) {
            lenB ++;
            ps = ps.next;
        }
        pl = headA;//恢复头结点的位置
        ps = headB;
        int len = lenA - lenB;
        if (len < 0) {
            pl = headB;
            ps = headA;
            len = lenB - lenA;
        }
        //2 让长的先走|lenA - LenB|步数
        for (int i = 0; i <len; i++) {
            pl = pl.next;
        }
        //3同一起跑线后 一起走
        while (ps != pl && ps !=null && pl != null ) {
            ps = ps.next;
            pl = pl.next;
        }
        //4退出有两种情况 无交点 有交点
        if (pl != null) {
            return pl;
        }
        return null;
    }






}
