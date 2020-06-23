/**
 * @Description:  给定一个二进制矩阵 A，我们想先水平翻转图像，然后反转图像并返回结果。
水平翻转图片就是将图片的每一行都进行翻转，即逆序。例如，水平翻转 [1, 1, 0] 的结果是 [0, 1, 1]。
反转图片的意思是图片中的 0 全部被 1 替换， 1 全部被 0 替换。例如，反转 [0, 1, 1] 的结果是 [1, 0, 0]。
 * @Author: https://leetcode-cn.com/problems/flipping-an-image/
 * @Create: 2020-06-23 21:38
 **/
public class Test {
    public int[][] flipAndInvertImage(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            int start = 0, end = A[i].length - 1;
            while (start <= end) {
                // 如果不相等， 那么这两个值不需要更换
                if (A[i][start] != A[i][end]) {
                    start++;
                    end--;
                } else {
                    //如果相等，那么这两个值同时改变  1-->0, 0-->1;
                    A[i][end]= A[i][start] = A[i][start] == 1 ? 0 : 1;
                    start++;
                    end--;
                }
            }
        }
        return A;
    }
}
