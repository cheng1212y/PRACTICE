/**
 * @Description: 两数之和  不用+
 * 不使用运算符 + 和 - ​​​​​​​，计算两整数 ​​​​​​​a 、b ​​​​​​​之和。
 * 示例 1:
 * 输入: a = 1, b = 2
 * 输出: 3
 * 示例 2:
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/sum-of-two-integers
 * @Create: 2020-06-17 22:32
 **/
//位的异或运算跟求'和'的结果一致：
//异或 1^1=0 1^0=1 0^0=0
//求和 1+1=0 1+0=1 0+0=0

//位的与运算跟求'进位‘的结果一致：
//位与 1&1=1 1&0=0 0&0=0
//进位 1+1=1 1+0=0 0+0=0
//于是可以用异或运算和与运算来表示加法
public class Test {
    public int getSum(int a, int b) {
        int xor=0;
        int and = 0;
        while(b!=0){
            xor = a^b;
            and = (a&b)<<1;
            a=xor;
            b=and;
        }
        return a;
    }
}
