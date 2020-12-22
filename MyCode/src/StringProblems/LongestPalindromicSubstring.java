package StringProblems;

/**
 * Created by satyam mishra, Data Structure on 08/12/17.
 */
public class LongestPalindromicSubstring {
    public static void main(String [] args){
        System.out.println(longestPalindrome("abbcccbbbcaaccbababcbcabca"));
    }

    public static String longestPalindrome(String a) {
        StringBuilder str = new StringBuilder(a);
        String s = str.reverse().toString();
        int imax = 0;
        int jmax = 0;
        int count =0;
        for(int i=0;i<a.length();i++) {
            int k=i;
            for (int j = 0; j < a.length(); j++) {
                int l=j;
                count=0;
                while ((k<a.length() && l<a.length()) && a.charAt(k) == s.charAt(l)) {
                    count++;
                    k++;
                    l++;
                }
                k=i;
                if(count>(jmax-imax)){
                    if(isPalindrome(a.substring(i,i+count))==1) {
                        imax = i;
                        jmax = i + count;
                    }
                }

            }
        }
        return (a.substring(imax,jmax));
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
