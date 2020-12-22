package Backtracking;

import java.util.ArrayList;

/**
 * Created by satyam mishra, Data Structure on 26/02/18.
 */
public class Combination {

    public static void fn(ArrayList<ArrayList<Integer>> a, ArrayList<Integer> b, Integer start, Integer last, Integer k, Integer[] arr) {


        if(start>=arr.length || last>=arr.length){
            return;
        }

        if(b.size()==k-1){
            b.add(arr[start]);
        }

        if (start == last || b.size() >= k) {
            a.add(b);
            b = new ArrayList<Integer>();
            return;
        }
        b.add(arr[start]);

        fn(a,b,start+1,last+1,k,arr);
       // fn(a,b,start,start+1,k,arr);


    }

    public static void main(String [] args){
        Integer [] arr={1,2,3,4,5};
        ArrayList<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> b = new ArrayList<Integer>();
        int start=0;
        int last = arr.length-1;

        for (int i = 0;i<arr.length;i++){
            fn(a,b,i,i+1,2,arr);

        }

        System.out.print("hola");
    }
}
