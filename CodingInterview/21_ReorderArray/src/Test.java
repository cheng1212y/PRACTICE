/**
 * @Description:  面试题21：调整数组顺序使奇数位于偶数前面
 * 题目：输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有奇数位于数组的前半部分，所有偶数位于数组的后半部分。
 * @Author: Cheng
 * @Create: 2020-04-22 18:44
 **/
public class Test {


        public int[] exchange(int[] nums) {
            int left = 0;
            int right = nums.length - 1;
            while (left < right) {
                while (left < right && nums[left] % 2  != 0) {
                    //奇数
                    left++;                                             //遇到奇数就跳过
                }
                //left遇到偶数了                                     此时已经到达第一个偶数的位置
                while (left < right && nums[right] % 2 == 0) {
                    right--;
                }
                //right肯定遇到奇数了
                if (left < right) {                 //加 if判断是因为 lr 可能相等 比如 77766 最后lf相等了
                    int tmp = nums[left];
                    nums[left] = nums[right];
                    nums[right] = tmp;
                }
            }
            return nums;
        }




}
