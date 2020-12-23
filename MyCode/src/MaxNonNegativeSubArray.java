import java.util.ArrayList;

/**
 * Created by satyam mishra, Data Structure on 19/06/17.
 */
public class MaxNonNegativeSubArray {
    public static ArrayList<Integer> maxset(ArrayList<Integer> a) {
        ArrayList<x> map = new ArrayList<x>();
        long max = -1;
        long sum = 0;
        int key = 0;
        x x = new x();
        x.init = 0;
        for (int i = 0; i < a.size(); i++) {
            int num = a.get(i);
            if (num >= 0) {
                sum = sum + num;
            }
            else {
                x.sum = sum;
                x.length = i - x.init;
                map.add(x);
                x = new x();
                sum = 0;
                x.init = i + 1;

            }

            if(num>=0 && i == a.size()-1) {
                x.sum = sum;
                x.length = i - x.init+1;
                map.add(x);
            }



        }
        int maxL = 0, minI = 0;

        x z = new x();

        for (int i = 0; i < map.size(); i++) {
            x y = map.get(i);
            max = z.sum;
            maxL = z.length;
            minI = z.init;

            if (y.sum >max) {

                z = y;
                continue;
            }
            if (y.sum == max ) {
                if( y.length > maxL) {
                    z = y;
                    continue;
                }
            }
            if (y.sum == max && y.length == maxL && minI < y.init) {
                z = y;
            }


        }
        ArrayList<Integer> aaaa = new ArrayList<Integer>();
            for(int i = z.init; i<(z.init+z.length);i++){
                aaaa.add(a.get(i));

            }
        return aaaa;
    }

    public static void main(String[] args) {
        ArrayList arr = new ArrayList();
        arr.add(0);
        arr.add(0);
        arr.add(-1);
        arr.add(0);
//        arr.add(1424268980);
//        arr.add(3);

        System.out.print(maxset(arr));

    }
}

class x {
    long  sum;
    int length;
    int init;

}
