/**
 * @Description: 找出数组中重复的数字。
 * 在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。
 * 输入：
 * [2, 3, 1, 0, 2, 5, 3]
 * 输出：2 或 3
 * 来源：力扣（LeetCode） * 链接：https://leetcode-cn.com/problems/shu-zu-zhong-zhong-fu-de-shu-zi-lcof
 * @Create: 2020-07-10 11:33
 **/

/**如果没有重复数字，那么正常排序后，数字i应该在下标为i的位置，所以思路是重头扫描数组，遇到下标为i的数字如果不是i的话，
 * （假设为m),那么我们就拿与下标m的数字交换。在交换过程中，如果有重复的数字发生，那么终止返回ture*/

public class Test1 {
    public static void main(String[] args) {
        System.out.println(findRepeatNumber(new int[]{2, 3, 1, 0, 2, 5, 3}));
    }
    public static int findRepeatNumber(int[] nums) {
        int ret = 0;
        for (int i = 0; i <nums.length ; i++) {
            boolean flag = false;
                while (nums[i] != i) {//交换元素直到下标和元素对应

                    //判断是否遇到重复的了
                    if (nums[i] == nums[nums[i]]) {
                        ret = nums[nums[i]];
                        flag =true;
                        break;
                    }
                    int tmp = nums[i];
                    nums[i] = nums[tmp];
                    nums[tmp] = tmp;
                }
                if (flag == true) {
                    ret = nums[nums[i]];
                    break;
                }
            }
        return ret;
    }
}
