import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by satyam mishra, Data Structure on 21/06/17.
 */
public class maxSum {

    public static int sum(ArrayList<Integer> a) {
    int i =0;
        int sumai = (a.get(0)+1),sumbj=(a.get(0)+1);
        int minusai=(a.get(0)-1),minusbj=(a.get(0)-1);
    for(int j=1;j<a.size();j++) {
        if((a.get(j)+j+1)<sumai)
            sumai = (a.get(j)+j+1);

        if((a.get(j)+j+1)>sumbj)
            sumbj = (a.get(j)+j+1);

        if((a.get(j)-j-1)>minusai)
            minusai = (a.get(j)-j-1);

        if((a.get(j)-j-1)<minusbj)
            minusbj = (a.get(j)-j-1);

    }

        return Math.max((sumbj-sumai),(minusai-minusbj));
    }

    public static void main(String[] args) {
      //  Integer[] a = {53, 2, 55, -73, -19, 64, -71, 8, -4, -64, 43, -40, 63, -76, 1, 87, -78, 81, 71, -46, -39, 6, 76, -93, 32, 36, -91, -77, -37, 90, -30, -66, -73, 56, 5, -40, -30, 14, 55, -95, -5, -10, -16, -75, -60, -28, 37, -74, -36, -82};
      Integer [] a= { 61, 35, 50, 2, 29, 29, 97, 47, 28, 36, 45, 67, 60, 70, 56, 32, 63, 36, 72, 52, 41,
                      32, 48, 28, 60, 32, 34, 67, 86, 15, 47, 30, 61, 34, 51, 49, 27, 30, 81, 45, 43, 63, 66, 70, 38, 32, 68, 42, 72, 41 };

        ArrayList<Integer> aa = new ArrayList<Integer>(Arrays.asList(a));
//        aa.add(1);
//        aa.add(3);
//        aa.add(-1);
        System.out.println(sum(aa));
    }
}

    class obj {
        int value;
        int key;

    }


