
/**
 * @Description:  相对于第一种方式，此方法通过按位与这个数减一，每次会消去最右边的一个1
 * @Author: Cheng
 * @Create: 2020-04-14 11:37
 **/
import java.util.Scanner;
public class TestPlus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(NumberOf1P(n));
    }
    public static int NumberOf1P(int n) {
        int count = 0;
        while (n != 0){
            n  = n & (n -1);  //每次都会使得最右边的一个1变为0
                count++;
            }
        return count;
    }
}


//        14 -> 1110          12 -> 1100        8 -> 1000
//        13 -> 1101          11 -> 1011        7 -> 0111
//        &     1100 (12)     &  -> 1000(8)     &    0000
