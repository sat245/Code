package Facebook;
//Given an array of strings strs, group the anagrams together. You can return the answer in any order.
//
//        An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
//

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagram {
    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list = null;
        if (strs == null || strs.length == 0) {
            return list;
        }
        list = new ArrayList<>();
        for (int i = 0; i < strs.length; i++) {
            String current = strs[i];
            if (current == null) {
                continue;
            }
            List<String> anagrams = new ArrayList<>();
            anagrams.add(current);
            for (int j = i + 1; j < strs.length; j++) {
                if (areAnagrams(current, strs[j])) {
                    anagrams.add(strs[j]);
                    strs[j] = null;
                }
            }
            list.add(anagrams);
            strs[i] = null;
        }
        return list;
    }

    private static boolean areAnagrams(String current, String str) {
        if (current == null || str == null) {
            return false;
        }
        if (current.length() == str.length()) {
            Map<Character, Integer> map1 = new HashMap<>();
            for (int i = 0; i < current.length(); i++) {
                char ch = current.charAt(i);
                if (map1.containsKey(ch)) {
                    map1.computeIfPresent(ch, (key, val) -> val + 1);
                }
                map1.computeIfAbsent(ch, key -> 1);
            }
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (map1.containsKey(ch)) {
                    if (map1.get(ch) > 1) {
                        map1.put(ch, map1.get(ch) - 1);
                    } else {
                        map1.remove(ch);
                    }
                } else {
                    return false;
                }
            }
            if (map1.size() == 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> list = groupAnagrams(strs);
        System.out.println();
    }

}
