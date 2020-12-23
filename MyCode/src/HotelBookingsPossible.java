import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by satyam mishra, Data Structure on 03/11/17.
 */
public class HotelBookingsPossible {
    public static void main(String [] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        ArrayList<Integer> b = new ArrayList<Integer>();
        a.add(40);
        a.add(18);
//        a.add(12);
//        a.add(30);
//        a.add(0);
//        a.add(17);
//        a.add(38);
//        a.add(36);
//        a.add(45);
//        a.add(2);
//        a.add(33);
//        a.add(36);
//        a.add(39);
//        a.add(25);
//
//        a.add(22);
//        a.add(5);
//        a.add(41);
//        a.add(24);
//        a.add(12);
//        a.add(33);
//        a.add(19);
//
//        a.add(30);
//        a.add(25);
//        a.add(12);
//        a.add(36);
//        a.add(8);


        b.add(40);
        b.add(43);
//        b.add(15);
//        b.add(65);
//        b.add(35);
//        b.add(51);
//        b.add(38);
//        b.add(36);
//        b.add(94);
//        b.add(30);
//        b.add(50);
//        b.add(38);
//        b.add(67);
//        b.add(64);
//
//        b.add(67);
//        b.add(24);
//        b.add(62);
//        b.add(38);
//        b.add(18);
//        b.add(59);
//        b.add(20);
//        b.add(74);
//        b.add(33);
//        b.add(43);
//        b.add(56);
//        b.add(32);




        System.out.println(hotel(a,b,1));


    }
    public static boolean hotel(ArrayList<Integer> arrive, ArrayList<Integer> depart, int K) {
        int rooms = K;
        if(arrive.size()<K) {
            return true;
        }
        int []r = new int[K];
//        int arr= Collections.min(arrive);
//        int dep = Collections.max(depart);

       // r[0] = depart.get(0);

        obj o = new obj();
        ArrayList<obj> arrival = o.fn(arrive);
        for(int i=0;i<arrive.size();i++) {
         int  arr = arrival.get(i).value;
            int arrIndex = arrival.get(i).index;
            if(arr<=0) {
                continue;
            }
            if(depart.get(arrIndex)==arr)
                continue;
            K=rooms;
            int count = 0;
            while (K>0) {


                if (r[K - 1] <= arr || r[K-1]==0) {

                    r[K - 1] = depart.get(arrIndex);
                    count++;
                    break;
                }
                K--;

            }
            if(count==0) {
                return false;
            }
            }
        return true;
    }

    static class obj {
        int index=0;
        int value=-1;

        public  ArrayList<obj> fn(ArrayList<Integer> a) {
            ArrayList<obj> aa = new ArrayList<obj>();
            for(int i = 0;i<a.size();i++) {
                obj o = new obj();
                o.index =i;
                o.value = a.get(i);
                aa.add(o);
            }
            Collections.sort(aa, new Comparator<obj>() {
                @Override
                public int compare(obj o1, obj o2) {
                    return o1.value-o2.value;
                }
            });
            return aa;
        }
    }

}
