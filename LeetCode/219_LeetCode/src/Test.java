import java.util.HashSet;
import java.util.Set;

/**
 * @Description:   存在重复的元素II
 * 给定一个整数数组和一个整数 k，判断数组中是否存在两个不同的索引 i 和 j，使得 nums [i] = nums [j]，并且 i 和 j 的差的 绝对值 至多为 k。
 * 示例 1:
 * 输入: nums = [1,2,3,1], k = 3
 * 输出: true
 * 示例 2:
 * 输入: nums = [1,0,1,1], k = 1
 * 输出: true
 * 示例 3:
 * 输入: nums = [1,2,3,1,2,3], k = 2
 * 输出: false
 * 链接：https://leetcode-cn.com/problems/contains-duplicate-ii
 * @Create: 2020-06-05 23:16
 **/
public class Test {
    public static void main(String[] args) {
        int [] arr = {6,5,42,9,2};
        System.out.println(containsNearbyDuplicate(arr, 1));
    }
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; ++i) {
            if (set.contains(nums[i])) return true;
            set.add(nums[i]);
            if (set.size() > k) {
                set.remove(nums[i - k]);
            }
        }
        return false;
    }

}
