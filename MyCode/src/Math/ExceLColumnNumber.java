package Math;

/**
 * Created by i318862 on 12/11/17.
 */
public class ExceLColumnNumber {
    public static void main (String [] args) {
        char a='A';
        System.out.println(titleToNumber("AA"));

    }

    public static int titleToNumber(String a) {
    int sum = 0;
        int len = a.length();
        if(len==0) {
            return 0;
        }
        for(int i=0;i<a.length();i++) {
            char ch =a.charAt(i);
            int val = (int) ch;
            sum = sum+(val-64)*(int)(Math.pow(26,len-1-i));
        }

        return sum;
    }
}
