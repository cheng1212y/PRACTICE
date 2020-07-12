/**
 * @Description: 给定一个二叉搜索树，编写一个函数 kthSmallest 来查找其中第 k 个最小的元素。
 *           3
 *         /   \
 *         1   4
 *          \
 *           2
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/kth-smallest-element-in-a-bst
 * @Create: 2020-07-12 21:30
 **/

/** 二叉搜索树的中序遍历是一个 升序的值*/
public class Test {
    int num = 0;
    int res = 0;
    public int kthSmallest(TreeNode root, int k) {
        inorderTraversal(root, k);
        return res;
    }

    private void inorderTraversal(TreeNode node, int k) {
        if (node == null) {
            return;
        }
        inorderTraversal(node.left, k);
        num++;
        if (num == k) {
            res = node.val;
            return;
        }
        inorderTraversal(node.right, k);
    }

}