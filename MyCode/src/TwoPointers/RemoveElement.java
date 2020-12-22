package TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by satyam mishra, Data Structure on 13/12/17.
 */
public class RemoveElement {
    public static void main(String [] args){
        Integer [] arr ={2, 0, 1, 2, 0, 3, 2, 2, 2, 1, 0, 0, 0, 1, 0, 0, 2, 2, 2, 3, 2, 3, 1, 2, 1, 2, 2, 3, 2, 3, 0, 3, 0, 2, 1, 2, 0, 0, 3, 2, 3, 0, 3, 0, 2, 3, 2, 2, 3, 1, 3, 3, 0, 3, 3, 0, 3, 3, 2, 0, 0, 0, 0, 1, 3, 0, 3, 1, 3, 1, 0, 2, 3, 3, 3, 2, 3, 3, 2, 2, 3, 3, 3, 1, 3, 2, 1, 0, 0, 0, 1, 0, 3, 2, 1, 0, 2, 3, 0, 2, 1, 1, 3, 2, 0, 1, 1, 3, 3, 0, 1, 2, 1, 2, 2, 3, 1, 1, 3, 0, 2, 2, 2, 2, 1, 0, 2, 2, 2, 1, 3, 1, 3, 1, 1, 0, 2, 2, 0, 2, 3, 0, 1, 2, 1, 1, 3, 0, 2, 3, 2, 3, 2, 0, 2, 2, 3, 2, 2, 0, 2, 1, 3, 0, 2, 0, 2, 1, 3, 1, 1, 0, 0, 3, 0, 1, 2, 2, 1, 2, 0, 1, 0, 0, 0, 1, 1, 0, 3, 2, 3, 0, 1, 3, 0, 0, 1, 0, 1, 0, 0, 0, 0, 3, 2, 2, 0, 0, 1, 2, 0, 3, 0, 3, 3, 3, 0, 3, 3, 1, 0, 1, 2, 1, 0, 0, 2, 3, 1, 1, 3, 2};
        ArrayList<Integer>aaa= new ArrayList<Integer>(Arrays.asList(arr));
        System.out.println(removeElement(aaa,2));
    }

    public static int removeElement(ArrayList<Integer> a, int b) {
        int count =0 ;
        int shift =1;int lastIndex=a.size()-1;
        if(a.get(lastIndex)==b){
            count=1;
        }
        for(int i=a.size()-1;i>=0;i--){
            if(a.get(i)==b) {
                    int k=i;
                while(k<a.size()-1-count){

                        int temp=a.get(k+1);
                        a.remove(k+1);
                        a.add(k+1,a.get(k));
                        a.remove(k);
                        a.add(k,temp);
                    k++;
                }
                count++;
            }

        }
        return a.size()-count;
    }
}
