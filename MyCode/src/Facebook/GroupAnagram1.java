package Facebook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//optimised
public class GroupAnagram1 {
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            String string = strs[i];
            int [] count = new int[26];
            for (Character ch:string.toCharArray()
                 ) {
                count[ch - 'a']++;
            }
            String key = "#";
            for (int j = 0; j < 26; j++) {
                key=key+count[j];
            }
            if(map.containsKey(key)) {
                map.get(key).add(string);
            } else {
                List<String> list = new ArrayList<>();
                list.add(string);
                map.put(key,list);
            }
        }
        return new ArrayList<>(map.values());
    }
    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> list = groupAnagrams(strs);
        System.out.println();
    }
}
