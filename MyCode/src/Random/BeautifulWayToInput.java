package Random;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by satyam mishra, Data Structure on 11/12/17.
 */
public class BeautifulWayToInput {
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
        int cats = Integer.parseInt(s.nextLine());
        String [] str = new String[cats];
        String [] cal=new String[cats];

        String str1 = s.nextLine();
        str=str1.split("\\s+");


        String str11 = s.nextLine();
        cal=str11.split("\\s+");

        Arrays.sort(str);
        Arrays.sort(cal);

        long max=0;
        long sum= 0;

        for(int i =0;i<cats;i++){
            sum=sum+(Integer.parseInt(str[i])*Integer.parseInt(cal[i]));
        }

        System.out.print(sum);
    }
}
