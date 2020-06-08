/**
 * @Description:  整数反转
 *
给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
示例 1:
输入: 123
输出: 321
示例 2:

输入: -123
输出: -321
示例 3:

输入: 120
输出: 21
注意:

假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−231,  231 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。

通过次数370,613提交次数1,081,649
 * @Author: Cheng
 * @Create: 2020-06-08 22:42
 **/
public class Test {
    public int reverse(int x) {
        long rst=0;
        while(x!=0){
            rst= rst*10+ x%10;
            x=x/10;

        }
        if((int)rst!=rst){  //rst 是long型 记录实际值 （int）rst 将rst 强制转换为int 型如果值过大会变成溢出之后的值 ，
                            // 实际值不在与 long型相等 ，如果没有溢出 两者会相等
            return 0;

        }else{
            return (int)rst;
        }
    }
}
