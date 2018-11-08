package Math;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by i318862 on 10/11/17.
 */
public class SumOfPairwiseHammingDistance {
    public static void main(String [] args) {
        List <Integer>list= new ArrayList();
        list.add(2);
        list.add(4);
        list.add(6);
        System.out.println(hammingDistance(list));

    }

    public static int hammingDistance(final List<Integer> A) {
        int size = A.size();
        long sum=0;
        if(A.size()<2){
            return 0;
        }
        for(int i=0;i<31;i++) {
            int count=0;
            for(int j=0;j<size;j++) {
                long d= (A.get(j)&(1<<i));
                if((d)==0){
                    count++;
                }
            }
            sum=(sum%1000000007)+(count%1000000007)*(size-count);


        }
        return (int) (2*sum);
    }

//    public static int distance(int a,int b) {
//        int c=a^b;
//        int count=0;
//        while(c!=0){
//            if((c&1)==1) {
//                c=c>>1;
//                count++;
//            }else {
//                c = c >> 1;
//            }
//
//        }
//        return count;
//
//    }
}
