/**
 * @Description: 给定一个字符串，逐个翻转字符串中的每个单词。
 * 示例 1：
 * 输入: "the sky is blue"     * 输出: "blue is sky the"
 * 示例 2： * 输入: "  hello world!  "     * 输出: "world! hello"
 * 解释: 输入字符串可以在前面或者后面包含多余的空格，但是反转后的字符不能包括。
 * 示例 3：   * 输入: "a good   example"    * 输出: "example good a"
 * 解释: 如果两个单词间有多余的空格，将反转后单词间的空格减少到只含一个。
 *
 * 无空格字符构成一个单词。
 * 输入字符串可以在前面或者后面包含多余的空格，但是反转后的字符不能包括。
 * 如果两个单词间有多余的空格，将反转后单词间的空格减少到只含一个。
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/reverse-words-in-a-string
 * @Create: 2020-06-27 21:43
 **/
public class Test {
    public static void main(String[] args) {
        String s= " the sky is blue";
        System.out.println(reverseWords(s));
    }
    public static String reverseWords(String s) {
        char[] ca = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        int l = ca.length - 1;
        int r = l;
        while (r >= 0) {
            while (l >= 0 && ca[l] == ' ') {
                l--;
                r--;
            }
                while (l >= 0 && ca[l] != ' ') {
                    l--;
                }
                    sb.append(s.substring(l + 1, r + 1)).append(" ");
                    r = l;
        }
        return sb.toString().trim();
    }
}
