package TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by satyam mishra, Data Structure on 14/12/17.
 */
public class RemoveDuplicatesfromSortedArray {
    public static void main(String [] args){
        Integer [] arr={5000,5000,5000};

        System.out.print(removeDuplicates(new ArrayList<>(Arrays.asList(arr))));
    }

    public static int removeDuplicates(ArrayList<Integer> a) {
        if(a==null){
            return 0;
        }

        if(a.size()==1){
            return 0;
        }
        int size=a.size();
       int count=0;
        for(int i=a.size()-1;i>=1;i--){
            if(a.get(i).equals(a.get(i-1))){
                a.remove(i);
                count++;
            }
        }
        return size-count;
    }
}
