package TwoPointers;

import java.util.ArrayList;

/**
 * Created by satyam mishra, Data Structure on 12/12/17.
 */
public class ThreeSum {
    public static void main(String [] args){

        ArrayList<Integer> aa = new ArrayList<Integer>();
        aa.add(-1);
        aa.add(2);
        aa.add(1);
        aa.add(-4);
        System.out.println(threeSumClosest(aa,1));
    }
    public static int threeSumClosest(ArrayList<Integer> a, int b) {
        int last =a.size()-1;
        int [] arr = new int[3];
        long min=Integer.MAX_VALUE;
        a.sort((o1, o2) -> o1-o2);
        for(int i=0;i<a.size()-2;i++) {
            int start=i+1; last =a.size()-1;

            while(start<last){
                long sum = a.get(i)+a.get(start)+a.get(last);
                if(Math.abs(sum-b)<min){
                    min = Math.abs(sum-b);
                    arr[0]=i;
                    arr[1]=start;
                    arr[2]=last;
                }
                if(sum>b) {
                    last--;
                }else{start++;
                }
            }
        }
        int sum=a.get(arr[0])+a.get(arr[1])+a.get(arr[2]);
        return sum;
    }
}
