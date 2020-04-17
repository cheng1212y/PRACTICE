/**
 * @Description:  给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 * 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
 * 示例 1:
 * 输入: [2,2,1]
 * 输出: 1
 * 示例 2:
 * 输入: [4,1,2,1,2]
 * 输出: 4
 * 链接：https://leetcode-cn.com/problems/single-number
 * @Create: 2020-04-17 21:51
 **/
public class Test {
    class Solution {
        public int singleNumber(int[] nums) {
            int i = 0;
            int re = 0;
            for(i=0;i<nums.length;i++) {
                re  = re ^ nums[i];  // ----------这里循环的异或每一个数，将筛选出出现一次的数
            }                        //   1 1 2 2  3 3 6  相同的数异或将为0 异或也有结合律
                                    //      0011
            return re;              //      0011
        }                           //   ^  0000
    }




}
