/**
 * @Description:  查找子串在主串中的下标位子
 * 给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。
 * 示例 1:
 * 输入: haystack = "hello", needle = "ll"
 * 输出: 2
 * 示例 2:
 * 输入: haystack = "aaaaa", needle = "bba"
 * 输出: -1
 * 说明:
 * 当 needle 是空字符串时，我们应当返回什么值呢？这是一个在面试中很好的问题。
 * 对于本题而言，当 needle 是空字符串时我们应当返回 0 。这与C语言的 strstr() 以及 Java的 indexOf() 定义相符。
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/implement-strstr
 * @Create: 2020-05-27 22:42
 **/
public class Test {
    public int strStr(String haystack, String needle) {
            if (needle.length() < 1 && haystack.length() < 1) {
                return 0;
            }
            if (haystack.length() != 0 && needle.length() <1 ) {
                return 0;
            }
            if (haystack == null || needle == null || needle.length()<1) {
                return -1;
            }
            if ( haystack.length() < needle.length()) {
                return -1;
            }
            char [] hayArray = haystack.toCharArray();
            char [] neeArray = needle.toCharArray();
            int hLen = haystack.length();
            int nLen = needle.length();
            for (int i = 0; i <hLen ; i++) {
                if(hayArray[i] == neeArray[0] && (i+nLen <= hLen)){   //初始的时候 应该和子串的0位置比较
                    int equalCount = 0;
                    for (int j = 0; j <nLen ; j++) {
                        if ( hayArray[i+j] == neeArray[j] ) {
                            equalCount++;
                        }
                    }
                    if ( equalCount == nLen) {
                        return i;
                    }
                }
            }
            return -1;
    }
}
