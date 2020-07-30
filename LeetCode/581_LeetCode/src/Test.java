/**
 * @Description: 给定一个整数数组，你需要寻找一个连续的子数组，如果对这个子数组进行升序排序，那么整个数组都会变为升序排序。
 * 你找到的子数组应是最短的，请输出它的长度。
 * 示例 1:
 * 输入: [2, 6, 4, 8, 10, 9, 15]
 * 输出: 5
 * 解释: 你只需要对 [6, 4, 8, 10, 9] 进行升序排序，那么整个表都会变为升序排序。
 * 说明 :
 * 输入的数组长度范围在 [1, 10,000]。
 * 输入的数组可能包含重复元素 ，所以升序的意思是<=。
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/shortest-unsorted-continuous-subarray
 * @Create: 2020-07-30 22:55
 **/
public class Test {
    public static void main(String[] args) {
        System.out.println(findUnsortedSubarray(new int[]{2, 6, 4, 8, 10, 9, 15}));
    }
    public static int findUnsortedSubarray(int[] nums) {
        int n=nums.length;
        int left=0;
        int right=n-1;
        int max=nums[0];
        int min=nums[n-1];
        //从左往右遍历，每次遍历都应该大于等于之前遍历过的元素的最大值
        for(int i=0;i<n;i++){
            if(nums[i]<max){
                left=i;
            }
            else{
                max=nums[i];
            }
        }
        //如果是递增数组，left不变
        if(left==0) return 0;
        //从右往左遍历，每次遍历都应该小于等于之前遍历过的元素的最小值
        for(int j=n-1;j>=0;j--){
            if(nums[j]>min) {
                right=j;
            }
            else {
                min=nums[j];
            }
        }
        //left移到了所选子数组的最后一个元素，right移到了子数组第一个元素
        return left-right+1;
    }
}
