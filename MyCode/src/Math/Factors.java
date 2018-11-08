package Math;

import java.util.ArrayList;

/**
 * Created by i318862 on 09/11/17.
 */
public class Factors {
    public static void main(String [] args) {
        int a=85463;
        ArrayList <Integer> arr = new ArrayList<Integer>();
        int index=0;
        for(int i=1;i<=Math.sqrt(a);i++) {
            if(a%i==0){
                arr.add(index++,i);
                if(i!=Math.sqrt(a)){
                    arr.add(index,a/i);
                }
            }


        }
        System.out.println("OK");
        //return arr.size()==2?1:0;
    }
}
