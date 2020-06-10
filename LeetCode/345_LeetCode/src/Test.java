/**
 * @Description: 编写一个函数，以字符串作为输入，反转该字符串中的元音字母。
 * 示例 1:
 * 输入: "hello"
 * 输出: "holle"
 * 示例 2:
 * 输入: "leetcode"
 * 输出: "leotcede"
 * 说明:
 * 元音字母不包含字母"y"。
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/reverse-vowels-of-a-string
 * @Author: Cheng
 * @Create: 2020-06-10 23:12
 **/
public class Test {
        public String reverseVowels(String s) {
            if(s.length()<2) return s;
            char[]chars = s.toCharArray();
            int i= 0; int j = chars.length -1 ;
            while(i<j){
                if(chars[i]=='a'||chars[i]=='e'||chars[i]=='o'||chars[i]=='i'||chars[i]=='u'||chars[i]=='A'||chars[i]=='E'||chars[i]=='O'||chars[i]=='I'||chars[i]=='U'){
                    if(chars[j]=='a'||chars[j]=='e'||chars[j]=='o'||chars[j]=='i'||chars[j]=='u'||chars[j]=='A'||chars[j]=='E'||chars[j]=='O'||chars[j]=='I'||chars[j]=='U'){
                        if(chars[i]!=chars[j]){
                            char temp = chars[i];
                            chars[i] = chars[j];
                            chars[j] = temp;
                        }
                        ++i;
                        --j;
                    }else{
                        --j;
                    }
                }else{
                    ++i;
                }
            }
            return new String(chars);
        }

    }
