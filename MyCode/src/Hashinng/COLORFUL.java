package Hashinng;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by satyam mishra, Data Structure on 01/03/18.
 */
public class COLORFUL {

    public static void main(String [] args){
        System.out.println(colorful(3245));
    }

    public static int colorful(int A) {
        String str = String.valueOf(A);
        int size = String.valueOf(A).length();
        Map <Integer,Integer> map = new HashMap();
        int count =0;
        for(int i=0;i<size;i++){
            int prod=1;
            for(int j=i;j<size;j++){
                prod=prod* Character.getNumericValue(str.charAt(j));
                count++;
                if(map.containsKey(prod)){
                    return 0;
                }else {
                    map.put(prod,1);
                }

            }
        }
        if(map.size()==count){
            return 1;
        }
        return 0;
    }
}
