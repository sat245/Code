package Facebook;
//Input: s = "abcabcbb"
//        Output: 3
//        Explanation: The answer is "abc", with the length of 3.

import java.util.HashMap;
import java.util.Map;

public class LengthOfLongestSubstrin {
    public static int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        char[] chars = s.toCharArray();
        int count = 0, max = -1;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < chars.length; i++) {
            if (map.containsKey(chars[i])) {
                if (count > max) {
                    max = count;
                }
                    i = map.get(chars[i]);
                    map.clear();
                    count = 0;

            } else {
                count++;
                map.put(chars[i], i);
            }
        }
        if (count > max) { // this part is crucial
            max = count;
        }
        return max;
    }

    public static void main(String[] args) {
        String str = "hkcpmprxxxqw";
        System.out.println(lengthOfLongestSubstring(str));
    }
}
