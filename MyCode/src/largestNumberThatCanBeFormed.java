import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by satyam mishra, Data Structure on 14/06/17.
 */
public class largestNumberThatCanBeFormed {
    public static void main(String[] args){
        int [] arr = {3, 30, 34, 5, 9};
        List <Integer> list = new ArrayList<Integer>();
        for(int i=0;i<arr.length;i++){
            list.add(arr[i]);
        }
        for(Integer obj:list){
            System.out.print(obj);
        }
        System.out.println();
        Collections.sort(list,new comp());

        for(Integer obj:list){
            System.out.print(obj);
        }


    }

}
class comp implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        String xy=Integer.toString(o1).concat(Integer.toString(o2));
        String yx = Integer.toString(o2).concat(Integer.toString(o1));

        return yx.compareTo(xy);

    }
}