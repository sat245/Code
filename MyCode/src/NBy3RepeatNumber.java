import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by satyam mishra, Data Structure on 08/11/17.
 */
public class NBy3RepeatNumber {

    public static void main(String [] args) {
        List <Integer> b = new ArrayList<Integer>();
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


        System.out.println(repeatedNumber(b));
    }

    public static int repeatedNumber(final List<Integer> a) {
        int size =a.size();
        Map <Integer,Integer> map = new HashMap<Integer,Integer>(2);

        for(int i=0;i<size;i++) {
            int num = a.get(i);
            if(map.containsKey(num)) {
                map.compute(num,(k,v)->v+1);
            }else {
                if(map.keySet().size()==2) {
                    Object [] set = map.keySet().toArray();
                    map.compute((int)set[0],(k,v)->v-1);
                    map.compute((int)set[1],(k,v)->v-1);

                    if(map.get((int)set[0])==0)
                        map.remove((int)set[0]);
                        if(map.get((int)set[1])==0)
                        map.remove((int)set[1]);

                        continue;
                }   else {
                    map.put(num,1);
                }

            }
            System.out.print("OK");
        }
        Object [] set = map.keySet().toArray();
        if(set.length==0)
            return -1;
        int key1=-1;
        int key2=-1;
        if(set.length==1) {
            key1=(int)set[0];
            map.compute((int)set[0],(k,v)->0);
        }
        if(set.length==2) {
            key2=(int)set[1];
            map.compute((int)set[1],(k,v)->0);
            key1=(int)set[0];
            map.compute((int)set[0],(k,v)->0);
        }
        for(int i=0;i<size;i++) {
            if(map.containsKey(a.get(i))){
                map.compute((a.get(i)),(k,v)->v+1);
            }
        }
        if(map.get(key1)>(size/3))
            return key1;
        if(set.length==2 && map.get(key2)>(size/3))
            return key2;

        return -1;

    }
}
