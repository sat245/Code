package StringProblems;

import java.math.BigInteger;

/**
 * Created by i318862 on 12/12/17.
 */
public class PowerOf2 {
    public static void main(String [] args){
        System.out.println(power("20077000522611464285"));
    }
    public static int power(String a) {
    BigInteger aa = new BigInteger(a);
        boolean mod=true;
        while(aa.compareTo(BigInteger.valueOf(2))>0){

            if(!aa.mod(BigInteger.valueOf(2)).equals(BigInteger.valueOf(0))) {
                return 0;
            }
                aa=aa.divide(BigInteger.valueOf(2));
            }
        if(aa.equals(BigInteger.valueOf(2)) && mod) {
            return 1;
        }
            else {
                return 0;
            }

        }
    }

