import java.util.HashMap;

/**
 * @Description: 给定一个整数数组，判断是否存在重复元素。
 * 如果任意一值在数组中出现至少两次，函数返回 true 。如果数组中每个元素都不相同，则返回 false 。
 * 示例 1:
 *
 * 输入: [1,2,3,1]
 * 输出: true
 * 示例 2:
 *
 * 输入: [1,2,3,4]
 * 输出: false
 * 示例 3:
 *
 * 输入: [1,1,1,3,3,4,3,2,4,2]
 * 输出: true
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/contains-duplicate
 * @Create: 2020-07-21 23:37
 **/
public class Test {

    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2}));
    }
    public  static boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for ( int ch: nums) {
            if (map.get(ch) == null) {
                map.put(ch,1);
            }
            else {
                Integer value = map.get(ch);
                map.put(ch,value+1);
            }
        }
        for ( int n : nums) {
            if (map.get(n) > 1) {
                return true;
            }
        }
        return false;
    }
}
