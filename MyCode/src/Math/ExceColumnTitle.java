package Math;

import java.util.Map;

import static javafx.application.Platform.exit;

/**
 * Created by i318862 on 12/11/17.
 */
public class ExceColumnTitle {
    public static void main (String [] args) {
        char a='A';
        System.out.println(convertToTitle(943566));

    }

    public static  String convertToTitle(int a) {
//        String s="";
        StringBuilder s=new StringBuilder();

        int count=0;

        while(a>0) {
             count=a%26;
            if(count==0) {
                count = 26;
                a=a-26;         //important
            }
            s=s.append((char)(count+64));
            a=a/26;
        }
//        s=s.append((char)(count+64));
        return s.reverse().toString();
    }

}
