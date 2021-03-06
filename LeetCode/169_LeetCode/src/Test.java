/**
 * @Description: 多数元素
 * 给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。
 * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
 * 示例 1:
 * 输入: [3,2,3]
 * 输出: 3
 * 示例 2:
 * 输入: [2,2,1,1,1,2,2]
 * 输出: 2
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/majority-element
 * @Create: 2020-05-21 23:23
 **/
public class Test {

    //摩尔投票法
    public int majorityElement(int[] nums) {
        int candNum=nums[0];
        int count=1;
        for(int num:nums){
            if(num==candNum){
                count++;
            }else{
                count--;
                if(count==0){
                    count=1;
                    candNum=num;
                }
            }
        }
        return candNum;
    }
}
