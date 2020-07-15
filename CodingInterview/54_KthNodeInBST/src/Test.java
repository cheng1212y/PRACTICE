import java.util.Objects;

/**
 * @Description: 给定一棵二叉搜索树，请找出其中第k大的节点。
 * 输入: root = [3,1,4,null,2], k = 1
 *    3
 *   / \
 *  1   4
 *   \
 *    2
 * 输出: 4
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/er-cha-sou-suo-shu-de-di-kda-jie-dian-lcof
 * @Create: 2020-07-15 22:42
 **/

  class TreeNode {
      int val;
      TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
  }
public class Test {
    private int count ;     //记录第几次 即K的值
    private int result = -1;

    public int kthLargest(TreeNode root, int k) {
        count = k;
        kthLargest(root);
        return result;
    }
    //递归
    private void kthLargest(TreeNode root) {
        if (root != null) {
            kthLargest(root.right);  //先右边将会得到一个从大到小的排列
            if (count == 1) {
                result = root.val;
                count--;
                return;
            }
            count--;
            kthLargest(root.left);
        }
    }


}
