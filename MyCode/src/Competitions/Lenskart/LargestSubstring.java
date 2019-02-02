package Competitions.Lenskart;

//You are given a string  of length . Each character of the string is either  or . Now, you need to select the largest substring in which the count of  in the string is more than the count of . Print the maximum possible length of the subarray in the output.
//
//        Input
//
//        The first line contains an integer  as input.
//        The next line contains a string comprising of  0 and 1 . The length of this string is exactly N.
//
//        Output
//
//        In the output print the length of the largest substring in which the count of  is more than .
//
//        Constraints
//
//        Sample Input
//        6
//        011100
//        Sample Output
//        3
//        Explanation
//        The last three characters i.e.  forms a substring of length  which is the largest substring possible in which  are more than .

import java.util.Scanner;

public class LargestSubstring {
    public static void main(String args[] ) throws Exception {

        Scanner s = new Scanner(System.in);
        String str="";
        int n  = s.nextInt();
        if(n>0) {
             str = s.next();
        }else {
            System.out.println(0);
            return;
        }

        char [] ch1 = str.toCharArray();
        int size = ch1.length;int max=0;

        int [] ch = new int[size];


        for(int i=0;i<size;i++){
            if(ch1[i]=='1'){
              ch[i]=1;
            }else {
                ch[i]=-1;
            }
        }

        for(int i=0;i<size-max;i++){
            int sum=0;
            for (int j=i;j<size-max;j++){
                sum = sum+ch[j];
                if(sum<0){
                    int length = j-i+1;
                    if(length>max){
                        max=length;
                    }
                }
            }
        }
        System.out.println(max);
    }
}
