import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/**
 * @Description:    给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
示例 1:   输入: "abcabcbb"      输出: 3   解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
示例 2: 输入: "bbbbb"   输出: 1   解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
示例 3:   输入: "pwwkew"    输出: 3   解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 * @Author: https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/
 * @Create: 2020-06-28 14:27
 **/
public class Test {
    public static void main(String[] args) {
        String s = "pwwkew";
        System.out.println(lengthOfLongestSubstring(s));
    }
    public static int lengthOfLongestSubstring(String s) {
   //用链表实现队列，队列是先进先出的
    Queue<Character> queue = new LinkedList<>();
    int res = 0;
        for (char c : s.toCharArray()) {
        while (queue.contains(c)) {
            //如果有重复的，队头出队
            queue.poll();
        }
        //添加到队尾
        queue.add(c);
        res = Math.max(res, queue.size());
    }
        return res;
    }
}
