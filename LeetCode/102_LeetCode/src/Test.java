/**
 * @Description:   二叉树的层序遍历
 *
 * 给你一个二叉树，请你返回其按 层序遍历 得到的节点值。 （即逐层地，从左到右访问所有节点）。
 * 示例：
 * 二叉树：[3,9,20,null,null,15,7],
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * 返回其层次遍历结果：
 * [
 *   [3],
 *   [9,20],
 *   [15,7]
 * ]
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/binary-tree-level-order-traversal
 * @Create: 2020-05-19 17:13
 **/
public class Test {

    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> ret = new LinkedList<>();
        if ( root == null ) {
            return ret;
        }
        Queue< TreeNode> queue = new LinkedList<>();
        //队列不为空 入队
        queue.offer(root);
        while ( !queue.isEmpty()) {   //队列不为空的时候打印
            //每一次进入这个循环，就相当于是每一层的数据

            int size  = queue.size();
            List<  Integer  > list = new ArrayList<>();

            while ( size >0) {
                TreeNode cur =queue.poll();  //cur记录的是队头 每次删除
                if (cur != null) {  //cur不为空的时候 打印cur 并且将左右入队
                    System.out.print (cur.val + " ");
                    list.add(cur.val);
                    if (  cur.left != null ) {
                        queue.offer(cur.left);
                    }

                    if (  cur.right != null ) {
                        queue.offer(cur.right);
                    }
                }
                size--;
            }
            ret.add(list);
        }
        return ret;
    }
}
