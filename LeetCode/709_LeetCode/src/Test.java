/**
 * @Description:实现函数 ToLowerCase()，该函数接收一个字符串参数 str，并将该字符串中的大写字母转换成小写字母，之后返回新的字符串。
 * 输入: "LOVELY"
 * 输出: "lovely"
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/to-lower-case
 * @Create: 2020-08-16 21:32
 **/
public class Test {
    public String toLowerCase(String str) {
        char[] chars = str.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] <= 90 && chars[i] >= 65) {
                chars[i] = (char) (chars[i] + 32);
            }
        }
        return String.valueOf(chars);
    }
}
