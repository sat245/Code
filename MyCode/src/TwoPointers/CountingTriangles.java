package TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;

/**
 * Created by i318862 on 13/12/17.
 */
public class CountingTriangles {
    public static void main(String [] args){
        Integer [] aaaa={1, 1, 1, 2, 2};
        ArrayList<Integer> aa = new ArrayList<Integer>(Arrays.asList(aaaa));
//        aa.add(-1);
//        aa.add(0);
//        aa.add(1);
//        aa.add(-4);

        System.out.println(nTriang(aa));
    }

    public static int nTriang(ArrayList<Integer> A) {
        if(A.size()<3)
            return 0;
        ArrayList<Integer> a= A;
        int last =a.size()-1;
        a.sort((o1, o2) -> o1-o2);
        int count=0;
        ArrayList<sides> arr=new ArrayList<sides>();
        for(int i=0;i<a.size()-2;i++) {
            int start = i + 1;
            last = a.size() - 1;
            while (start < last) {
                while ((start < last) && (a.get(i) + a.get(start) > a.get(last))) {

                    System.out.println(a.get(i) + " " + a.get(start) + " " + a.get(last));
                      start++;
                    }
                count=count+start-i;
                start = i + 1;
                last--;
            }
        }
        return (int) (count% 1000000007);
    }
}
class sides{
    int a;
    int b;
    int c;

    sides(int a,int b,int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
}
