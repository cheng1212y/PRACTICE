import java.util.ArrayList;
import java.util.List;

/**
 * @Description:   递归求 二叉树的前序遍历
 * @Author: Cheng
 * @Create: 2020-05-20 21:34
 **/
public class Recursion {
      public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
      }
        public List<Integer> preorderTraversal(TreeNode root) {
            List<Integer> list = new ArrayList<>();
            if(root == null) {
                return list ;
            }

            list.add(root.val);         //递归时候 不必关心下面的结点怎么做 自动按照框架

            List<Integer> left  =     preorderTraversal(root.left);
            list.addAll(left);
            List<Integer> right  =     preorderTraversal(root.right);
            list.addAll(right);
            System.out.println(list);
            return list;
        }
}
