import java.util.Arrays;

/**
 * @Description: 统计所有小于非负整数 n 的质数的数量。
 * 示例:
 * 输入: 10
 * 输出: 4
 * 解释: 小于 10 的质数一共有 4 个, 它们是 2, 3, 5, 7 。
 * @Author: Cheng
 * @Create: 2020-08-24 23:53
 **/
public class Test {
    public int countPrimes(int n) {
        boolean[] isPrim = new boolean[n];
        // 将数组都初始化为 true
        Arrays.fill(isPrim, true);

        for (int i = 2; i < n; i++)  {
            if (isPrim[i])  {
                // i 的倍数不可能是素数了
                for (int j = 2 * i; j < n; j += i)  {
                    isPrim[j] = false;
                }
            }

        }
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrim[i]) count++;
        }

        return count;
    }
}
