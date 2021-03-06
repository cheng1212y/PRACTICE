/**
 * @Description: 给定一个字符串，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。
 * 示例 1:
 * 输入: "Let's take LeetCode contest"
 * 输出: "s'teL ekat edoCteeL tsetnoc" 
 * 注意：在字符串中，每个单词由单个空格分隔，并且字符串中不会有任何额外的空格。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/reverse-words-in-a-string-iii
 * @Create: 2020-08-01 23:50
 **/
public class Test {
    public String reverseWords(String s) {
        char[] sentence = s.toCharArray();
        int i = 0, j = 0;
        while(j < sentence.length) {
            while(i < sentence.length && sentence[i] == ' ') ++i;
            while(j < sentence.length && sentence[j] != ' ') ++j;
            reverse(sentence, i, j - 1);
            i = j;
            ++j;
        }
        s = String.valueOf(sentence);
        return s;
    }

    private void reverse(char[] arr, int start, int end) {
        if (arr.length == 0) return;

        while (start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            ++start;
            --end;
        }
}
}

