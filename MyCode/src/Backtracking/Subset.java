package Backtracking;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by satyam mishra, Data Structure on 05/02/18.
 */
public class Subset {

    public static ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> A) {

        ArrayList<ArrayList<Integer>> x= new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> y = new ArrayList<Integer>();
        x.add(y);
        return subsets(x,A,0,0);

    }

    public static ArrayList<ArrayList<Integer>> subsets(ArrayList<ArrayList<Integer>> x,ArrayList<Integer> A,int start,int end) {

        if(start>end || start>=A.size() || end>=A.size()){
            return x;
        }
        int i=start;
        int j=end;
        ArrayList<Integer> y = new ArrayList<Integer>();
        while (i<=j){

            y.add(A.get(i++));
        }
        x.add(y);
        x=subsets(x,A,start,end+1);
        x=subsets(x,A,start+1,end);
        return x;

    }



    public static void main(String [] args){
        Integer [] arr = {1,2,3};
        ArrayList<Integer> b = new ArrayList<Integer>(Arrays.asList(arr));
     ArrayList<ArrayList<Integer>> x=subsets(b);
        System.out.print(" ");

    }
}
