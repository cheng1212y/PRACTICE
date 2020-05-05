/**
 * @Description:  完成二分查找
 * @Author: Cheng
 * @Create: 2020-05-05 19:39
 **/
public class Test {

    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        int mid  = 0;
        while (left <= right) {      //一定是<=  找最后一位 l r 在一起相遇，m的位置还没到位
            mid = (left+right)>>>1;
            if (target>nums[mid]) {
                left = mid + 1 ;
            }
            else if (target<nums[mid]) {
                right = mid - 1 ;
            }
            else {
                return mid;
            }
        }
        return -1;

    }


}
