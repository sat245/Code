package ArrayProblems;

/**
 * Created by satyam mishra, Data Structure on 27/01/18.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLeftRotation {

    public static int[] arrayLeftRotation(int[] a, int n, int k) {
        if(k>n){
            return null;
        }
         k=k%n;
        ArrayList<Integer> a1=new ArrayList<Integer>();
        ArrayList<Integer> a2 = new ArrayList<Integer>();
        for(int i =0;i<n;i++){
            if(i<k){
                a1.add(a[i]);
            }else {
                a2.add(a[i]);
            }
        }
        a2.addAll(a1);
        for(int i =0;i<n;i++){
           a[i]=a2.get(i);
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }

        int[] output = new int[n];
        output = arrayLeftRotation(a, n, k);
        for(int i = 0; i < n; i++)
            System.out.print(output[i] + " ");

        System.out.println();

    }
}