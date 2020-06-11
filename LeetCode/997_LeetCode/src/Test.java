/**
 * @Description:给定一个按非递减顺序排序的整数数组 A，返回每个数字的平方组成的新数组，要求也按非递减顺序排序。
 * 示例 1：
 * 输入：[-4,-1,0,3,10]
 * 输出：[0,1,9,16,100]
 * 示例 2：
 * 输入：[-7,-3,2,3,11]
 * 输出：[4,9,9,49,121]
 * 提示：
 * 1 <= A.length <= 10000
 * -10000 <= A[i] <= 10000
 * A 已按非递减顺序排序。
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/squares-of-a-sorted-array
 * @Author: Cheng
 * @Create: 2020-06-11 17:26
 **/
//由于原数组按照非递减顺序排列（包含正数和负数），
// 可采用双指针方式，从原数组两头往中间进行数字平方结果的比较。
// 结果需要按照非递减顺序排列，则可考虑从后往前填充结果。
// 先将平方数值大的放入结果数组的尾部，然后移动原数组的左右指针向中间靠拢。
public class Test {

    /** resIndex 用来存储最大的值*/
        public int[] sortedSquares(int[] A) {
            int len = A.length;
            int[] res = new int[len];
            int left = 0, right = len - 1, resIndex = len - 1;
            while (left <= right) {
                if (A[left] * A[left] <= A[right] * A[right]) {
                    res[resIndex--] = A[right] * A[right];
                    right--;
                } else {
                    res[resIndex--] = A[left] * A[left];
                    left++;
                }
            }
            return res;
        }
}
