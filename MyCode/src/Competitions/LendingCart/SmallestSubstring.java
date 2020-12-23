package Competitions.LendingCart;

import java.util.HashMap;
import java.util.Map;

public class SmallestSubstring {

    static  int smallestSub(String s){
        char [] arr = s.toCharArray();
        Map<Character, Boolean> map = new HashMap<>();

        for(int i =0;i<arr.length;i++){
            if(map.containsKey(arr[i])){

            }else{
                map.put(arr[i],false);
            }
        }
        int min = Integer.MAX_VALUE;int sublen = 0;
        for(int i=0;i<s.length();i++){
            int len = 0;
            for(int j=i;j<s.length();j++) {
                char ch = s.charAt(j);
                if(map.get(ch)==false){
                    len++;
                    map.put(ch,true);
                }

                if(len==map.size()){
                    sublen = j-i+1;
                    break;
                }
            }

            if(sublen<min){
                min = sublen;
            }

            for(Map.Entry<Character,Boolean> obj:map.entrySet()){
                map.put(obj.getKey(),false);
            }
        }
        return min;
    }

    public static  void main(String [] args){
        String str = "abcaada";
        System.out.println(smallestSub(str));
    }
}
