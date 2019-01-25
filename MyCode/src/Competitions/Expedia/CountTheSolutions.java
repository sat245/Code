package Competitions.Expedia;

import java.util.Scanner;

public class CountTheSolutions {
    public static void main(String args[] ) throws Exception {

        Scanner s = new Scanner(System.in);

        long S = s.nextLong();
        int a=0;int count=0;
        while (a<=S){
            int b=0;
            int c=0;
            int d=0;
            while (Math.pow(b,2)<=S){
                c=0;d=0;
                while (Math.pow(c,3)<=S){
                    d=0;
                    while (Math.pow(d,4)<=S){

                        if((a+(Math.pow(b,2))+Math.pow(c,3)+Math.pow(d,4))<=S) {
                            count++;
                        }
                        else{
                            break;
                        }
                        d++;
                    }
                    if((a+(Math.pow(b,2))+Math.pow(c+1,3))<=S) {
                        c++;
                    }else {
                        break;
                    }
                }
                if((a+(Math.pow(b+1,2)))<=S) {
                    b++;
                }else {
                    break;
                }


            }

            a++;
        }
        System.out.println(count);
    }
}
