package Hashinng;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by satyam mishra, Data Structure on 01/03/18.
 */
public class LargestContinuousSequenceZeroSum {
    public static ArrayList<Integer> lszero(ArrayList<Integer> A) {
        int size=A.size();
        int maxLength=-1,maxi=-1,maxj=-2;
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<size;i++) {
            int sum=0;
            for(int j=i;j<size;j++){
                sum=sum+A.get(j);
                if(sum==0){
                    if((j-i)>maxLength){
                        maxi=i;
                        maxj=j;
                        maxLength=j-i;
                    }
                }
            }
        }
        for(int i=maxi;i<=maxj;i++){
            arr.add(A.get(i));
        }
        return arr;
    }

    public static void main(String [] args){
        Integer [] arr = {1 ,2 ,-2 ,4 ,-4};

        ArrayList<Integer> a=new ArrayList<Integer>();
        a.addAll(Arrays.asList( arr));
        System.out.println(lszero(a));
    }
}
