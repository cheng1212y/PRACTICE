import java.util.HashMap;

/**
 * @Description:
 * 面试题50. 第一个只出现一次的字符
 * 在字符串 s 中找出第一个只出现一次的字符。如果没有，返回一个单空格。 s 只包含小写字母。
 * 示例:
 * s = "abaccdeff"
 * 返回 "b"
 * s = ""
 * 返回 " "
 * 来源： https://leetcode-cn.com/problems/di-yi-ge-zhi-chu-xian-yi-ci-de-zi-fu-lcof/
 * @Create: 2020-06-18 22:56
 *
 **/
public class Test {
    public static void main(String[] args) {
        String s = "abaccdeff";
          char ch =  firstUniqChar(s);
        System.out.println(ch);
    }

    public static char firstUniqChar(String s) {
        if (s == "") {
            return ' ';
        }
        HashMap<Character,Integer> map = new HashMap<>();    //哈希表可以统计出现的次数
        char [ ] arr = s.toCharArray();
        for (int i = 0; i <arr.length ; i++) {
            char target = arr[i];
            if (map.get(target) == null) {
                map.put(target,1);
            }
            else {
                Integer  in = map.get(target);
                map.put(target,in+1);
            }
        }
        char ret =' ';
        for (int i =0; i <arr.length ; i++) {
            if ( map.get(arr[i]) == 1) {
                ret = arr[i];
                break;
            }
        }
            return ret;
    }
}
