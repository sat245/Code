package StringProblems;

import java.util.ArrayList;

/**
 * Created by satyam mishra, Data Structure on 06/12/17.
 */
public class LongestCommonPrefix {

    public static void main (String [] args){
        ArrayList<String> a = new ArrayList<String>();
        a.add("aaaaaaaaaaaaaaaaaaaaaaaaaa");
        a.add("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        a.add("aaaaaa");

        System.out.print(longestCommonPrefix(a));
    }
    public static String longestCommonPrefix(ArrayList<String> a) {
        String str="";
        if(a==null || a.size()==0){
            return str;
        }
        if(a.size()==1){
            return a.get(0);
        }
        String check = a.get(0);
        for(int i=0;i<check.length();i++) {
            char ch = check.charAt(i);
            for(int j=1;j<a.size();j++){
                if(i>=a.get(j).length())
                    return str;
                if(!(ch==a.get(j).charAt(i))){
                    return str;
                }
            }
            str=str+ch;
        }
            return str;
    }
}
