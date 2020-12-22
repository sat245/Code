package TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by satyam mishra, Data Structure on 14/12/17.
 */
public class MaximumUnsortedSubarray {

    public static void main(String [] args){
//        Integer [] aa={1, 3, 2, 4, 5};
        Integer [] aa={1,2,3};

        System.out.print(subUnsort(new ArrayList<Integer>(Arrays.asList(aa))));
    }
    public static ArrayList<Integer> subUnsort(ArrayList<Integer> A) {



        int left=-1,right=-1;
        int fleft=0;int fright=A.size()-1;
        ArrayList<Integer> aa=new ArrayList<>();

       for(int i=0;i<A.size()-1 && left==-1;i++) {
           if (A.get(i) > (A.get(i + 1))) {
               left = A.get(i+1);
               fleft=i;
           }
       }
        for(int i=A.size()-2;i>=0 && right==-1;i--) {

            if(A.get(i)>(A.get(i+1))){
                right=A.get(i);
                fright=i+1;
            }
        }
        if(fleft==fright || (fleft==0 && fright==A.size()-1) || (A.size()==1)){
            aa.add(-1);
            return aa;
        }
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        for(int i=fleft;i<=fright;i++){
            if(A.get(i)<min){
                min=A.get(i);
            }
            if(A.get(i)>max){
                max=A.get(i);
            }
        }
        right=-1;
        left=-1;
        for(int i=0;i<A.size();i++){
            if(A.get(i)>min && left==-1){
                left=i;
            }
            if(A.get(A.size()-i-1)<max && right==-1){
                right=A.size()-i-1;
            }
        }
        aa.add(left);
        aa.add(right);


        return aa;
    }

}
