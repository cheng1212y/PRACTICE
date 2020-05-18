/**
 * @Description: 镜像二叉树问题
 * 给定一个二叉树，检查它是否是镜像对称的。
 * 例如，二叉树 [1,2,2,3,4,4,3] 是对称的。
 *
 *     1
 *    / \
 *   2   2
 *  / \ / \
 * 3  4 4  3
 * 但是下面这个 [1,2,2,null,3,null,3] 则不是镜像对称的:
 *
 *     1
 *    / \
 *   2   2
 *    \   \
 *    3    3
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/symmetric-tree
 * @Create: 2020-05-18 16:12
 **/

public class Test {

    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }

        return isSymmetricChild(root.left,root.right );
    }

    /** 对比左树 和 右树 是否镜像
     * 其中需要考虑左树的左
     * 右树的右*/
    public boolean isSymmetricChild(TreeNode leftTree,TreeNode rightTree) {
        //有一则为空
        if(leftTree == null && rightTree != null || leftTree!=null && rightTree==null){
            return false;
        }
        //两个都为空
        if(leftTree == null && rightTree == null) {
            return true;
        }
        if(leftTree.val != rightTree.val) {
            return false;
        }
        //值相等的情况
        //左树的左  和右树的右
        return  isSymmetricChild(leftTree.left,rightTree.right )
                &&  isSymmetricChild(leftTree.right,rightTree.left );
    }
}
