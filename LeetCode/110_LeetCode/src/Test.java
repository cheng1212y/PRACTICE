/**
 * @Description:   判断是否为 平衡二叉树
 * 给定一个二叉树，判断它是否是高度平衡的二叉树。
 * 本题中，一棵高度平衡二叉树定义为：
 * 一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过1。
 * 示例 1:
 * 给定二叉树 [3,9,20,null,null,15,7]
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * 返回 true 。
 *
 * 示例 2:
 *
 * 给定二叉树 [1,2,2,3,3,null,null,4,4]
 *
 *        1
 *       / \
 *      2   2
 *     / \
 *    3   3
 *   / \
 *  4   4
 * 返回 false 。
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/balanced-binary-tree
 * @Create: 2020-05-18 15:45
 **/
public class Test {

    public boolean isBalanced(Node root) {
        if(root == null ) {
            return true;
        }
        int left = getHeight( root.left  );
        int right = getHeight( root.right  );

        return Math.abs(   left-right    ) <2 &&
                isBalanced( root.left) &&
                isBalanced(root.right);
    }
    //求树的高度
    public static int getHeight(Node root) {
        if (root == null) {
            return 0;
        }
        int left = getHeight( root.left );  //需要保存 左右树的高度
        int right = getHeight( root.right ); //否则在三目运算符中+1的时候递归会再次计算 产生超时
        return left > right ? left +1:right+1;

    }
}
