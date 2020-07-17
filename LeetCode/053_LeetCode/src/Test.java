/**
 * @Description: 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 * 示例:
 * 输入: [-2,1,-3,4,-1,2,1,-5,4],
 * 输出: 6
 * 解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/maximum-subarray
 * @Create: 2020-07-17 11:35
 **/

/** 贪心算法：   1、若当前指针所指元素之前的和小于0,则丢弃当前元素之前的数列
 *               2、将当前值与最大值比较，取最大
 *
 当前值: -2         1      -3      4       -1      2   1   -5  4   1     2
 之前和: null      -2      1       -2      4       3   5   6   1   null  1
 当前和: -2         1      -2      4       3       5   6   1   5   1     3
 最大和: -2        1       1       4       4       5   6   6   6   1     3
 */
public class Test {
    public static void main(String[] args) {
        func(new int[] {1,2});
    }
    private static void func(int[] arr) {
        int curSum = 0;
        int maxSum = 0;
        for (int i = 0; i < arr.length; i++) {
            //第一次的时候
            if (i==0)  {
                curSum = arr[0];
                maxSum = arr[0];
            }
            /**若当前指针所指元素之前的和小于0,
             则丢弃当前元素之前的数列
             */
            else {
                curSum = Math.max(arr[i],arr[i]+curSum);
                /** 将当前值与最大值比较，取最大*/
                maxSum = Math.max(maxSum,curSum);
            }
        }
        System.out.println(maxSum);
    }
}

