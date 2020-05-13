/**
 * @Description:  括号匹配问题
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 * 有效字符串需满足：
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 * 示例 1:
 *
 * 输入: "()"
 * 输出: true
 * 示例 2:
 *
 * 输入: "()[]{}"
 * 输出: true
 * 示例 3:
 *
 * 输入: "(]"
 * 输出: false
 * 示例 4:
 *
 * 输入: "([)]"
 * 输出: false
 * 示例 5:
 *
 * 输入: "{[]}"
 * 输出: true
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/valid-parentheses
 * @Create: 2020-05-13 20:51
 **/

import java.util.Stack;

/**  借助栈来解决  */
public class Test {

    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);           //是左括号就压栈
            } else {
                //1、判断栈是否为空
                if (stack.empty()) {
                    System.out.println("右括号比左括号多 左边没有括号");
                    return false;
                }
                //拿到栈顶元素
                char c1 = stack.peek();
                if (c1 == '(' && c == ')' || c1 == '[' && c == ']' || c1 == '{' && c == '}') {
                    stack.pop();  //相等就弹出栈顶元素
                } else {
                    System.out.println("左右括号不匹配");
                    return false;
                }
            }
        }
        if (!stack.empty()) {
            System.out.println(" 左括号比右括号多了");
            return false;
        }
        return true;
    }
}





