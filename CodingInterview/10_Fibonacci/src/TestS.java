/**
 * @Description:  迭代求法
 * @Author: Cheng
 * @Create: 2020-04-20 23:27
 **/
public class TestS {

    public static int fib(int n) {
        int a = 1;
        int b = 1;
        int c = 0;
        for (int i = 3; i <= n; i++) {
            c = b + a;                    //前一个值加第二个 等于第三个
            a = b;
            b = c;
        }
        return c;
    }



}
