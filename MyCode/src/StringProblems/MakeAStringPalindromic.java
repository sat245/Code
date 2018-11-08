package StringProblems;

/**
 * Created by i318862 on 07/12/17.
 */
public class MakeAStringPalindromic {

    public static void main(String [] args){
        System.out.println(solve("banana"));
    }

    public static int solve(String A) {
        if(isPalindrome(A)==1){
            return 0;
        }
        for(int i=A.length()-2;i>0;i--) {
            if(isPalindrome(A.substring(0,i))==1){
                return A.length()-i;
            }
        }
        return A.length()-1;
    }

    public static int isPalindrome(String a) {
        char[] arr = a.toCharArray();
        int last = arr.length - 1;

        for (int i = 0; i <= last; i++) {
            int asc1 = (int) arr[i];
            int asc2 = (int) arr[last];

            if (!((asc1 >= 65 && asc1 <= 90) || (asc1 >= 97 && asc1 <= 122) || (asc1 >= 48 && asc1 <= 57)))
                continue;

            while (!((asc2 >= 65 && asc2 <= 90) || (asc2 >= 97 && asc2 <= 122) || (asc2 >= 48 && asc2 <= 57))) {
                last--;
                asc2 = (int) arr[last];

            }
            if (!((arr[last]+"").equalsIgnoreCase(arr[i]+"")))
                return 0;

            last--;
        }
        return 1;
    }
}
