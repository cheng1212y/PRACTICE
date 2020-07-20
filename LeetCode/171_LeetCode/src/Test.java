/**
 * @Description: 给定一个Excel表格中的列名称，返回其相应的列序号。
 *
 * 例如，
 *
 *     A -> 1
 *     B -> 2
 *     C -> 3
 *
 * 标签：字符串遍历，进制转换
 * 初始化结果ans = 0，遍历时将每个字母与A做减法，因为A表示1，所以减法后需要每个数加1，计算其代表的数值num = 字母 - ‘A’ + 1
 * 因为有26个字母，所以相当于26进制，每26个数则向前进一位
 * 所以每遍历一位则ans = ans * 26 + num
 * 以ZY为例，Z的值为26，Y的值为25，则结果为26 * 26 + 25=701
 * 时间复杂度：O(n)
 *
 * 链接：https://leetcode-cn.com/problems/excel-sheet-column-number/solution/hua-jie-suan-fa-171-excelbiao-lie-xu-hao-by-guanpe/
 * 来源：力扣（LeetCode）
 * @Create: 2020-07-20 23:30
 **/
public class Test {    public int titleToNumber(String s) {
    int ans = 0;
    for(int i=0;i<s.length();i++) {
        int num = s.charAt(i) - 'A' + 1;
        ans = ans * 26 + num;
    }
    return ans;
}
}
