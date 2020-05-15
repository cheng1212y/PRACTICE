/**
 * @Description:  数组 实现一个循环队列
 * 设计你的循环队列实现。 循环队列是一种线性数据结构，其操作表现基于 FIFO（先进先出）原则并且队尾被连接在队首之后以形成一个循环。它也被称为“环形缓冲器”。
 *
 * 循环队列的一个好处是我们可以利用这个队列之前用过的空间。在一个普通队列里，一旦一个队列满了，我们就不能插入下一个元素，即使在队列前面仍有空间。但是使用循环队列，我们能使用这些空间去存储新的值。
 *
 * MyCircularQueue(k): 构造器，设置队列长度为 k 。
 * Front: 从队首获取元素。如果队列为空，返回 -1 。
 * Rear: 获取队尾元素。如果队列为空，返回 -1 。
 * enQueue(value): 向循环队列插入一个元素。如果成功插入则返回真。
 * deQueue(): 从循环队列中删除一个元素。如果成功删除则返回真。
 * isEmpty(): 检查循环队列是否为空。
 * isFull(): 检查循环队列是否已满。
 * 示例：
 * MyCircularQueue circularQueue = new MyCircularQueue(3); // 设置长度为 3
 *
 * circularQueue.enQueue(1);  // 返回 true
 *
 * circularQueue.enQueue(2);  // 返回 true
 *
 * circularQueue.enQueue(3);  // 返回 true
 *
 * circularQueue.enQueue(4);  // 返回 false，队列已满
 *
 * circularQueue.Rear();  // 返回 3
 *
 * circularQueue.isFull();  // 返回 true
 *
 * circularQueue.deQueue();  // 返回 true
 *
 * circularQueue.enQueue(4);  // 返回 true
 *
 * circularQueue.Rear();  // 返回 4
 *
 * 提示：
 * 所有的值都在 0 至 1000 的范围内；
 * 操作数将在 1 至 1000 的范围内；
 * 请不要使用内置的队列库。
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/design-circular-queue
 * @Create: 2020-05-15 10:57
 **/
public class MyCircularQueue {
        public int [] elem ;
        public int front; //头
        public int rear;  //用来标识可以存放元素的下标
        public MyCircularQueue(int k) {
            this.elem = new int[k+1];   //此处根据要求 队列的容量应该加1
        }
        /** 1、入队*/
        public boolean enQueue(int value) {
            if (isFull()) {
                return false; //1队列为满的
            }
            //2有空位的情况
            this.elem[this.rear] = value;
            this.rear = ( rear + 1 ) % this.elem.length; //防止数组越界，0-7下标，rear需要从7下标到0的尴尬
            return true;

        }
        /**2、出队*/
        public boolean deQueue() {
            if (isEmpty()) {        //队列为空 不需要出队
                return false;
            }
            //队列不为空
            this.front = (this.front + 1 ) % this.elem.length; //排除 7 -0的情况
            return true;

        }
        /** 3、返回队头元素. */
        public int Front() {
            if (isEmpty()) {   //队列为空的情况
                return -1;
            }
            //不为空
            return this.elem[this.front];
        }
        /**------4、返回队尾元素------------- */
        public int Rear() {
            if (isEmpty()) {
                return -1;
            }
            //通过 判断普通位置是rear-1  特殊位置0 数组的长度-1
            int index = this.rear == 0 ? this.elem.length-1 : this.rear-1;
            return this.elem[index];
        }
        /** 5、判断队列是否为空 */
        public boolean isEmpty() {
            return this.front == this.rear;   //两个相遇的时候为空队列
        }
        /** 6、判断队列是否为满 */
        public boolean isFull() {
            if (( this.rear +1) % this.elem.length == this.front ) {  //规避了极端情况 7-0
                return  true;
            }
            return false;
        }
    }

