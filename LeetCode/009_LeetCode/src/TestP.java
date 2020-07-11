/**
 * @Description:
 * @Author: Cheng
 * @Create: 2020-07-11 20:45
 **/
public class TestP {
    public static void main(String[] args) {
        System.out.println(isPalindrome(112211));
    }

    public static boolean isPalindrome(int x) {
        //边界判断
        if (x < 0) return false;
        int div = 1;
        //
        while (x / div >= 10) div *= 10;
        while (x > 0) {
            int left = x / div;
            int right = x % 10;
            if (left != right) return false;
            x = (x % div) / 10;
            div /= 100;
        }
        return true;
    }

}
