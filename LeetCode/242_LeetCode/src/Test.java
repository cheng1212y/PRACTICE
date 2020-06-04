
/**
 * @Description:  有效字母的异位词
 * 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
 *
 * 示例 1:
 *
 * 输入: s = "anagram", t = "nagaram"
 * 输出: true
 * 示例 2:
 *
 * 输入: s = "rat", t = "car"
 * 输出: false
 * 说明:
 * 你可以假设字符串只包含小写字母。
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/valid-anagram
 * @Author: Cheng
 * @Create: 2020-06-04 23:30
 **/
public class Test {

    public boolean isAnagram(String s, String t) {
            if(s.length() != t.length())
                return false;
            int[] alpha = new int[26];
            for(int i = 0; i< s.length(); i++) {
                alpha[s.charAt(i) - 'a'] ++;   //通过哈希
                alpha[t.charAt(i) - 'a'] --;
            }
            for(int i=0;i<26;i++)
                if(alpha[i] != 0)
                    return false;
            return true;
        }
}
