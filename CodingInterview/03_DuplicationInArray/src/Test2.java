/**
 * @Description:     找出数组中重复的数字。---------但是不能修改原来的数组(利用二分查找的思想)
 * @Author: Cheng
 * @Create: 2020-07-10 12:16
 **/


/**我们把从1~n的数字从中间的数字m分为两部分，前面一半为1~m， 后面一半为
 m+1~n。如果I~m的数字的数目超过m,那么这一半的区间
 里一定包含重复的数字;否则，另一半m+1~n的区间里一定包含重复的数
 字。我们可以继续把包含重复数字的区间一分为二，直到找到一个重复的
 数字。这个过程和二分查找算法很类似，只是多了一.步统计区间里数字的
 数目。
 */
public class Test2 {
    public static void main(String[] args) {
      System.out.println(findRepeatNumber(new int[]{2, 3, 5, 4, 3, 2, 6,7}));
    }
    public static int findRepeatNumber(int[] nums) {
        int start = 1;
        int end = nums.length-1;
        while (end >= start) {
            int middle = ((end-start)>>1) +start;//中间的数字

            /** 第一次时候判断1-4出现的次数
             * */

            int count = func(nums,start,  middle);
            //终止条件
            if (end == start) {
                if (count > 1 ) {
                    return start;
                }
                else {
                    break;
                }
            }
                    //第一次时候：如果1-4的个数在数组中大于了middle的4，
                    // 那么重复的一定是左边，右边砍掉，类似二分查找砍一半
                    if (count> (middle-start+1)) {
                        end = middle;
                    }
                    //小于的时候 ，一定是middle的右边出现了重复的元素
                    // 需要将左边砍掉
                    else {
                        start = middle+1;
                    }
        }
        return -1;
    }

    private static int func(int[] nums, int start,  int middle) {
        int count = 0;
        for (int i = 0; i <nums.length ; i++) {
            if (nums[i] >= start && nums[i] <= middle) {
                ++count;
            }
        }
        return count;
    }

}
