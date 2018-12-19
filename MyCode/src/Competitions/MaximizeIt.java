package Competitions;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class MaximizeIt {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        int test  =scan.nextInt();
        while (test>0){
            test--;

            int n =scan.nextInt();
            BigInteger k = BigInteger.valueOf(scan.nextInt());
            ArrayList<BigInteger> arr = new ArrayList<BigInteger>();
            BigInteger sum = BigInteger.ZERO;
            while (n>0){
                n--;
                BigInteger x= k.pow(scan.nextInt());
                sum=sum.add(x);
                arr.add(x);
            }
            BigInteger right=sum;
            BigInteger left=BigInteger.ZERO;
            BigInteger max=BigInteger.valueOf(Integer.MIN_VALUE);
            int maxSize=0;

            for(int i=0;i<arr.size();i++){

                left=left.add(arr.get(i));
                right =right.subtract(arr.get(i));
                BigInteger prod = left.multiply(right);
                if(prod.compareTo(max)==1){
                    max = prod;
                    maxSize = i+1;
                }
            }
            System.out.println(maxSize);
        }
    }
}
