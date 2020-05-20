/**
 * @Description:  寻找公共祖先
 * 给定一个二叉树, 找到该树中两个指定节点的最近公共祖先。
 *
 * 例如，给定如下二叉树:  root = [3,5,1,6,2,0,8,null,null,7,4]------------层序的
 * 输入: root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 1
 * 输出: 3
 * 解释: 节点 5 和节点 1 的最近公共祖先是节点 3。
 * 示例 2:
 *
 * 输入: root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 4
 * 输出: 5
 * 解释: 节点 5 和节点 4 的最近公共祖先是节点 5。因为根据定义最近公共祖先节点可以为节点本身。
 * 所有节点的值都是唯一的。
 * p、q 为不同节点且均存在于给定的二叉树中。
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/lowest-common-ancestor-of-a-binary-tree
 * @Create: 2020-05-20 21:20
 **/
public class Test {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if ( root == null) {
            return null;
        }
        //1、root就是祖先
        if ( root == p || root == q) {
            return root;
        }
        //2、递归的去左右树中寻找
        TreeNode left = lowestCommonAncestor(root.left,  p,  q);
        TreeNode right = lowestCommonAncestor(root.right,  p,  q);

        // 第一种情况 pq分布在root左右
        if ( left != null && right != null) {
            return root;
        }
        // 第二种情况 pq分布在root左
        else if ( left != null ) {
            return left;
        }
        // 第二种情况 pq分布在root右
        else {
            return right;
        }
    }



}
