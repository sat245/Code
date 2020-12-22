/**
 * Created by satyam mishra, Data Structure on 13/06/17.
 */
public class LongestSubsequence {


    public static int fn(int[] arr,int size) {
       int [] lis = new int[size];
        for(int i = 0;i<size;i++) {
            lis[i]=1;
        }
        for(int i = 1 ; i <size; i++) {
            for(int j = 0;j<i;j++) {
                if(arr[j]<arr[i] && lis[i]<=lis[j]){
                    lis[i]= lis[j]+1;

                }
            }
        }
        int max=0;
        for(int i = 0;i<size;i++){
            if(lis[i]>max){
                max=lis[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = new int[10];
        arr[0] = 1;
        arr[1] = 3;
        arr[2] = 2;
        arr[3] = 5;
        arr[4] = 9;
        arr[5] = 6;
        arr[6] = 7;
        arr[7] = 8;
        arr[8] = 10;
        arr[9] = 12;

        System.out.print(fn(arr, arr.length));
    }
}
