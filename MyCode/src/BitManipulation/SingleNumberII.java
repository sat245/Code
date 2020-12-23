package BitManipulation;

import java.util.*;

/**
 * Created by satyam mishra, Data Structure on 23/01/18.
 */
public class SingleNumberII {
    public static void main(String [] args){
        Integer [] arr= {1, 2, 4, 3, 3, 2, 2, 3, 1, 1};
        List list = new ArrayList(Arrays.asList(arr));
        System.out.print(singleNumber(list));
    }
    public static int singleNumber(final List<Integer> A) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for (int i=0;i<A.size();i++){
            if(map.containsKey(A.get(i))){
                map.put(A.get(i),map.get(A.get(i))+1);
                continue;
            }else {
                map.put(A.get(i),1);
            }

        }
        for (int i=0;i<A.size();i++){
            if(map.get(A.get(i))==1){
                return A.get(i);
            }
        }
        return 0;
    }
}
