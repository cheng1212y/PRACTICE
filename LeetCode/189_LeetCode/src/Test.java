
/**
 * @Description: 旋转数组
 * 给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
 * 示例 1:
 * 输入: [1,2,3,4,5,6,7] 和 k = 3
 * 输出: [5,6,7,1,2,3,4]
 * 解释:
 * 向右旋转 1 步: [7,1,2,3,4,5,6]
 * 向右旋转 2 步: [6,7,1,2,3,4,5]
 * 向右旋转 3 步: [5,6,7,1,2,3,4]
 * 示例 2:
 * 输入: [-1,-100,3,99] 和 k = 2
 * 输出: [3,99,-1,-100]
 * 解释:
 * 向右旋转 1 步: [99,-1,-100,3]
 * 向右旋转 2 步: [3,99,-1,-100]
 * 要求使用空间复杂度为 O(1) 的 原地 算法。
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/rotate-array
 * @Create: 2020-05-22 22:46
 **/


//        原始数组                  : 1 2 3 4 5 6 7
//        反转所有数字后             : 7 6 5 4 3 2 1
//        反转前 k 个数字后          : 5 6 7 4 3 2 1
//        反转后 n-k 个数字后        : 5 6 7 1 2 3 4 --> 结果
public class Test {
        public static void back( int [] arr,int left,int right ) {
            while (left < right) {
                int tmp = arr[left];
                arr[left]= arr[right];
                arr[right] = tmp;
                left++;
                right--;
            }
        }
        public void rotate(int[] arr, int k) {
            k %= arr.length;
            back(arr,0,arr.length-1);
            back(arr,0,k-1);
            back(arr,k,arr.length-1);
        }
    }

