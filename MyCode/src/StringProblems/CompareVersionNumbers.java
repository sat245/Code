package StringProblems;

import java.util.Arrays;
import java.util.List;

/**
 * Created by i318862 on 09/12/17.
 */
public class CompareVersionNumbers {
    public static void main(String [] args){
        System.out.println(compareVersion("1.0","1"));

    }

    public static int compareVersion(String a, String b) {
        List<String> aa = Arrays.asList(a.split("\\."));
        List<String> bb = Arrays.asList(b.split("\\."));

        int size = (aa.size()>bb.size())?bb.size():aa.size();

        for(int i =0;i<size;i++){

            try {
                if (Long.parseLong(aa.get(i)) > Long.parseLong(bb.get(i))) {
                    return 1;
                } else if (Long.parseLong(aa.get(i)) < Long.parseLong(bb.get(i))) {
                    return -1;
                }
            }catch (NumberFormatException exc){
                if(aa.get(i).length()>bb.get(i).length()){
                    return 1;
                }
                if(aa.get(i).length()<bb.get(i).length()){
                    return -1;
                }
            }
        }


        if(aa.size()>bb.size()){
            return 1;
        }

        if(aa.size()<bb.size()){
            return -1;
        }
        return 0;

    }
}
