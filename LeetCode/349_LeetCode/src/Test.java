import java.util.*;

/**
 * @Description:  给定两个数组，编写一个函数来计算它们的交集。
 * 示例 1:输入: nums1 = [1,2,2,1], nums2 = [2,2]输出: [2]
 * 示例 2:输入: nums1 = [4,9,5], nums2 = [9,4,9,8,4]输出: [9,4]
 * 说明:输出结果中的每个元素一定是唯一的。我们可以不考虑输出结果的顺序。
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/intersection-of-two-arrays
 * @Author: Cheng
 * @Create: 2020-06-06 23:01
 **/
public class Test {
    public static void main(String[] args) {
        int  [] a = {1,2,2,1};
        int  [] b = {2,2};
        System.out.println(Arrays.toString(     intersection(a, b) ));

    }
    public static int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> list = new LinkedList<>();
        for ( int n : nums1) {
            list.add(n);
        }
        HashSet<Integer> set = new HashSet<>();
        for ( int ret : nums2) {
            if (list.contains(ret)) {
                set.add(ret);
            }
        }
        int [] arr = new int[set.size()];
        Iterator<Integer> iterator = set.iterator(); //迭代器
        List<Integer> list1 =new LinkedList<>();
        while ( iterator.hasNext()) {
            list1.add( iterator.next());
        }
        for (int i = 0; i <list1.size() ; i++) {
            arr[i] = list1.get(i);
        }
        return arr;
    }
}
