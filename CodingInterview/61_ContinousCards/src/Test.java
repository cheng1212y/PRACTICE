import java.util.Arrays;
import java.util.HashSet;

/**
 * @Description: 题目:从扑克牌中随机抽5张牌，判断是不是一个顺子，即这5张牌
 * 是不是连续的。2~10为数字本身，A为1，J为11, Q为12, K为13,而大、小王可以看成任意数字。
 * 输入: [1,2,3,4,5]
 * 输出: True
 * 示例 2:
 * 输入: [0,0,1,2,5]
 * 输出: True
 * 限制：
 * 数组长度为 5 
 * 数组的数取值为 [0, 13] .
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/bu-ke-pai-zhong-de-shun-zi-lcof
 * @Create: 2020-07-16 21:08
 **/

/**
 *    //如果重复，肯定错误。 如果不存在0，则最大值最小值之差必定为4 其他情况，最大值最小值之差小于4即可
 *         //0 0 2   6
 *         */
public class Test {
    public static void main(String[] args) {
        System.out.println(isStraight(new int[]{1,2,3,4,5}));
    }
    public static boolean isStraight(int[] nums) {
        Arrays.sort(nums);//排序
        // 0 1 3 4 5
        int zero = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zero++;
            }
        }
        int target = 0;
        int[] arr = Arrays.copyOfRange(nums,zero,nums.length);
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i+1]==arr[i]) {
                return false;
            }
            if (arr[i+1]-arr[i] != 1) {
                target +=arr[i+1]-arr[i];
            }
        }
        if (zero == 0 &&  ((arr[arr.length-1]-arr[0] )== 4 )   ) {
            return true;
        }

        if (zero!= 0 && (arr[arr.length-1]-arr[0] ) <= 4) {
            return true;
        }
        return false;

    }
}
