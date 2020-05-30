/**
 * @Description:    最大连续一的个数
给定一个二进制数组， 计算其中最大连续1的个数。
示例 1:
输入: [1,1,0,1,1,1]
输出: 3
解释: 开头的两位和最后的三位都是连续1，所以最大连续1的个数是 3.
输入的数组只包含 0 和1。
 * @来源： https://leetcode-cn.com/problems/max-consecutive-ones/
 * @Create: 2020-05-30 21:59
 **/
public class Test {


    public int findMaxConsecutiveOnes(int[] nums) {
        int count  = 0;
        int maxCount = 0;
        for( int i = 0;i<nums.length;i++) {
            if( nums[i] == 1 ) {
                count = count +1;
            }
            else {
                maxCount = Math.max(count,maxCount);
                count = 0;

            }
        }
        return Math.max( count,maxCount);
    }

}
