/**
 * @Description:  二叉树求最大深度
 * @Author: Cheng
 * 给定一个二叉树，找出其最大深度。
 *
 * 二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
 *
 * 说明: 叶子节点是指没有子节点的节点。
 *
 * 示例：
 * 给定二叉树 [3,9,20,null,null,15,7]，
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * 返回它的最大深度 3 。
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/maximum-depth-of-binary-tree
 * @Create: 2020-05-18 14:03
 **/
public class Test {

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = maxDepth( root.left );  //需要保存 左右树的高度
        int right = maxDepth( root.right ); //否则在三目运算符中+1的时候递归会再次计算 产生超时
        return left > right ? left +1:right+1;

    }

}
