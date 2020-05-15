import java.util.LinkedList;
import java.util.Queue;

/**
 * @Description:    使用两个队列实现一个栈
 * 使用队列实现栈的下列操作：
 * push(x) -- 元素 x 入栈
 * pop() -- 移除栈顶元素
 * top() -- 获取栈顶元素
 * empty() -- 返回栈是否为空
 * 注意:
 * 你只能使用队列的基本操作-- 也就是 push to back, peek/pop from front, size, 和 is empty 这些操作是合法的。
 * 你所使用的语言也许不支持队列。 你可以使用 list 或者 deque（双端队列）来模拟一个队列 , 只要是标准的队列操作即可。
 * 你可以假设所有操作都是有效的（例如, 对一个空的栈不会调用 pop 或者 top 操作）。
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/implement-stack-using-queues
 * @Create: 2020-05-15 13:30
 **/
public class MyStack {

    public Queue<Integer> queue1; // 得到两个队列
    public Queue<Integer> queue2;

    public MyStack() {                  //通过构造方法得到两个队列
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        //1、哪个队列不为空就放到哪个中
        if ( !queue1.isEmpty()) {
            queue1.offer(x);
        }
        else if (!queue2.isEmpty()){
            queue2.offer(x);
        }
        //2、都为空 规定放到queue1中
        else {
            queue1.offer(x);
        }
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        //1、栈为空的情况
        if (empty()) {
            return -1;
        }
        int qSize1 = queue1.size();  //保存住队列的长度
        int qSiez2 = queue2.size();
        int data = 0;
        //2、出不为空的那个队列 n个元素的话 将n-1个倒进另一个队列
        if (!queue1.isEmpty()) {
            for (int i = 0; i <qSize1-1 ; i++) {    /** 长度减去1 是为了弹出前n-1个元素*/
                int val = queue1.poll();           //弹出队列中除最后一个的所有元素
                queue2.offer(val);                 // 另一个队列接受弹出的元素
            }
            data = queue1.poll();                 //最后一个元素就是需要出栈的 栈顶元素
        }

        else {
            for (int i = 0; i <qSiez2-1 ; i++) {
                int val = queue2.poll();
                queue1.offer(val);
            }
            data = queue2.poll();
        }
        return data;
    }

    /** Get the top element. */
    public int top() {

        //1、栈为空的情况
        if (empty()) {
            return -1;
        }
        int qSize1 = queue1.size();  //保存住队列的长度
        int qSiez2 = queue2.size();
        int data = 0;
        //2、出不为空的那个队列  n个元素倒入另一个队列
        if (!queue1.isEmpty()) {
            for (int i = 0; i <qSize1 ; i++) {
                data = queue1.poll();
                queue2.offer(data);               //最后一个val就是栈顶元素
            }
        }

        else {
            for (int i = 0; i <qSiez2 ; i++) {
                data = queue2.poll();
                queue1.offer(data);
            }
        }
        return data;
    }
    /** Returns whether the stack is empty. */
    public boolean empty() {
        if(queue1.isEmpty() && queue2.isEmpty()) {
            return true;
        }
        return false;
    }

}
