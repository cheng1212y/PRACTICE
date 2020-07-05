/**
 * @Description: 如果数组是单调递增或单调递减的，那么它是单调的。
 * 如果对于所有 i <= j，A[i] <= A[j]，那么数组 A 是单调递增的。 如果对于所有 i <= j，A[i]> = A[j]，那么数组 A 是单调递减的。
 * 当给定的数组 A 是单调数组时返回 true，否则返回 false。
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/monotonic-array
 * @Create: 2020-07-05 21:41
 **/

    // 1 2 2 3
    // 6 5 4 4
    // 1  3  2
    // 1 2 4 5
public class Test {

    public static void main(String[] args) {
        System.out.println(isMonotonic(new int[]{1, 3, 2}));
    }
    public static boolean isMonotonic(int[] A) {
        if (A.length <= 2 ) {
            return true;
        }
        int left = A[0];
        int rigth = A[A.length-1];

        if (left<rigth) {
            for (int i = 0; i <=A.length -2; i++) {
                if (A[i] >A[i+1] ) {
                    return false;
                }
            }
        }
        else if (left>rigth){
// 6  1 3
            for (int j = 0; j <=A.length-2; j++) {
                if (A[j] <A[j+1]) {
                    return false;
                }
            }
        }
        else {
            for (int h = 0; h <= A.length-2; h++) {
                if (A[h] != A[h+1]) {
                    return false;
                }
            }
        }
        return true;

    }
}
