package TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by i318862 on 13/12/17.
 */
public class MaxContinuousSeriesof1s {

    public static void main(String [] args){
        Integer [] arr={1 ,1 ,0 ,1 ,1 ,0 ,0 ,1 ,1 ,1 };
        ArrayList<Integer> aa=new ArrayList<Integer>(Arrays.asList(arr));
        System.out.print(maxone(aa,1));
    }

    public static ArrayList<Integer> maxone(ArrayList<Integer> a, int b) {
        int i=0,j=0,count=0,max=0,m,start=0,end=0;
        m=b;
        for(i=0;i<a.size();i++){
            j=i;
            while(j<a.size() && ( (a.get(j)==1) || (a.get(j)==0 && m>=1))){
                count++;
                if((a.get(j)==0 && m>=1)){
                    m--;
                }
                j++;
            }
            if(count>max){
                max=count;
                start=i;
                end=i+count;
            }
            m=b;
            count=0;

        }
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(i=start;i<end;i++){
            arr.add(i);
        }
        return arr;

    }

}
