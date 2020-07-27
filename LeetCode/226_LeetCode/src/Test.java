import javax.swing.tree.TreeNode;

/**
 * @Description: 翻转一棵二叉树。
 * 输入：
 *      4
 *    /   \
 *   2     7
 *  / \   / \
 * 1   3 6   9
 * 输出：
 *      4
 *    /   \
 *   7     2
 *  / \   / \
 * 9   6 3   1
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/invert-binary-tree
 * @Create: 2020-07-27 12:28
 **/

//反转一颗空树结果还是一颗空树。对于一颗根为 rr，
// 左子树为 mbox{right}mboxright， 右子树为 mbox{left}mboxleft 的树来说，它的反转树是一颗根为 rr，左子树为 mbox{right}mboxright 的反转树，右子树为 mbox{left}mboxleft 的反转树的树。
public class Test {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode right = invertTree(root.right);
        TreeNode left = invertTree(root.left);
        root.left = right;
        root.right = left;
        return root;
    }
}
