import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 * @Description:  数组形式的整数加法
 * 对于非负整数 X 而言，X 的数组形式是每位数字按从左到右的顺序形成的数组。例如，如果 X = 1231，那么其数组形式为 [1,2,3,1]。
 * 给定非负整数 X 的数组形式 A，返回整数 X+K 的数组形式。
 * 示例 1：
 * 输入：A = [1,2,0,0], K = 34         输出：[1,2,3,4]            解释：1200 + 34 = 1234

 * 输入：A = [9,9,9,9,9,9,9,9,9,9], K = 1      输出：[1,0,0,0,0,0,0,0,0,0,0]          解释：9999999999 + 1 = 10000000000
 * 1 <= A.length <= 10000
 * 0 <= A[i] <= 9
 * 0 <= K <= 10000
 * 如果 A.length > 1，那么 A[0] != 0
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/add-to-array-form-of-integer
 * @Create: 2020-05-25 23:22
 **/



//[1,2,3+912]。然后，我们计算 3+912 = 9153+912=915。55 留在当前这一位，将 910/10=91910/10=91 以进位的形式加入下一位。
//然后，我们再重复这个过程，计算 [1, 2+91, 5][1,2+91,5]。我们得到 9393，33 留在当前位，将 90/10=990/10=9 以进位的形式加入下一位。
// 继而又得到 [1+9, 3, 5][1+9,3,5]，重复这个过程之后，最终得到结果 [1, 0, 3, 5][1,0,3,5]。
public class Test {

    class Solution {
        public List<Integer> addToArrayForm(int[] A, int K) {
            int N = A.length;
            int cur = K;
            List<Integer> ans = new ArrayList();

            int i = N;
            while (--i >= 0 || cur > 0) {
                if (i >= 0)
                    cur += A[i];
                ans.add(cur % 10);
                cur /= 10;
            }

            Collections.reverse(ans);
            return ans;
        }
    }


}
