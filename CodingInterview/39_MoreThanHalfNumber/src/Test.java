import java.util.HashMap;
import java.util.Map;

/**
 * @Description: 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
 * 示例 1: * 输入: [1, 2, 3, 2, 2, 2, 5, 4, 2]           输出: 2   * 1 <= 数组长度 <= 50000
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/shu-zu-zhong-chu-xian-ci-shu-chao-guo-yi-ban-de-shu-zi-lcof
 * @Create: 2020-07-08 23:07
 **/
public class Test {
    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{1, 2, 3, 2, 2, 2, 5, 4, 2}));
    }
    public static int majorityElement(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        HashMap<Integer,Integer> map  = new HashMap<>(); //放入map统计个数
        for ( int n :nums) {
            if (map.get(n) == null) {
                map.put(n,1);
            }
            else {
                Integer number = map.get(n);
                map.put(n,number+1);
            }
        }
        int max = 0;
        for (Map.Entry<Integer,Integer> entry : map.entrySet() ) {  //查看每一个entry里面的值
            if (entry.getValue() > (nums.length/2) ) {
                max = entry.getKey();
                break;
            }
        }
        return max;
    }
}
