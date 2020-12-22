package Math;

import java.util.ArrayList;

/**
 * Created by satyam mishra, Data Structure on 05/12/17.
 */
public class PRETTYPRINT {

    public static void main(String [] args) {
        ArrayList<ArrayList<Integer>> aa=prettyPrint(3);
        for(int i=0;i<aa.size();i++) {
            for (int j=0;j<aa.size();j++) {
                System.out.print(" "+aa.get(i).get(j));
            }
            System.out.println();
        }
    }
    public static ArrayList<ArrayList<Integer>> prettyPrint(int a) {
        int n=a;
        int n1=a;
        ArrayList<ArrayList<Integer>> arr1= new ArrayList<ArrayList<Integer>>();
        ArrayList <Integer>arr2=null;
        for(int i=0;i<a;i++) {
            arr2=new ArrayList<Integer>();
            for(int j=0;j<a;j++){
                arr2.add(j,n1);
                if(n1>n) {
                    n1--;
                }
            }
            arr1.add(arr2);
            n--;n1=a;
        }

        for(int i=0;i<arr1.size();i++) {
            int count=a-2;
            for (int j =  a; j < (a*2)-1; j++) {
                arr1.get(i).add(j,arr1.get(i).get(count--));
            }
        }

            int count=a-2;
            for (int j =  a; j < (a*2)-1; j++) {
//                arr1.get(i).add(j,arr1.get(i).get(count--));
                arr1.add(j,arr1.get(count--));
            }


        return arr1;
    }


}
