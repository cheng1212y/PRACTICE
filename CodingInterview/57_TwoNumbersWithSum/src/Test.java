import java.util.Arrays;

/**
 * @Description: 输入一个递增排序的数组和一个数字s，在数组中查找两个数，使得它们的和正好是s。如果有多对数字的和等于s，则输出任意一对即可。
 * 示例 1：
 * 输入：nums = [2,7,11,15], target = 9
 * 输出：[2,7] 或者 [7,2]
 * 示例 2：
 * 输入：nums = [10,26,30,31,47,60], target = 40
 * 输出：[10,30] 或者 [30,10]
 * 限制：
 * 1 <= nums.length <= 10^5
 * 1 <= nums[i] <= 10^6
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/he-wei-sde-liang-ge-shu-zi-lcof
 * @Create: 2020-07-07 13:26
 **/
public class Test {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));
    }
    public static int[] twoSum(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        int [] ret = new int[2];
        while (left < right) {
            if (nums[left] + nums[right] < target) {
                left++;
            }
            else if ( nums[left] + nums[right] > target) {
                right--;
            }
            else {
                ret[0] = nums[left];
                ret[1] = nums[right];
                break;
            }
        }
        return ret;
    }

}
