/**
 * @Description:     使用两个栈模拟  队列
 * 用两个栈实现一个队列。队列的声明如下，请实现它的两个函数 appendTail 和 deleteHead ，
 * 分别完成在队列尾部插入整数和在队列头部删除整数的功能。(若队列中没有元素，deleteHead 操作返回 -1 )
 * 示例 1：
 * 输入：
 * ["CQueue","appendTail","deleteHead","deleteHead"]
 * [[],[3],[],[]]
 * 输出：[null,null,3,-1]
 * 示例 2：
 *
 * 输入：
 * ["CQueue","deleteHead","appendTail","appendTail","deleteHead","deleteHead"]
 * [[],[],[5],[2],[],[]]
 * 输出：[null,-1,null,null,5,2]
 * 提示：
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/yong-liang-ge-zhan-shi-xian-dui-lie-lcof
 * @Create: 2020-06-21 22:28
 **/

import java.util.Stack;

/**
 * 1、入队： 指定入一个栈中
 *
 * 2、出队
 *  若栈为空 返回-1
 *      若栈2 为空 ，若栈1不为空 就将栈1全部倒入栈2 中
 *          若栈2 不为空 ，就将栈2 出栈 就是出队
 *
 * */
public class CQueue {
    public Stack<Integer> stack1;
    public Stack<Integer> stack2;
    public CQueue() {
        stack1 = new Stack<>();   //拿到两个栈
        stack2 = new Stack<>();
    }

    //入队
    public void appendTail(int value) {
        stack1.push(value);
    }
    //出队

    public int deleteHead() {
        if (stack2.empty() && stack1.empty()) {
            return -1;
        }
        if (stack2.empty()) {
            while ( !stack1.empty() ) {
                stack2.push( stack1.pop() );
            }
        }
        return stack2.pop();
        }
    }
