package Math;

import java.util.ArrayList;

/**
 * Created by satyam mishra, Data Structure on 13/11/17.
 */
public class GreatestCommonDivisor {
    public static void main(String [] args){
        System.out.println(gcd(6,9));

    }
    public static int gcd(int a, int b) {
        if(a==0)
            return b;
        if(b==0)
            return a;
        if(a==1 || b==1)
            return 1;
        if(a==b)
            return a;

        if(a>b) {
            return gcd(a - b, b);
        }
        else {
            return gcd(b-a,a);
        }

    }
    public static ArrayList<Integer> factor(int n){
        ArrayList<Integer> arr = new ArrayList<>();
        int count=0;
        for(int i=1;i<=Math.sqrt(n);i++) {
            if(n%i==0) {
                arr.add(count++,i);
                if((n/i)!=i)
                arr.add(count,n/i);
            }
        }
        return arr;
        }
}
