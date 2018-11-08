import java.util.ArrayList;
import java.util.List;

/**
 * Created by i318862 on 19/06/17.
 */
public class LargestContiguousSum {

    public static int maxSubArray(final List<Integer> a) {

        int max = a.get(0);
        int sum = 0;

        for(Integer num:a) {
            sum = sum + num;

            if(sum<num) {
                sum=num;
            }
            if(sum>max){
                max=sum;
            }

        }
        return max;


    }

    public static void main(String [] args) {
        ArrayList arr = new ArrayList();
        arr.add(-2);
        arr.add(1);
        arr.add(-3);
        arr.add(4);
        arr.add(-1);
        arr.add(2);
        arr.add(1);
        arr.add(-5);
        arr.add(4);
      //  arr.add(1);
        System.out.println(maxSubArray(arr));
    }

}
