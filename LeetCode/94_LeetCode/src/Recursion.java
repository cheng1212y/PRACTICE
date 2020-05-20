import java.util.ArrayList;
import java.util.List;

/**
 * @Description:    递归的 中序遍历二叉树
 * @Author: Cheng
 * @Create: 2020-05-20 21:47
 **/
public class Recursion {

      public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
      }

        public List<Integer> inorderTraversal(TreeNode root) {
            List<Integer> list = new ArrayList<>();

            if(root == null) {
                return list ;
            }

            List<Integer> left  =     inorderTraversal(root.left);
            list.addAll(left);

            list.add(root.val);

            List<Integer> right  =     inorderTraversal(root.right);
            list.addAll(right);

            return list;
        }
    }

