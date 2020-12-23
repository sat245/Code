package Graph;

import java.util.ArrayList;
import java.util.Collections;

public class SmallestsequencewithgivenPrimes {
    public static  ArrayList<Integer> solve(int A, int B, int C, int D) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(A);
        list.add(B);
        list.add(C);
       Collections.sort(list);
       int count = list.get(0);
       A = count;
       B=list.get(1);
       C=list.get(2);
       list = new ArrayList<Integer>();

       while (list.size()<D){

           if(fn(A,B,C,count)){
               list.add(count);
           }
           count++;
       }

        return (ArrayList<Integer>) list;

    }

    public static boolean fn(int A, int B, int C,int num){
        while (num%A==0){
            num = num /A;
        }
        if(num==1){
            return true;
        }
        while (num%B==0){
            num = num /B;
        }
        if(num==1){
            return true;
        }
        while (num%C==0){
            num = num /C;
        }
        if(num==1){
            return true;
        }
        return false;
    }

    public static void main(String [] args){

        ArrayList <Integer> arr = solve(2,5,11,3);
        System.out.println("*** ");
    }
}
