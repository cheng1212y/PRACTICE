import java.util.HashMap;
/**
 * @Description:   字符串中的第一个唯一字符
 * 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
 * 案例:
 * s = "leetcode"
 * 返回 0.
 * s = "loveleetcode",
 * 返回 2.
 * 注意事项：您可以假定该字符串只包含小写字母。
 * 来源：  https://leetcode-cn.com/problems/first-unique-character-in-a-string/
 * @Create: 2020-05-31 16:57
 **/
public class Test {

    public int firstUniqChar(String s) {
            HashMap<Character,Integer > map = new HashMap();
            char [] arr = s.toCharArray();
            for (char ch : arr) {
                //第一次添加 次数就记为1
                if(map.get(ch) == null) {
                    map.put(ch,1);
                }else {
                    //不是第一次添加 没次都在原来基础上+1
                    Integer val = map.get(ch);
                    map.put(ch,val+1);
                }
            }
            int ret = 0;
            for (int i = 0; i <arr.length ; i++) {
                if ( map.get(arr[i]) == 1) {
                    return i;
                }
            }
            return -1;
        }
}
