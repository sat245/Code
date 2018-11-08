package Random;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by i318862 on 09/12/17.
 */
class NewDataStructureTrie {
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
        int n = s.nextInt();
        node obj = new node();
        node head=obj;
        int count=1;
        while(n>0) {
            n--;
            String n1 = s.next();
            obj=head;
            for(int i=0;i<n1.length();i++) {
                boolean contains =false;
                if(obj.map.containsKey(n1.charAt(i))){
                    obj=obj.map.get(n1.charAt(i));
                    contains=true;
                }
                if(contains){
                    continue;
                }
                node nn = new node();
                obj.map.put(n1.charAt(i),nn);
                count++;
            }


        }
        System.out.println(count);
    }
}

class node {
    Map<Character,node> map = new HashMap<Character,node>();
}