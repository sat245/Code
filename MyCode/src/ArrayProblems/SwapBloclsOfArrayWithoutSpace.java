package ArrayProblems;


import java.util.ArrayList;
import java.util.Collections;

//https://www.geeksforgeeks.org/block-swap-algorithm-for-array-rotation/
public class SwapBloclsOfArrayWithoutSpace {
    public static void main(String [] args){
        ArrayList<Integer> arr  = new ArrayList<>();
        arr.add(1);arr.add(2);arr.add(3);arr.add(4);arr.add(5);arr.add(6);arr.add(7);
        int d=2;
        int n=arr.size();
        rotate(arr,d,0,n-1);
        System.out.println(arr);
    }
    public static void rotate(ArrayList<Integer> arr,int d,int start,int end){
        if (d==0 || start>=end){
          //  Collections.swap(arr,start,end);
            return;
        }
        int aL =start,aR=start+d-1,bL=aR+1,bR=end;

        if((aR-aL) < (bR-bL)){
            swap(arr,aL,aR,bR-d+1,bR);
            if((d+1)!=aR-aL){
                d = Math.min(aR-aL,d-1);

            }
            rotate(arr,d,start,end-d);
        }else {
            swap(arr,aL,aL+d,bL,bR);
            if((d)!=bR-bL){
                d = Math.min(d,bR-bL);

            }
            rotate(arr,d,start+d,end);
        }
    }

    private static void swap(ArrayList<Integer> arr, int aL, int aR, int bL, int bR) {
        int i = aL,j=bL;
        while (i<=aR && j<=bR){
            Collections.swap(arr,i,j);
            i++;j++;
        }
    }
}
