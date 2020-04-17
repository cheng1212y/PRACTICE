/**
 * @Description:    这个方法是通过暴力破解， for循环加 计数器
 * @Author: Cheng
 * @Create: 2020-04-17 22:08
 **/
public class TestS {

    class Solution {
        public int singleNumber(int[] nums) {
            int i = 0;
            int j = 0;
            int a = 0;
            for (i = 0; i < nums.length; i++) {
                int  count = 0;                       //每次都置0 否则第一趟没找到写外循环 初始值为2
                for (j = 0; j < nums.length; j++) {
                    if (nums[i] == nums[j])
                        count++;                   // 与自己比一次为1 和一对中的另一个比一下为2
                }
                if (count == 1) {                //只和自己比了一次
                    a = nums[i];
                    break;
                }
            }
            return a;
        }
    }

}
