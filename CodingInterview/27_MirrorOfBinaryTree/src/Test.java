/**
 * @Description: 请完成一个函数，输入一个二叉树，该函数输出它的镜像。
 * 例如输入：
 *
 *      4
 *    /   \
 *   2     7
 *  / \   / \
 * 1   3 6   9
 * 镜像输出：
 *
 *      4
 *    /   \
 *   7     2
 *  / \   / \
 * 9   6 3   1
 *
 *  
 *
 * 示例 1：
 *
 * 输入：root = [4,2,7,1,3,6,9]
 * 输出：[4,7,2,9,6,3,1]
 * 链接：https://leetcode-cn.com/problems/er-cha-shu-de-jing-xiang-lcof
 * @Create: 2020-09-07 23:34
 **/
public class Test {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
        public TreeNode mirrorTree(TreeNode root) {
            //递归函数的终止条件，节点为空时返回
            if(root==null) {
                return null;
            }
            //下面三句是将当前节点的左右子树交换
            TreeNode tmp = root.right;
            root.right = root.left;
            root.left = tmp;
            //递归交换当前节点的 左子树
            mirrorTree(root.left);
            //递归交换当前节点的 右子树
            mirrorTree(root.right);
            //函数返回时就表示当前这个节点，以及它的左右子树
            //都已经交换完了
            return root;
        }
}
