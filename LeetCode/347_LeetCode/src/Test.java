import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * @Description: 给定一个非空的整数数组，返回其中出现频率前 k 高的元素。
 * 示例 1:
 * 输入: nums = [1,1,1,2,2,3], k = 2
 * 输出: [1,2]
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/top-k-frequent-elements
 * @Create: 2020-08-05 23:14
 **/
public class Test {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(topKFrequent(new int[]{1, 1, 1, 2, 2, 3,}, 2)));
    }

    public static int[] topKFrequent(int[] nums, int k) {
            HashMap<Integer, Integer> map = new HashMap<>();
            PriorityQueue<Map.Entry<Integer, Integer>> maxheap = new PriorityQueue<>((a,b) -> b.getValue() - a.getValue());
            int[] result = new int[k];
            for(int i = 0; i < nums.length; i++){
                map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            }
            for(Map.Entry<Integer, Integer> m : map.entrySet()){
                maxheap.offer(m);
            }
            for(int i = 0; i < k; i++){
                result[i] = maxheap.poll().getKey();
            }

            return result;
        }
    }



