package StringProblems;

/**
 * Created by satyam mishra, Data Structure on 09/12/17.
 */
public class Atoi {
    public static void main(String [] args){
        System.out.println(atoi(""));
    }

    public static int atoi(final String a) {
        char [] arr = a.toCharArray();
        if(arr.length == 0) return 0;
        String str = "";int a1=0;boolean flag=true;int sign=1;
        if(arr[0]=='+' && ((int)arr[1]>=48 && (int)arr[1]<=57)){
            arr[0]='0';
        }
        if(arr[0]=='-' && ((int)arr[1]>=48 && (int)arr[1]<=57)){
            arr[0]='0';
            sign=-1;
        }

        for(int i=0;i<arr.length;i++){
            if(str=="" && ((int)arr[i]<48 || (int)arr[i]>57)){
                return 0;
            }
            if((int)arr[i]>=48 && (int)arr[i]<=57 && flag){
                str=str+arr[i];
            }else {
                flag=false;
            }
        }
        try{
            a1=Integer.parseInt(str)*sign;
        }catch (NumberFormatException e){
            if(sign>0)
            return Integer.MAX_VALUE;
            return Integer.MIN_VALUE;
        }
        return a1;
    }
}

class Solution {
    public int myAtoi(String str) {
        int i = 0;
        int sign = 1;
        int result = 0;
        if (str.length() == 0) return 0;

        //Discard whitespaces in the beginning
        while (i < str.length() && str.charAt(i) == ' ')
            i++;

        // Check if optional sign if it exists
        if (i < str.length() && (str.charAt(i) == '+' || str.charAt(i) == '-'))
            sign = (str.charAt(i++) == '-') ? -1 : 1;

        // Build the result and check for overflow/underflow condition
        while (i < str.length() && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
            if (result > Integer.MAX_VALUE / 10 ||
                    (result == Integer.MAX_VALUE / 10 && str.charAt(i) - '0' > Integer.MAX_VALUE % 10)) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            result = result * 10 + (str.charAt(i++) - '0');
        }
        return result * sign;

    }
}