/**
 * @Description: 仅仅反转字母
 * 给定一个字符串 S，返回 “反转后的” 字符串，其中不是字母的字符都保留在原地，而所有字母的位置发生反转。
 * 示例 1：
 * 输入："ab-cd"
 * 输出："dc-ba"
 * 示例 2：
 * 输入："a-bC-dEf-ghIj"
 * 输出："j-Ih-gfE-dCba"
 * 示例 3：
 * 输入："Test1ng-Leet=code-Q!"
 * 输出："Qedo1ct-eeLg=ntse-T!"
 * 提示：
 * S.length <= 100
 * 33 <= S[i].ASCIIcode <= 122 
 * S 中不包含 \ or "
 * 通过次数11,698提交次数21,420
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/reverse-only-letters
 * @Create: 2020-05-12 23:36
 **/


public class Test {

    public String reverseOnlyLetters(String S) {
        char[] arr = S.toCharArray();
        int len = arr.length, l = -1, r = len;
        if (len < 2) return S;
        while (l++ < r--) {                              /** 双指针*/
            while (l < r && !valid(arr[l])) l++;  //不是字母指针就往后走
            while (l < r && !valid(arr[r])) r--;
            if (l < r) {

                char tmp = arr[l];
                arr[l] = arr[r];
                arr[r] = tmp;

                // arr[l] ^= arr[r];
                // arr[r] ^= arr[l];
                //arr[l] ^= arr[r];
            }
        }
        return new String(arr);
    }
    private boolean valid(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
    }



}
