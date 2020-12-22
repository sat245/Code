import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.IntSummaryStatistics;
import java.util.Map;

/**
 * Created by satyam mishra, Data Structure on 07/11/17.
 */
public class FirstMissingInteger {
    public static void main(String [] args) {
        ArrayList<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> b = new ArrayList<Integer>();
        b.add(1);
//        b.add(-7);
//        b.add(-6);
//        b.add(1);

        System.out.println(firstMissingPositive(b));
    }
    public  static int firstMissingPositive(ArrayList<Integer> a) {
        Map map =new HashMap<Integer,IntSummaryStatistics>();
        int count=0;
        int i=0;
        for(i=0;i<a.size();i++) {
            if(a.get(i)<=0)
                count++;
            map.put(a.get(i),a.get(i));
        }
        for( i=1;i<=a.size();i++) {
           if(!map.containsKey(i))
               return i;

        }
        if (count==0){
            return i;
        }

        return 1;
    }


}
