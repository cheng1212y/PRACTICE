import java.util.ArrayList;
import java.util.List;
/**
 * @Description: 递归后续遍历二叉树
 * @Author: Cheng
 * @Create: 2020-05-20 21:53
 **/
public class Recursion {

      public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
      }



        public List<Integer> postorderTraversal(TreeNode root) {
            List<Integer> list = new ArrayList<>();

            if(root == null) {
                return list ;
            }

            List<Integer> left  =     postorderTraversal(root.left);
            list.addAll(left);

            List<Integer> right  =     postorderTraversal(root.right);
            list.addAll(right);

            list.add(root.val);

            return list;
        }
    }
