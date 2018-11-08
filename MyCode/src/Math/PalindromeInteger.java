package Math;

/**
 * Created by i318862 on 13/11/17.
 */
public class PalindromeInteger {
    public static void main(String [] args){
        System.out.print(isPalindrome(1221));
    }
    public static boolean isPalindrome(int a) {
        int a1=a;
        int rev=0;
        int count=0;
        while(a1>0) {
            rev= (int) (rev*10)+(a1%10);
            a1=a1/10;
        }
        if(rev==a)
        return true;
        return false;
    }
}
