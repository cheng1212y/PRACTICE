/**
 * @Description: 输入一个整型数组，数组里有正数也有负数。数组中的一个或连续多个整数组成一个子数组。求所有子数组的和的最大值。
 *
 * 要求时间复杂度为O(n)。
 *
 * 示例1:
 *
 * 输入: nums = [-2,1,-3,4,-1,2,1,-5,4]
 * 输出: 6
 * 解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/lian-xu-zi-shu-zu-de-zui-da-he-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @Author: Cheng
 * @Create: 2020-07-18 23:39
 **/
public class Test {
    public int maxSubArray(int[] nums) {

        int curSum = 0;
        int maxSum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i==0)  {
                curSum = nums[0];
                maxSum = nums[0];
            }
            else {
                curSum = Math.max(nums[i],nums[i]+curSum);
                /** 将当前值与最大值比较，取最大*/
                maxSum = Math.max(maxSum,curSum);
            }
        }
        return maxSum;
    }
}
