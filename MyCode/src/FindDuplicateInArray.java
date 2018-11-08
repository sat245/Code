import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by i318862 on 05/11/17.
 */
public class FindDuplicateInArray {
    public static void main(String [] args) {
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(repeatedNumber(list));

    }

    //my submitted code
    public static int repeatedNumber(final List<Integer> a) {
    Map <Integer,Integer> map = new HashMap<Integer, Integer>(a.size()-1);
        for(int i=0;i<a.size();i++) {
            if(map.containsKey(a.get(i))){
                return a.get(i);
            }else {
                map.put(a.get(i),1);
            }
        }
        return -1;
    }

    //editorial
//    public static int repeatedNumber(final List<Integer> a) {
//        /**
//         * Floyd's cycle-finding algorithm, but list is
//         * traversed according to list entries.
//         */
//        int i = 0;
//        int j = 0;
//        do {
//            i = a.get(i);
//            j = a.get(a.get(j));
//        } while(i != j);
//        j = 0;
//        while (i != j) {
//            i = a.get(i);
//            j = a.get(j);
//        }
//        return i;
//    }

}
