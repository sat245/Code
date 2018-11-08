import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by i318862 on 09/11/17.
 */
public class MaximumConsecutiveGap {
    public static void main(String [] args) {
        List<Integer> b = new ArrayList<Integer>();
        b.add(1000441);
        b.add(1000441);
        b.add(1000994);
//        b.add(1);
//        b.add(2);
//        b.add(3);
//        b.add(11);
//        b.add(11);
//        b.add(11);
//        b.add(1);
//        b.add(1);
//        b.add(10);
//        b.add(10);
//        b.add(10);


        System.out.println(maximumGap(b));
    }
    public static int maximumGap(final List<Integer> a) {
    int max=-1;
        if(a.size()<2)
            return 0;
        Collections.sort(a);
        for(int i=0;i<a.size()-1;i++) {
            if(a.get(i+1)-a.get(i)>max)
                max=(a.get(i+1)-a.get(i));
        }
        return max;
    }

}
