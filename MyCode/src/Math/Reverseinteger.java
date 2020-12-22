package Math;

/**
 * Created by satyam mishra, Data Structure on 13/11/17.
 */
public class Reverseinteger {



    public static int reverse(int a) {

        int rev=0;
        int count=0;
        boolean flag=false;
        if(a<0) {
            a=a*-1;
            flag=true;
        }
        while(a>0) {
            try {
                rev= Math.addExact((Math.multiplyExact(rev,10)),(a%10));
            }catch (Exception e){
                return 0;
            }
            a=a/10;
        }
        if(flag==false) {
            return rev;
        }
        if(flag){
            if((rev*-1)<Integer.MIN_VALUE){
                return 0;
            }
            return -1*rev;
        }
       return 0;
    }

    public static void main(String [] args){
        System.out.print(reverse(-11464));
    }
}
