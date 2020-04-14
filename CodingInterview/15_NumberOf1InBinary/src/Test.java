
/**
 * @Description:  请实现一个函数， 输入一个整数， 输出该数二进制表示中1的 个数。
 * 例如， 把9表示成二进制是1001, 有2位是1。 因此， 如果输入9, 则该函数输出2。
 * @Author: Cheng
 * @Create: 2020-04-14 11:30
 **/
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(NumberOf1(n));
    }
    public static int NumberOf1(int n) {
        int i = 0;
        int count = 0;
        for (i = 0; i < 32; i++) {
            if ((n & (1 << i)) == (1 << i)) { //将二进制位中的每一位按位与1
                count++;
            }
        }
        return count;
    }
}



