/**
 * @Description:         数组的偶数 排在前  奇数排在后  不要求排序
 *给定一个非负整数数组 A，返回一个数组，在该数组中， A 的所有偶数元素之后跟着所有奇数元素。
 * 你可以返回满足此条件的任何数组作为答案。
 * 示例：
 * 输入：[3,1,2,4]
 * 输出：[2,4,3,1]
 * 输出 [4,2,3,1]，[2,4,1,3] 和 [4,2,1,3] 也会被接受。
 * 提示：
 * 1 <= A.length <= 5000
 * 0 <= A[i] <= 5000
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/sort-array-by-parity
 * @Create: 2020-05-23 15:58
 **/
public class Test {
    public int[] sortArrayByParity(int[] arr) {
        int left = 0;
        int right = arr.length-1;
        while ( left < right ) {
            while (left < right &&  arr[left] % 2 == 0) {   /** 此处加上 left< right 的条件  否则 [0 ,2] 这种将会数组越界*/
                left++;
            }
            while (left < right &&  arr[right] % 2 == 1) {
                right--;
            }
            if (left<right) {
                int tmp = arr[left];
                arr[left] = arr[right];
                arr[right] = tmp;
            }
        }
        return arr;
    }
}
