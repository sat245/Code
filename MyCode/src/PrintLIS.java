import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 * Created by satyam mishra, Data Structure on 15/06/17.
 */
public class PrintLIS {


//        public static ArrayList<Integer> plusOne(ArrayList<Integer> a) {
//            Integer [] arr = a.toArray(new Integer[a.size()]);
//            if(a.get(a.size()-1)<9) {
//                arr[a.size()-1] =  arr[a.size()-1] +1;
//                return new ArrayList<Integer>(Arrays.asList(arr));
//            }
//
//            int carry = 0;
//            for(int i = a.size()-1;i >=0; i--){
//               int p = a.get(i);
//                if((p==9 && carry==1) || (p==9 && i==a.size()-1)) {
//                    arr[i] = 0;
//                    carry = 1;
//                }
//
//                 if ((p <9 && i==a.size()-1)) {
//                     arr[i] =  arr[i] +1;
//                     carry = 0;
//
//                 }
//
//
//
//            }
//            if (carry==1){
//                a = new ArrayList<Integer>(Arrays.asList(arr));
//                a.add(0,1);
//            }
//            return a;



    public static  ArrayList<Integer> plusOne(ArrayList<Integer> a) {

        Integer [] arr = a.toArray(new Integer[a.size()]);
        if(a.get(a.size()-1)<9) {
            arr[a.size()-1] =  arr[a.size()-1] +1;
            a=new ArrayList<Integer>(Arrays.asList(arr));
            int i = 0;
            Iterator<Integer> it = a.iterator();

            while (it.hasNext() && it.next() == 0) {
                ++i;
            }
            while (i>0) {
                i--;
                a.remove(0);
            }

            return a;
        }

        int carry = 0;
        for(int i = a.size()-1;i >=0; i--){
            int p = a.get(i);
            if((p==9 && carry==1) || (p==9 && i==a.size()-1)) {
                arr[i] = 0;
                carry = 1;
            }

            if ((p <9 && i==a.size()-1)) {
                arr[i] =  arr[i] +1;
                carry = 0;

            }
            if((p<9 && carry==1)) {
                arr[i] = arr[i]+1;
                carry = 0;
            }




        }
        if (carry==1){
            a = new ArrayList<Integer>(Arrays.asList(arr));
            a.add(0,1);
        }else { a = new ArrayList<Integer>(Arrays.asList(arr));}


        int i = 0;
        Iterator<Integer> it = a.iterator();

        while (it.hasNext() && it.next() == 0) {
            ++i;
        }
        while (i>0) {
            i--;
            a.remove(0);
        }
        return a;

    }


    public static void main(String [] args){
        ArrayList arr = new ArrayList();
        arr.add(0);
        arr.add(0);
        arr.add(7);
        arr.add(6);
        arr.add(4);
        arr.add(0);
        arr.add(5);
        arr.add(5);
        arr.add(9);
//        arr.add(9);
//        arr.add(9);
//        arr.add(9);
//        arr.add(9);
//        arr.add(9);
//        arr.add(9);
//        arr.add(9);
//        arr.add(9);
//        arr.add(9);
//        arr.add(9);
//        arr.add(9);
//        arr.add(9);

       System.out.print(plusOne(arr));

    }

}
