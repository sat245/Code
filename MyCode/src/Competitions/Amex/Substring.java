package Competitions.Amex;

import java.util.*;

public class Substring {
    public static void findSubstrings(String s) {
        // Write your code here
        char[] arr = s.toCharArray();
        List<String > list = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            for (int j = i;j<arr.length;j++){
                if(vowel(arr[i]) &&  !vowel(arr[j])){
                    list.add(s.substring(i,j+1));
                }
            }
        }
        Collections.sort(list);



        System.out.println(list.size()>0?list.get(0):"");
        System.out.println(list.size()>0?list.get(list.size()-1):"");
    }

    private static boolean vowel(char ch) {
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
            return true;
        }
        return false;
    }

    public static void main(String [] args) {
        String str = "abc";
        findSubstrings(str);
    }

//    public static String writeIn(List<String> ballot) {
//        // Write your code here
//        Map<String,Integer> map = new HashMap<>();
//        int max=-1;
//        for(int i = 0;i<ballot.size();i++){
//
//            String s = ballot.get(i);
//            if(map.containsKey(s)){
//                map.put(s,map.get(s)+1);
//                if(max<map.get(s)){
//                    max = map.get(s);
//                }
//            }else {
//                map.put(s,1);
//            }
//        }
//        List<String> list  = new ArrayList<>();
//        for(Map.Entry<String,Integer> obj:map.entrySet()){
//            if(obj.getValue()==max){
//                list.add(obj.getKey());
//            }
//        }
//
//        if (list.size()==1){
//            return list.get(0);
//        }
//
//        Collections.sort(list);
//        return list.get(list.size()-1);
//
//    }
}
