package Random;

import java.util.Scanner;

/**
 * Created by satyam mishra, Data Structure on 09/12/17.
 */
class NumberOFZeroOne {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        */

        // Write your code here

        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        char [] arr=name.toCharArray();
        int count=0;
        for(int i=1;i<arr.length;i++) {
            if(arr[i-1]==arr[i]){
                count++;
                if(count==6) {
                        System.out.println("Sorry, sorry!");
                       return;
                    }
                }else {
                count=1;
            }
        }
        System.out.println("Good luck!");


    }
}