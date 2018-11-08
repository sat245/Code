package Math;

import java.util.ArrayList;

/**
 * Created by i318862 on 10/11/17.
 */
public class PrimeSum {
    public static void main(String [] args){
        System.out.println(primesum(4));
    }

    public static boolean isPrime(int a) {
        ArrayList<Integer> arr =new ArrayList<Integer>();

        int index=0;
        for(int i=1;i<=Math.sqrt(a);i++) {
            if(a%i==0){
                arr.add(index++,i);
                if(i!=Math.sqrt(a)){
                    arr.add(index,a/i);
                }
            }


        }
        return arr.size()==2;
    }
    public static ArrayList<Integer> primesum(int a) {
        for(int i=2;i<=(a);i++) {
            if(isPrime(i) && isPrime(a-i)) {
                ArrayList<Integer> aa = new ArrayList<Integer>();
                aa.add(i);
                aa.add(a-i);
                return aa;
            }
    }
        return new ArrayList<Integer>();
    }
}
