/**
 * @Description:   汉明距离
 * 两个整数之间的汉明距离指的是这两个数字对应二进制位不同的位置的数目。
 * 给出两个整数 x 和 y，计算它们之间的汉明距离。
 * 注意：
 * 0 ≤ x, y < 231.
 * 示例:
 * 输入: x = 1, y = 4
 * 输出: 2
 * 解释:
 * 1   (0 0 0 1)
 * 4   (0 1 0 0)
 *       ↑  ↑
 * 上面的箭头指出了对应二进制位不同的位置。
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/hamming-distance
 * @Create: 2020-06-15 17:25
 **/
public class Test {
    public static void main(String[] args) {
        int a =1;
        int b = 4;
        System.out.println(hammingDistance(a, b));
    }
    public static int hammingDistance(int x, int y) {
        int z = x^y;   //异或 不同为1
        int count = 0;
        while (z != 0 ) {
            z = z&(z-1);   //一个数字不断地和自己的减1的值  &  可以得到二进制中有几个1
            count ++;
        }
        return count;
    }

}
