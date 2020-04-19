/**
 * @Description: 在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按
 * // 照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个
 * // 整数，判断数组中是否含有该整数。
 * @Author: Cheng
 * @Create: 2020-04-19 21:19
 **/
public class Test {

    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j < matrix[i].length ; j++) {
                if ( matrix[i][j] == target) {                     //二维数组的行想象成元素， 列想象行元素的 子元素

                    return true;
                }
            }
        }
        return false;
    }




}
