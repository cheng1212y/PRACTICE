/**
 * @Description:  另一个树的子树
 * 给定两个非空二叉树 s 和 t，检验 s 中是否包含和 t 具有相同结构和节点值的子树。s 的一个子树包括 s 的一个节点和这个节点的所有子孙。s 也可以看做它自身的一棵子树。
 * 示例 1:
 * 给定的树 s:
 *
 *      3
 *     / \
 *    4   5
 *   / \
 *  1   2
 * 给定的树 t：
 *
 *    4
 *   / \
 *  1   2
 * 返回 true，因为 t 与 s 的一个子树拥有相同的结构和节点值。
 *
 * 示例 2:
 * 给定的树 s：
 *
 *      3
 *     / \
 *    4   5
 *   / \
 *  1   2
 *     /
 *    0
 * 给定的树 t：
 *
 *    4
 *   / \
 *  1   2
 * 返回 false。
 * 链接：https://leetcode-cn.com/problems/subtree-of-another-tree
 * @Create: 2020-05-18 15:28
 **/
public class Test {

    public boolean isSubtree(Node s, Node t) {
        if( s == null || t == null ) {
            return false;
        }
        //两树相同
        if(  isSameTree( s,  t)  ) return true;
        //t是否是s左树的子树
        if(isSubtree(s.left, t)) return true;
        //t是否是s右树的子树
        if(isSubtree(s.right, t))return true;
        return false;

    }

    public static boolean isSameTree(Node s, Node t) {
        // 都为空的话，显然相同
        if (s == null && t == null) return true;
        // 一个为空，一个非空，显然不同
        if (s == null || t == null) return false;
        // 两个都非空，但 val 不一样也不行
        if (s.val != t.val) return false;

        // root1 和 root2 该比的都比完了
        return isSameTree(s.left, t.left)
                && isSameTree(s.right, t.right);
    }

}
