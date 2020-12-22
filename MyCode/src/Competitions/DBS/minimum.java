package Competitions.DBS;

/**
 * Created by satyam mishra, Data Structure on 11/03/19.
 */
public class minimum {

    public static int FinfIt(int [] arr,int n){
        if(arr==null || arr.length==0){
            return 0;
        }
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }
}
