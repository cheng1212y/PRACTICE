import java.util.Stack;

/**
 * @Description:   最小栈，请在该类型中实现一个能够得到栈的最小元素的 min 函数在该栈中，调用 min、push 及 pop 的时间复杂度都是 O(1)
 * @Author: Cheng
 * @Create: 2020-06-29 18:06
 **/
public class Test {
    class MinStack {
        public Stack<Integer> stack;  //两个栈
        public Stack<Integer> minStack;

        public MinStack() {             //构造方法得到普通栈 和最小栈
            stack = new Stack<>();
            minStack = new Stack<>();
        }
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

        public void pop() {
            //栈1是一直弹出元素的
            //最小栈弹不弹出元素 取决于 元素在不在最小栈栈顶的
            //在的话就弹出
            if ( !stack.isEmpty()) {
                int data = stack.pop();

                if (data == minStack.peek()) {
                    minStack.pop();
                }
            }
        }

        public int top() {
            if (stack.empty()) {
                return -1;
            }
            return stack.peek();

        }

        public int min() {
            if (minStack.empty()) {
                return -1;
            }
            return minStack.peek();
        }
    }
}


