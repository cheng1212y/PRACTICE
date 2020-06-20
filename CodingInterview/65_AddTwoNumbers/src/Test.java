import java.util.Scanner;

/**
 * @Description:     不用加减乘除做 +法
 * @Author: Cheng
 * @Create: 2020-06-19 22:42
 **/
public class Test {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(func(a, b));
    }
//位的异或运算跟求'和'的结果一致：
//异或 1^1=0 1^0=1 0^0=0
//求和 1+1=0 1+0=1 0+0=0

    //位的与运算跟求'进位‘的结果一致：
//位与 1&1=1 1&0=0 0&0=0
//进位 1+1=1 1+0=0 0+0=0
//于是可以用异或运算和与运算来表示加法
    private static int func(int a, int b) {
        int xor = 0;
        int and = 0;

        while ( b!=0) {
            xor  = a ^ b;
            and = (a & b) <<1;
            a = xor ;
            b = and;
        }
        return a ;
    }
}
