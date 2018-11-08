package TwoPointers;

import java.util.ArrayList;

/**
 * Created by i318862 on 14/12/17.
 */
public class MergeTwoSortedListsII {
    public void merge(ArrayList<Integer> a, ArrayList<Integer> b) {
        int i=0;
        int j=0;
        while(i<a.size() && j<b.size()){
            if(a.get(i)<b.get(j)){
                i++;
                continue;
            }
            if(a.get(i)>=b.get(j)){
                a.add(i,b.get(j));
                j++;
                continue;
            }
        }
        while (j<b.size()){
            a.add(i++,b.get(j++));
        }
    }
}
