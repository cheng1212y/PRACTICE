/**
 * @Description: 递归求法
 * @Author: Cheng
 * @Create: 2020-04-20 23:24
 **/
public class Test {
    public static int fib(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }

}
