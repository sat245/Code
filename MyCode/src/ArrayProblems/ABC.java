package ArrayProblems;

import java.util.Arrays;

/**
 * Created by satyam mishra, Data Structure on 27/01/18.
 */
public class ABC {
        public static void main(String [] args) {
                int [] digits = {9,8,7,6,5,4,3,2,1,0};
                Arrays.stream(plusOne(digits)).forEach(x->System.out.print(x));
        }
        public static int[] plusOne(int[] digits) {
                int num =0;
                int carry = 1;
                for (int i = digits.length-1; i >= 0 ; i--) {
                        int sum = carry + digits[i];
                        if(sum > 9) {
                                carry = sum /10;
                                sum = sum % 10;

                        } else {
                                carry = 0;

                        }
                        digits[i] = sum;
                }
                if(carry>0) {
                        int [] arr = new int[digits.length+1];
                        arr[0]=carry;
                        for (int i = 0; i < digits.length; i++) {
                                arr[i+1] = digits[i];
                        }
                        return arr;
                }

                return digits;

        }
}
