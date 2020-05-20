import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * @Description:  借助栈 迭代 后序遍历二叉树
 * @Author: Cheng
 * @Create: 2020-05-20 21:54
 **/
public class NotRecursion {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public List<Integer> postorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> list = new LinkedList<>();

        if ( root == null) {
            return list;
        }
        TreeNode cur = root;
        TreeNode prev = null;
        //栈不为空的情况 是为了重新确定top的位置
        while (cur != null || !stack.empty()) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            // cur 拿到的是栈顶元素 相当于上一个cur的父节点
            cur = stack.peek();
            //右边等于空 直接打印根节点
            if ( cur.right == null || cur.right == prev) {  /** 1、右边为空------或者右边被打印过了 ，就可以打印根节点了*/
                list.add(cur.val);
                // System.out.print(cur.val+ " ");
                stack.pop();
                prev = cur;   /**2、加prev是为了防止cur无线循环的进入else去打印右子树*/
                cur =null;    /** 3、防止进入上层的循环后 再次将cur入队*/
            }
            else {  //不为空 就将cur指向它的右
                cur = cur.right;
            }
        }
        return list;
    }


}
