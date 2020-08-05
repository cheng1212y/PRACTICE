import java.util.PriorityQueue;

/**
 * @Description:
 * @Author: Cheng
 * @Create: 2020-08-05 23:20
 **/
public class a {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>((a1,a2)->a2-a1);
        queue.add(1);
        queue.add(2);
        queue.add(44);
        queue.add(0);
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
    }
}
