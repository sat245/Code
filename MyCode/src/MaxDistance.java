import java.util.ArrayList;
import java.util.List;

/**
 * Created by satyam mishra, Data Structure on 04/11/17.
 */
public class MaxDistance {
    public static void main(String [] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(7);
        list.add(6);
        list.add(5);
        list.add(5);

//        list.add(9);
        System.out.print(maximumGap(list));
    }

    public static int maximumGap(final List<Integer> a) {
        if(a.size()==1){
            return 0;
        }
        int i = 0;
        int j = a.size();
        int [] lmin = new int[j];
        int [] rmax = new int[j];

        int min =a.get(i);
        int max= a.get(j-1);

        lmin[0] =min;
        rmax[j-1]=max;

        int k = j-2;

        for(i=1;i<j ;i++) {
            if(min > a.get(i)) {
                lmin[i]=a.get(i);
                min=a.get(i);

            }else {
                lmin[i] = lmin[i-1];
            }

            if(max<a.get(k) && k>=0){
                max = a.get(k);
                rmax[k] =a.get(k);
                k--;
            }else {
                if(k>=0) {
                    rmax[k] = rmax[k + 1];
                    k--;
                }
            }
        }
        i = 0; j = 0; int maxDiff = -1;
        while (j < lmin.length && i < lmin.length)
        {
            if (lmin[i] <= rmax[j])
            {
                maxDiff = Math.max(maxDiff, j-i);
                j = j + 1;
            }
            else
                i = i + 1;
        }
            return  maxDiff;
      }

}
