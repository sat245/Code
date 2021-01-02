package Facebook;

import java.util.HashMap;
import java.util.Map;

public class MinimumLightsToActivate {
    public static int solve(int[] A, int B) {
        if(A == null)
            return 0;
        int domain = B-1;
        Map<Integer,Integer> map =  new HashMap<>();
        for(int i=0;i<A.length;i++) {
            int low = i - domain;
            int high = i + domain;
            if(low < 0) low = 0;
            if(high >=A.length) high = A.length- 1;
            int count = 0;
            int  x = 0;
            while (high >= low) {

                if(A[low] == 1 ) {
                    count ++;
                     x = low;
                    if(map.containsKey(low)) {
                       break;
                    }
                }

               low++;
            }
            if(count == 0) {
                return -1;
            } else {
                if(!map.containsKey(low)) {
                    map.put(x,1);
                }
            }
        }
        return map.size();
    }

    public static void main(String [] args) {
        int [] A = {0, 0, 0, 1, 0};
        int B = 3;
        int c =solve(A,B);
        System.out.println(c);
    }
}
