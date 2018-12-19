package ArrayProblems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LongestConsecutiveSequence {
    public static int longestConsecutive(final List<Integer> A) {
        Map<Integer,Integer> map = new HashMap();

        int largest=Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (Integer obj : A) {
            if (obj < smallest) {
                smallest = obj;
            }
            if (obj > largest) {
                largest = obj;
            }
            map.put(obj, 1);
        }
        int max=1;
        for(int i=smallest;i<=largest;i++){
            if(map.containsKey(i)){
                if(map.containsKey(i-1)){
                    int count=map.get(i)+map.get(i-1);
                    if(count>max){
                        max=count;
                    }
                    map.put(i,count);
                }
            }
        }
        return max;
    }


    public static void main(String [] args){
        List<Integer> a = new ArrayList<>();
        a.add(6);
              a.add(4);a.add(5);a.add(2);a.add(3);
        System.out.println(longestConsecutive(a));
    }
}
