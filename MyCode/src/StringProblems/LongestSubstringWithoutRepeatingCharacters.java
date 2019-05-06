package StringProblems;

//https://leetcode.com/problems/longest-substring-without-repeating-characters/

// solve with dp,recursion gives tle


import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String [] args){
        String str = "zqqifzoupifnwyankayhjsuj";
        lengthOfLongestSubstring(str);
    }


    public static int lengthOfLongestSubstring(String s) {
        if(s== null || s.length()==0){
            return 0;
        }
        int len = s.length();

        System.out.println(maxSize(s,0,s.length()));
        return 0;
    }

    public static int maxSize(String s, int start, int last){
        Map<Character,Integer> count = null;
        if(start==last){
            return 1;
        }else {
            count = new HashMap<>();
            for(int i=start;i<last;i++){
                if(count.containsKey(s.charAt(i))){
                    break;
                }
                count.put(s.charAt(i),1);

            }
            if(count.size() == (last-start)){
                return (last-start);
            }
        }

        return Math.max(maxSize(s,start+1,last),maxSize(s,start,last-1));
    }
}
