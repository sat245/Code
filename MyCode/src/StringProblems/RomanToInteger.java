package StringProblems;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by i318862 on 11/12/17.
 */
public class RomanToInteger {

    public static void main(String [] args) {
        System.out.println(romanToInt("MDCCCIV"));
    }
    public static int romanToInt(String a) {
        Map<Character,Integer> map =new HashMap<Character, Integer>();
        map.put('I',1);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('V',5);
        map.put('D',500);
        map.put('M',1000);



        int sum=map.get(a.charAt(a.length()-1));
        for(int i=a.length()-1;i>0;i--) {
            if(map.get(a.charAt(i))<=map.get(a.charAt(i-1))){
                sum=sum+map.get(a.charAt(i-1));
            }else {
                sum=sum-map.get(a.charAt(i-1));
            }
        }
        return sum;
    }
}
