package Binary;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by i318862 on 16/12/17.
 */
public class PainterPartitionProblem {

    public static final int MOD = 10000003;

    public static void main(String[] args) {
//        Integer [] arr ={640, 435, 647, 352, 8, 90, 960, 329, 859};
        Integer[] arr = {1000000, 1000000};

        ArrayList<Integer> aa = new ArrayList<Integer>(Arrays.asList(arr));
        System.out.println(paint(1, 1000000, aa));
    }

    public static int paint(int a, int b, ArrayList<Integer> c) {
        long[] arr = new long[c.size()];
        long sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (c.get(i) * (long)b) ;
            sum = (sum + arr[i]);
        }
        long maxDays = sum / a;
        sum = 0;
        int count = 1;
        long max = 0;
        for (int i = 0; i < arr.length; i++) {

            sum = (sum + arr[i]);
            if (sum <=maxDays) {
                if (sum > max) {
                    max = sum;
                }
                continue;
            }
            if ((sum - maxDays) < Math.abs(sum - arr[i] - maxDays)) {
                if (count <= a) {
                    if (sum > max) {
                        max = sum;
                    }
                    sum = 0;
                    count++;
                }
            } else {
                if (count <= a) {
                    if (sum - arr[i] > max) {
                        max = (sum - arr[i] + MOD) % MOD;
                    }
                    sum = arr[i];
                    if (sum > max) {
                        max = sum;
                    }
                    count++;
                }
            }


        }
        return (int) (max % MOD);
    }

}
