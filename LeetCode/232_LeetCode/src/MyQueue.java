import java.util.Stack;

/**
 * @Description:   两个栈 实现队列       栈1 负责进  栈2 负责出
 *
 *使用栈实现队列的下列操作：
 * push(x) -- 将一个元素放入队列的尾部。
 * pop() -- 从队列首部移除元素。
 * peek() -- 返回队列首部的元素。
 * empty() -- 返回队列是否为空。
 * MyQueue queue = new MyQueue();
 * queue.push(1);
 * queue.push(2);
 * queue.peek();  // 返回 1
 * queue.pop();   // 返回 1
 * queue.empty(); // 返回 false
 * 说明:
 * 你只能使用标准的栈操作 -- 也就是只有 push to top, peek/pop from top, size, 和 is empty 操作是合法的。
 * 你所使用的语言也许不支持栈。你可以使用 list 或者 deque（双端队列）来模拟一个栈，只要是标准的栈操作即可。
 * 假设所有操作都是有效的 （例如，一个空的队列不会调用 pop 或者 peek 操作）。
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/implement-queue-using-stacks
 * @Create: 2020-05-15 14:34
 **/
public class MyQueue {
    public Stack<Integer> stack1;  //两个队列
    public Stack<Integer> stack2;

    public MyQueue() {      //构造方法得到两个队列
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    /** 1、入队 */
    public void push(int x) {
        stack1.push(x);   //指定入队到 栈1 当中
    }
    /** 2、弹出队头元素删除. */
    public int pop() {

        if (empty()) {
            return -1;
        }
        if (stack2.isEmpty()) {
            //栈2为空、 将栈1 所以元素倒入栈2
            while (!stack1.isEmpty()) {
                int data = stack1.pop();
                stack2.push(data);
            }
        }
        return stack2.pop(); //栈2不为空 直接出队
    }

    /** 3、得到队头元素. */
    public int peek() {
        if (empty()) {
            return -1;
        }
        if (stack2.isEmpty()) {
            //栈2为空、 将栈1 所以元素倒入栈2
            while (!stack1.isEmpty()) {
                int data = stack1.pop();
                stack2.push(data);
            }
        }
        return stack2.peek(); //栈2不为空 直接拿到队头
    }

    /** 4、队列判空 */
    public boolean empty() {
        if (stack1.isEmpty() && stack2.isEmpty()) {
            return true;
        }
        return false;
    }
}
