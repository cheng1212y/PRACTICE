/**
 * @Description: 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那两个整数，并返回他们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 * 示例:
 * 给定 nums = [2, 7, 11, 15], target = 9
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 * 链接：https://leetcode-cn.com/problems/two-sum
 * @Create: 2020-04-14 14:06
 **/
public class Test {
    public int[] twoSum(int[] nums, int target) {
        int[] re = new int[2];                      //动态创建了一个数组来接受返回值
        int i =0;
        int j =0;
        for (i=0;i<nums.length-1;i++) {
            for (j=i+1;j<nums.length;j++) {
                if (nums[i]+nums[j]==target) {
                    re[0]=i;
                    re[1]=j;
                }
            }
        }
        return re;  //数组可以作为返回值
    }
}
