package Practise;

import java.util.Scanner;

public class BestIndex {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
       c
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT


        */

        // Write your code here
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = s.nextInt();
        }

        for(int i=0;i<n;i++) {
            int sum = i,count=2;
            for(int j=i;count<n;count++){

            }
        }
    }
}
