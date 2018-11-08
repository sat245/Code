import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by i318862 on 02/11/17.
 */
public class WaveArray {
    public static void main(String [] args) {
        ArrayList<Integer> aaa=new ArrayList<Integer>();
        aaa.add(5);
        aaa.add(1);
        aaa.add(3);
        aaa.add(2);
        aaa.add(4);

        aaa= wave(aaa);
        System.out.println("OK");

    }
    public static ArrayList<Integer> wave(ArrayList<Integer> a) {
        Collections.sort(a);
        for(int i = 0;i<a.size();i+=2) {
            if((i+1)<a.size()) {
                swap(i,i+1,a);
            }
        }
        return a;
    }

    private static void swap(int i, int i1,ArrayList<Integer> a) {
        int a1= a.get(i);
        int a2 = a.get(i1);
        a.remove(i1);
        a.remove(i);
        a.add(i,a2);
        a.add(i1,a1);
    }
}
