import java.util.Stack;

/**
 * @Description:  实现一个最小栈
 *
 * 设计一个支持 push ，pop ，top 操作，并能在常数时间内检索到最小元素的栈。
 * push(x) —— 将元素 x 推入栈中。
 * pop() —— 删除栈顶的元素。
 * top() —— 获取栈顶元素。
 * getMin() —— 检索栈中的最小元素。
 * ["MinStack","push","push","push","getMin","pop","top","getMin"]
 * [[],[-2],[0],[-3],[],[],[],[]]
 * 输出：
 * [null,null,null,null,-3,null,0,-2]
 * 解释：
 * MinStack minStack = new MinStack();
 * minStack.push(-2);
 * minStack.push(0);
 * minStack.push(-3);
 * minStack.getMin();   --> 返回 -3.
 * minStack.pop();
 * minStack.top();      --> 返回 0.
 * minStack.getMin();   --> 返回 -2.
 * 提示：
 * pop、top 和 getMin 操作总是在 非空栈 上调用。
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/min-stack
 * @Create: 2020-05-15 15:52
 **/
public class MinStack {
    public Stack<Integer> stack;  //两个栈
    public Stack<Integer> minStack;
    public MinStack() {             //构造方法得到普通栈 和最小栈
        stack = new Stack<>();
        minStack = new Stack<>();
    }
    /** 1、压栈 */
   /** 栈1是一直要放元素的
    最小栈放不放元素 取决于 元素和最小栈栈顶的关系
    小于 等于就放进去  大于不放进最小栈*/
    public void push(int x) {
        //1、栈1肯定要放元素
        stack.push(x);
        //栈2 为空的就放元素
        if ( minStack.isEmpty()) {
            minStack.push(x);
        }
        //栈2 不为空
        else {
            //判断元素与栈2 的栈顶的关系、如果小于就放进去栈2 否则不放进栈2
            int top = minStack.peek();
            if ( x <= top ) {
                minStack.push(x);
            }
        }
    }
    /** 2、弹出栈删除 */
   /** 栈1是一直弹出元素的
    最小栈弹不弹出元素 取决于 元素在不在最小栈栈顶的
    在的话就弹出*/
    public void pop() {

        if ( !stack.isEmpty()) {
            int data = stack.pop();

            if (data == minStack.peek()) {
                minStack.pop();
            }
        }
    }
    /** 3、得到栈顶元素-----------操作的是普通栈 */
    public int top() {
        if (stack.empty()) {
            return -1;
        }
        return stack.peek();
    }

    /** 4、得到最小元素 */
    public int getMin() {
        if (minStack.empty()) {
            return -1;
        }
        return minStack.peek();
    }
}
