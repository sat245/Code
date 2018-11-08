package TwoPointers;

import java.util.ArrayList;

/**
 * Created by i318862 on 14/12/17.
 */
public class SortbyColorBook {
    public void sortColors(ArrayList<Integer> a) {
        int [] arr=new int[3];

        for(int i=0;i<a.size();i++){
            arr[a.get(i)]++;
        }
        int index=0;
        a.clear();
        for(int i=0;i<arr[0];i++){
            a.add(index++,0);
        }

        for(int i=0;i<arr[1];i++){
            a.add(index++,1);
        }

        for(int i=0;i<arr[2];i++){
            a.add(index++,2);

        }



    }
}
