
/**
 * @Description:   安装下标奇偶 排列数组的奇偶
 * 给定一个非负整数数组 A， A 中一半整数是奇数，一半整数是偶数。
 * 对数组进行排序，以便当 A[i] 为奇数时，i 也是奇数；当 A[i] 为偶数时， i 也是偶数。
 * 示例：
 * 输入：[4,2,5,7]
 * 输出：[4,5,2,7]
 * 解释：[4,7,2,5]，[2,5,4,7]，[2,7,4,5] 也会被接受。
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/sort-array-by-parity-ii
 * @Create: 2020-05-24 13:57
 **/
public class Test {

        public static int[] sortArrayByParityII(int[] A) {
            int j = 1;
            for (int i = 0; i < A.length; i += 2)

                //一旦所有偶数都放在了正确的位置上，那么所有奇数也一定都在正确的位子上。
                // 所以只需要关注 A[0], A[2], A[4], ... 都正确就可以了。
                if (A[i] % 2 == 1) {
                    //让偶数部分下标 i 之前的所有数都是偶数。为了实现这个目标，把奇数部分作为暂存区，
                    // 不断增加指向奇数部分的指针，直到找到一个偶数，然后交换指针 i，j 所指的数。
                    while (A[j] % 2 == 1) {
                        j += 2;
                    }
                    // Swap A[i] and A[j]
                    int tmp = A[i];
                    A[i] = A[j];
                    A[j] = tmp;
                }
            return A;
        }
}
