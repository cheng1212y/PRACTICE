/**
 * @Description: 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 * 你可以假设数组中无重复元素。
 * 示例 1    输入: [1,3,5,6], 5     输出: 2
 * 示例 2:  输入: [1,3,5,6], 2     输出: 1
 * 示例 3:   输入: [1,3,5,6], 7   输出: 4
 * 示例 4:输入: [1,3,5,6], 0      输出: 0
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/search-insert-position
 * @Create: 2020-04-21 22:39
 **/
public class Test {




    class Solution {
        public int searchInsert(int[] nums, int target) {   //通过层层筛选条件

            if ( target == 0 ) {
                return 0;                                      //为0 直接出
            }
            int l =0 ;
            int r =nums.length-1;
            int m = 0;
            while (l <= r) {
                m = ( l + r ) >>>1;
                if(nums [m] < target) {
                    l = m + 1;
                }
                else if (nums[m] > target) {
                    r = m - 1;
                }
                else {
                    return m;                                      //一个二分查找返回下标
                }
            }
                                                                //走到这里是表示没有找到这个元素
            for (int i = 0; i <nums.length ; i++) {
                if( nums[i] > target) {
                    return i;
                }                                               //也在中间位置
            }
            return nums.length;                                 //只能在最后一个位置
        }
    }










}
