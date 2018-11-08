import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by i318862 on 05/11/17.
 */
public class RotateMatrix {
    static int iRow=0,iCol=0,fRow=0,fCol=0;
    public static void main(String [] args) {
        ArrayList<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> b = new ArrayList<Integer>();
        ArrayList<Integer> b1 = new ArrayList<Integer>();
        ArrayList<Integer> b2 = new ArrayList<Integer>();
        ArrayList<Integer> b3 = new ArrayList<Integer>();



        b.add(1);
        b.add(2);
        b.add(3);
//        b.add(4);

        b1.add(5);
        b1.add(6);
        b1.add(7);
//        b1.add(8);

        b2.add(9);
        b2.add(10);
        b2.add(11);
//        b2.add(12);

        b3.add(13);
        b3.add(14);
        b3.add(15);
//        b3.add(16);

        a.add(b);
        a.add(b1);
        a.add(b2);
        a.add(b3);
        rotate(a);
        System.out.println("OK");



    }

    public static void rotate(ArrayList<ArrayList<Integer>> a) {
        int loop = a.size()/2;
//        double shift = Math.ceil(a.size()/2);
        for(int i=0;i<loop;i++) {   //TAKE EACH SQUARE AND ROTATE
            for(int j=0;j<a.size()-1-2*i;j++) {
                iRow=i;
                iCol=j+i;    //ADDING I IS CRUCIAL
                fRow=j+i;
                fCol=a.size()-1-i;
                swap(a);

                fRow = fCol;
                fCol = a.size()-1-j-i;
                swap(a);

                fRow = fCol;
                fCol = i;
                swap(a);
            }
        }
    }

    private static void swap(ArrayList<ArrayList<Integer>> a) {
        int temp = a.get(iRow).get(iCol);
        int temp1=a.get(fRow).get(fCol);
        a.get(fRow).remove(fCol);
        a.get(fRow).add(fCol,temp);
        a.get(iRow).remove(iCol);
        a.get(iRow).add(iCol,temp1);
    }
}
