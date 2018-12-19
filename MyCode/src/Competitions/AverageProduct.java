package Competitions;

//
//Max. Marks 100.00
//        Average Product
//        Given an array of  integers. Now, you can perform the following operation on this array:
//        . Remove exactly  integers from the front of the array or back of the array and take the average of these integers.
//        . Insert the floor value of this average value obtained in the above step to the respective side of the array from where you removed the integers.
//        . Repeat the above operations in that order as many times as you want or till the time there are at least  integers in the array.
//
//        Now, you have to find the maximum product of the floor of average values that you have obtained in each operation. Since the number could be very large output it modulo .
//
//        Note: Once you have decided a side (front-side or back-side of the array), you cannot switch it during all the performed operations.
//
//        Input Format
//
//        The first line of the input contains two space-separated integers  and , the total number of elements in the array and the number of elements to remove from the array in each operation.
//        The next line contains  space-separated integers representing the elements of the array.
//
//        Output Format
//
//        In the single line of output print the maximum product of the floor of average values modulo .
//
//        Constraints
//
//
//
//        Sample Input
//        6 3
//        5 4 -2 7 3 -1
//        Sample Output
//        8
//        Explanation
//        Note that, it is optimal to pick the elements from the front of the array.
//        Operation :
//        Array becomes,
//        Operation :
//        Array becomes,
//        Now, you cannot perform operations further.
//
//        Maximum product


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageProduct {
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();
        List<Long> arr = new ArrayList<>();
            if(n<=0 || k==0 || k>n){
                System.out.println(0);
                return;
            }
        while (n>0){
            n--;
            arr.add(s.nextLong());
        }
        long prod1 =1,prod2=1;
            List<Long> arr2 = (List<Long>) ((ArrayList<Long>) arr).clone();
        while (arr.size()>=k){
            List<Long> arr1 =  arr.subList(0,k);
            long sum = 0;
            long avg = 0;
            int count = 0;

            while (count<k){
                sum = sum+arr1.get(count);
                count++;

            }
            avg =  sum/k;

            arr = arr.subList(k,arr.size());
            arr.add(0, (Long) avg);
            Long max = prod1;
            prod1= (prod1*avg)%1000000007;
            if (prod1 <max) {
                prod1 =max;

            }
        }

        while (arr2.size()>=k){
            int x= arr2.size();
            List<Long> arr1 =  arr2.subList(x-k,x);
            long sum = 0;
            long avg = 0;
            int count = 0;

            while (count<k){
                sum = sum+arr1.get(count);
                count++;

            }
            avg =  sum/k;
            arr2 = arr2.subList(0,x-k);
            arr2.add( avg);
            Long max=prod2;
            prod2= (prod2*avg)%1000000007;
            if (prod2 <max) {
                prod2 =max;

            }
        }
        System.out.println(prod1<prod2?prod2:prod1);
}
}
