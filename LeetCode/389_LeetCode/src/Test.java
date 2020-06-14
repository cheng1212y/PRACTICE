/**
 * @Description:
 * 给定两个字符串 s 和 t，它们只包含小写字母。
 * 字符串 t 由字符串 s 随机重排，然后在随机位置添加一个字母。
 * 请找出在 t 中被添加的字母。
 * 输入：
 * s = "abcd"
 * t = "abcde"
 * 输出：
 * e
 * 'e' 是那个被添加的字母。
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/find-the-difference
 * @Author: Cheng
 * @Create: 2020-06-14 23:12
 **/


public class Test {
    public static void main(String[] args) {
        String s = "abcd";
        String t = "aebcd";
        System.out.println(findTheDifference(s, t));
    }
    public static char findTheDifference(String s, String t) {
        char res = t.charAt(t.length()-1);
        for(int i=0; i<s.length(); i++){
            res ^= s.charAt(i);             //  按位与运算  能够去重
            res ^= t.charAt(i);
        }
        return res;
    }
}
