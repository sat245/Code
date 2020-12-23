package TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by satyam mishra, Data Structure on 12/12/17.
 */
public class ThreeSumZero {
    public static void main(String [] args){
        Integer [] aaaa={1, -4, 0, 0, 5, -5, 1, 0, -2, 4, -4, 1, -1, -4, 3, 4, -1, -1, -3};
        ArrayList<Integer> aa = new ArrayList<Integer>(Arrays.asList(aaaa));
//        aa.add(-1);
//        aa.add(0);
//        aa.add(1);
//        aa.add(-4);
        System.out.println(threeSum(aa));
    }

    public static ArrayList<ArrayList<Integer>> threeSum(ArrayList<Integer> a) {
        int last =a.size()-1;
        ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
        int b=0;
        a.sort((o1, o2) -> o1-o2);
        for(int i=0;i<a.size()-2;i++) {
            int start=i+1; last =a.size()-1;

            while(start<last){
                long sum = a.get(i)+a.get(start)+a.get(last);
                if(sum==0){
                    ArrayList<Integer> ab = new ArrayList<Integer>();
                   ab.add(a.get(i));
                    ab.add(a.get(start));
                    ab.add(a.get(last));
                    if(!(arr.contains(ab)))
                    arr.add(ab);

                }
                if(sum>b) {
                    last--;
                }else{
                    start++;
                }
            }
        }
//        if(a.contains(0)){
//            ArrayList<Integer> ab = new ArrayList<Integer>();
//            ab.add(0);
//            ab.add(0);
//            ab.add(0);
//            arr.add(ab);
//
//        }

        return arr;
    }
}
