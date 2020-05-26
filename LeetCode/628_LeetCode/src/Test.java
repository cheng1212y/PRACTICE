import java.util.Arrays;

/**
 * @Description: 三个数的最大乘积
给定一个整型数组，在数组中找出由三个数组成的最大乘积，并输出这个乘积。
示例 1:
输入: [1,2,3]
输出: 6
示例 2:
输入: [1,2,3,4]
输出: 24
注意:
给定的整型数组长度范围是[3,104]，数组中所有的元素范围是[-1000, 1000]。
输入的数组中任意三个数的乘积不会超出32位有符号整数的范围。
 * 来源：https://leetcode-cn.com/problems/maximum-product-of-three-numbers/
 * @Create: 2020-05-26 23:00
 **/

//[-5, -4, 0, 1, 5, 6]
//[-5, -3, -1, 5, 5, 6]
//[-5, 0, 1, 5, 5, 6]


public class Test {
        public int maximumProduct(int[] nums) {
            int len = nums.length;
            Arrays.sort(nums);

            // 至少有两个负数
            boolean isNegativeNumber = nums[0] <= 0 && nums[1] <= 0;
            if (isNegativeNumber) {
                return Math.max(nums[0] * nums[1], nums[len - 2] * nums[len - 3]) * nums[len - 1];
            } else {
                return nums[len - 1] * nums[len - 2] * nums[len - 3];
            }
        }
    }
