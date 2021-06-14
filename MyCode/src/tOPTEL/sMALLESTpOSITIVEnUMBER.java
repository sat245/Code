package tOPTEL;

import java.util.Arrays;

/**
 * Data Structures & Algorithms
 * https://github.com/SatyamMishra245/Code/tree/master/MyCode
 *
 * @ author : satyam mishra
 * @ created : 02-06-2021
 */
public class sMALLESTpOSITIVEnUMBER {
    public static void main(String [] args) {
        int [] arr = {1,2,3};
        Arrays.sort(arr);
        int len = arr.length;

        for(int i = 1;i<len;i++) {
            int x = Arrays.binarySearch(arr,i);
            if(x<0) {
               // return i;
            }
        }
       // return len;
    }
}
