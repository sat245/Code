package Binary;

import java.util.ArrayList;

/**
 * Created by satyam mishra, Data Structure on 15/12/17.
 */
public class SquareRootofInteger {

    public static void main(String [] args) {
        System.out.print(sqrt(930675566));
    }

        public static int sqrt(int a) {
//        for(int i =1;i<a;i++){
//                if(i*i==a) {
//                    return i;
//                }
//                if(i*i>a){
//                    return i-1;
//
//                }
//            }
//            return 0;
//        if(a==1 || a==0)
//            return a;
//
//        int start=0,end=a,mid;
//        while(start<=end){
//            mid=(start+end)/2;
//            if(mid*mid==a){
//                return mid;
//            }
//            if(mid*mid<a){
//                return mid;
//            }
//            if(mid*mid>a){
//                end=mid-1;
//            }
//
//        }
        return 0;
    }
    public int searchMatrix(ArrayList<ArrayList<Integer>> a, int b) {
        for(int i=0;i<a.size();i++){
            if(a.get(i).get(0)<=b && a.get(i).get(a.get(i).size()-1)>=b){
                if(a.get(i).contains(b))
                return 1;
                return 0;
            }
        }
        return 0;
    }
}
