package Math;

/**
 * Created by satyam mishra, Data Structure on 14/11/17.
 */
public class TrailingZerosInFactorial {
    public static void main(String [] args) {
        System.out.print(trailingZeroes(100900));

    }
    public static int trailingZeroes(int a) {
        int count=0,index=1;
        while(Math.pow(5,index)<=a){
            count= (int) (count+a/Math.pow(5,index++));
        }
        if(a>=5)
        return count;

        return 0;


    }

    public static int factorial(int n){
        if(n==1)
            return 1;

        return (n*(n-1));
    }
}
