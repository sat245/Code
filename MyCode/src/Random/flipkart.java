package Random;

/**
 * Created by satyam mishra, Data Structure on 27/01/18.
 */

import java.util.Scanner;

public class flipkart {
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        String str=in.nextLine();
        int len=str.length();
        int m = in.nextInt();
        while(m>0){
            m--;
            int index=in.nextInt();
            if(index>0) {
                str = reverse(str, index - 1, len - index + 1);
            }
        }
        System.out.println(str);

    }

//    private static String reverse(String str,int start,int end){
//
//        String st1=str.substring(0,start);
//        String st2 = str.substring(start,end);
//        StringBuilder x= new StringBuilder(st2);
//        x=x.reverse();
//        String st3=str.substring(end,str.length());
//        return st1+x.toString()+st3;
//
//    }
    private static String reverse(String str,int start,int end){
        char [] arr=str.toCharArray();
        while(start<end){
            char temp=str.charAt(start);
            arr[start]=arr[end];
            arr[end]=temp;

        }
        return str;
    }

    }