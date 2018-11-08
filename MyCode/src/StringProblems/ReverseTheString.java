package StringProblems;

/**
 * Created by i318862 on 10/12/17.
 */
public class ReverseTheString {
    public static void main(String [] args) {
        System.out.println(reverseWords("the sky is blue"));
    }

    public static String reverseWords(String a) {
        String [] arr = a.split(" ");
        String str="";
        for(int i=arr.length-1;i>=0;i--) {
            if(arr[i].equals(" ")){
                continue;
            }
            str=str+arr[i]+" ";

    }
        return str.substring(0,a.length());
}
}
