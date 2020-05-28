import java.util.HashMap;
import java.util.Map;

/**
 * @Description: 复制带随机指针的链表
 * 给定一个链表，每个节点包含一个额外增加的随机指针，该指针可以指向链表中的任何节点或空节点。
 * 要求返回这个链表的 深拷贝。 
 * 我们用一个由 n 个节点组成的链表来表示输入/输出中的链表。每个节点用一个 [val, random_index] 表示：
 * val：一个表示 Node.val 的整数。
 * random_index：随机指针指向的节点索引（范围从 0 到 n-1）；如果不指向任何节点，则为  null 。
 * 示例 1：
 * 输入：head = [[7,null],[13,0],[11,4],[10,2],[1,0]]
 * 输出：[[7,null],[13,0],[11,4],[10,2],[1,0]]
 * 提示：
 * -10000 <= Node.val <= 10000
 * Node.random 为空（null）或指向链表中的节点。
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/copy-list-with-random-pointer
 * @Create: 2020-05-28 22:18
 **/
public class Test {


class Node {
    int val;
    Node next;
    Node random;
    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

        public Node copyRandomList(Node head) {
        if (head == null) {
            return head;
        }
        Node cur = head;
            Map< Node,Node> map = new HashMap<>();
        while (cur != null) {
            Node node  = new Node(cur.val);
            map.put(cur,node);
            cur = cur.next;
        }
        //新旧结点的映射建立完毕
            cur = head;
        while (cur != null) {
            //通过hasmap 的映射关系达到深拷贝
            map.get(cur).next = map.get(cur.next);
            map.get(cur).random = map.get(cur.random);
            cur = cur.next;
        }
        return map.get(head);
        }
    }
