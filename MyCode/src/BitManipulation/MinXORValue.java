package BitManipulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by i318862 on 22/01/18.
 */
public class MinXORValue {

    public static void main(String [] args){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(0);
        arr.add(4);

        arr.add(7);

        arr.add(9);

        System.out.print( findMinXor(arr));
    }
    public static  int findMinXor(ArrayList<Integer> A) {
        A.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<A.size()-1;i++){
            int valu=A.get(i)^A.get(i+1);
            if(valu<min){
                min=valu;
            }

        }
        return min;
    }

}
