package Practise;

import java.util.Scanner;

public class IndexBasedQueries {
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
        int  n = s.nextInt();
        int nQ = s.nextInt();


        int [] arr = new int[n];
        int count=0;
        while (n>0){
            n--;
            arr[count++] = s.nextInt();
        }


        while (nQ>0){
            nQ--;

            int query = s.nextInt();
            int index = -1;

            switch (query){
                        case 0: {
                    index = s.nextInt();
                    boolean flag = false;
                    for(int i =index-1;i>=0;i--){
                        if(arr[i] == 1){
                            System.out.print(i);
                            flag = true;
                            break;
                        }
                    }
                    if(!flag){
                        System.out.print(-1);
                    }
                    flag = false;

                    for(int i =index+1;i<arr.length;i++){
                        if(arr[i] == 1){
                            System.out.print(" "+i);
                            flag = true;
                            break;
                        }
                    }
                    if(!flag){
                        System.out.print(" "+-1);
                        flag = false;
                    }
                    System.out.println();
                    break;
                }

                case 1: {
                    index =s.nextInt();
                    if(index>=0 && index<arr.length){
                        arr[index] = 1;
                    }
                    break;
                }
            }
        }


    }
}
