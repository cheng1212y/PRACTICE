/**
 * @Description:     字符串的反转
 * 编写一个函数，其作用是将输入的字符串反转过来。输入字符串以字符数组 char[] 的形式给出。
 * 不要给另外的数组分配额外的空间，你必须原地修改输入数组、使用 O(1) 的额外空间解决这一问题。
 * 输入：["h","e","l","l","o"]
 * 输出：["o","l","l","e","h"]
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/reverse-string
 * @Create: 2020-05-07 15:46
 **/
public class Test {

    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;
        // 交换元素的临时变量 temp
        char temp;
        while(  left < right ) {        //字符串其实就是字符数组，通过双指针，可以轻松反转
            temp = s[left];
            s [left] = s [right];
            s[right] = temp;
            left++;
            right--;
        }
    }




}
