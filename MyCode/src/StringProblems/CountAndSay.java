package StringProblems;

import jdk.nashorn.internal.ir.WhileNode;

/**
 * Created by satyam mishra, Data Structure on 06/12/17.
 */
public class CountAndSay {

    public static void main(String []args) {
        System.out.print(countAndSay(3));
    }

    public static String countAndSay(int a) {
        String s="1";
        for(int i=1;i<a;i++){
            s=fn(s);
        }
        return s;
    }


    public static String fn(String str) {
        int len = str.length();
        String str1="";
        char [] arr = str.toCharArray();
        int count = 1;
        char ch = arr[0];
        for(int i = 1;i<len;i++) {
            if(arr[i]==ch){
                count++;
            }else{
                str1=str1+count+ch;
                count=1;
            }
            ch=arr[i];
        }
        str1=str1+count+ch;
        return str1;
    }
}
