package Competitions.Syncron;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindNumberOfDistinctPairThatSums {
    public static int numberOfPairs(List<Integer> arr, long k){
        if(arr==null || arr.size()==0){
            return 0;
        }
        Collections.sort(arr);
        int count = 0;int len = arr.size();
        for(int i=0;i<arr.size();i++){
            if(i<len-1) {
                while ((i<len-1) && arr.get(i) == arr.get(i+1)){
                    i++;
                }

                if(i<len) {
                    int diff = (int) (k - arr.get(i));
                    if(diff==arr.get(i+1)){
                        count++;
                        continue;
                    }
                        int res = Collections.binarySearch(arr.subList(i+1,len), diff);

                    if (res >= 0) {
                        count++;
                    }
                }
            }
            }
            return count;
        }

    public static void main(String [] args)
    {
        List<Integer> list = new ArrayList<>();
        list.add(6);list.add(12);list.add(3);list.add(9);list.add(3);list.add(5);list.add(1);//list.add(1);
        int target = 12;

        int a =numberOfPairs(list,target);

        System.out.println(a);


    }
}
