/**
 * @Description: 给定一个正整数 num，编写一个函数，如果 num 是一个完全平方数，则返回 True，否则返回 False。
 * 说明：不要使用任何内置的库函数，如  sqrt。
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/valid-perfect-square
 * @Create: 2020-07-14 23:16
 **/


//完全平方数
//完全平方数是这样- -种数:它可以写成一个正整数的平
//方。例如，36是6x6, 49是7x7。
//●从1开始的n个奇数的和是-个完全平方数，n^2
//1+3+5+7+...+ (2n-1) =n^2。
//例如1+3+5+7+9=25=52。
//●每一个完全平方数的末位数是    0,1,4,5,6,或9。
//●每一个完全平方数要末能被3整除，要末减去1能被3整除。
//●每一个完全平方数要末能被4整除，要末减去1能被4整除。
//●每-一个完全平方数要末能被5整除，要末加上1或减去1能被5整除。
public class Test {
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(13));
    }

    public static boolean isPerfectSquare(int num) {
        int target = 1;
        while (num > 0){
            num -= target;
            target += 2;
        }
        return num == 0;
    }

}
