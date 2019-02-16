package Competitions.Ninjacart;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
//not completed
public class NumberConversion {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        for(int t_i=0; t_i<T; t_i++)
        {
            int n = Integer.parseInt(br.readLine().trim());
            String[] arr_A = br.readLine().split(" ");
            int[] A = new int[n];
            for(int i_A=0; i_A<arr_A.length; i_A++)
            {
                A[i_A] = Integer.parseInt(arr_A[i_A]);
            }
            String[] arr_P = br.readLine().split(" ");
            int[] P = new int[n];
            for(int i_P=0; i_P<arr_P.length; i_P++)
            {
                P[i_P] = Integer.parseInt(arr_P[i_P]);
            }
            String[] arr_Q = br.readLine().split(" ");
            int[] Q = new int[n];
            for(int i_Q=0; i_Q<arr_Q.length; i_Q++)
            {
                Q[i_Q] = Integer.parseInt(arr_Q[i_Q]);
            }

            long out_ = solve(A, P, Q);
            System.out.println(out_);
        }

        wr.close();
        br.close();
    }
    static long solve(int[] A, int[] P, int[] Q){
        // Your Code Here
       long min = Integer.MIN_VALUE;
       long max = Integer.MAX_VALUE;
        int len = A.length;
        long [] a4 = new long[len];
        long [] b4 = new long[len];

        for(int i=0;i<len;i++){
            int n = A[i];
            int p= P[i];
            int q = Q[i];

            long a1 = n;
            long a2 = n-q;
            long a3;


            long b1 = n+p;
            long b2 = n;
            long b3;

            if(a1>a2){
                a3=a2;
            }else{
                a3=a1;
            }
            if(b1>b2){
                b3=b1;
            }else{
                b3=b2;
            }

            if(b3<a3){
                long temp = b3;
                b3=a3;
                a3=temp;
            }

            a4[i]=a3;
            b4[i]=b3;




        }
       // min = a4[0];
        //max = b4[0];
        long b3=0;
        for(int i=1;i<len;i++){

            if(a4[i]>min && a4[i]<b4[i]){
                min=a4[i];
            }

            if(b4[i]<max){
                max=b3;
            }
        }
           return (Math.abs(max-min))+1;
    }
}
