import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * @Description:  迭代 借助栈 前序遍历
 * 注意：前序遍历和中序遍历 只是打印位置不一样
 * @Author: Cheng
 * @Create: 2020-05-20 21:39
 **/
public class NotRecursion {
    public class TreeNode {
        int val;
        Recursion.TreeNode left;
        Recursion.TreeNode right;
        TreeNode(int x) { val = x; }
    }


    public List<Integer> preorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> list = new LinkedList<>();
        if ( root == null) {
            return list;
        }
        TreeNode cur = root;
        //栈不为空的情况 是为了重新确定top的位置
        while (cur != null || !stack.empty()) {

            while (cur != null) {
                stack.push(cur);
                list.add(cur.val);
                //System.out.print( cur.val+" ");
                cur = cur.left;
            }
            //栈顶的top可以弹出并记录是为了找到cur的右树
            TreeNode top = stack.pop();
            cur = top.right;
        }
        return list;
    }


}
