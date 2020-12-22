package TwoPointers;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by satyam mishra, Data Structure on 14/12/17.
 */
public class IntersectionOfSortedArrays {
    public ArrayList<Integer> intersect(final List<Integer> a, final List<Integer> b) {
        ArrayList<Integer> aa=new ArrayList<Integer>();

        int i=0,j=0;
        while(i<a.size() && j<b.size()){
            if(a.get(i).equals(b.get(j))){
                aa.add(a.get(i));
                i++;
                j++;
            }
            if(a.get(i)<b.get(j)){
                i++;
            }else {
                j++;
            }


        }
        return aa;
    }
}
