/**
 * @Description:  移除元素
 * 给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。
 *
 * 不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。
 *
 * 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
 * 给定 nums = [3,2,2,3], val = 3,函数应该返回新的长度 2, 并且 nums 中的前两个元素均为 2。
 * 给定 nums = [0,1,2,2,3,0,4,2], val = 2,函数应该返回新的长度 5, 并且 nums 中的前五个元素为 0, 1, 3, 0, 4。
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/remove-element

 * @Create: 2020-05-02 21:57
 **/


// nums 是以“引用”方式传递的。也就是说，不对实参作任何拷贝
//int len = removeElement(nums, val);

// 在函数里修改输入数组对于调用者是可见的。
// 根据你的函数返回的长度, 它会打印出数组中 该长度范围内 的所有元素。
//       for (int i = 0; i < len; i++) {
//          print(nums[i]);
//        }

public class Test {



    public int removeElement(int[] nums, int val) {
        int count = 0;
        for (int i = 0; i <nums.length ; i++) {
            if ( nums[i] != val ) {
                nums[count] = nums[i]; //不相等的时候，将覆盖不一样的值 覆盖给新的数组 num，相等的时候就跳过了
                count++;
            }
        }
        return count;
    }



}
