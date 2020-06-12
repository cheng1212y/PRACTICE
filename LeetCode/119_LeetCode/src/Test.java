import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * 给定一个非负索引 k，其中 k ≤ 33，返回杨辉三角的第 k 行。
 * 在杨辉三角中，每个数是它左上方和右上方的数的和。
 * 示例:
 * 输入: 3
 * 输出: [1,3,3,1]
 * 进阶：
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/pascals-triangle-ii
 * @Author: Cheng
 * @Create: 2020-06-12 21:48
 **/

public class Test {
    public List<Integer> getRow(int rowIndex) {
    int[] ans = new int[rowIndex + 1];
    int index = 0;
            while (index <= rowIndex) {
        for (int j = index; j > 0; j--) {
            ans[j] = ans[j - 1] + ans[j];
        }
        ans[index] = 1;
        index++;
    }
    List<Integer> result = new ArrayList<>(ans.length);
            for (int num : ans) {
        result.add(num);
    }
            return result;
    }
}
