package StringProblems;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by satyam mishra, Data Structure on 11/12/17.
 */
public class IntegerToRoman {
    public static void main(String [] args){
        System.out.println(intToRoman(99));
    }
    public static String intToRoman(int a) {
        int a1=a;
        Map<Integer,String> map = new HashMap<Integer,String>();
        map.put(1,"I");
        map.put(10,"X");
        map.put(50,"L");
        map.put(100,"C");
        map.put(5,"V");
        map.put(500,"D");
        map.put(1000,"M");

        map.put(2,"II");
        map.put(3,"III");
        map.put(4,"IV");
        map.put(6,"VI");
        map.put(7,"VII");
        map.put(8,"VIII");
        map.put(9,"IX");


        map.put(0,"");

        int b=0,c=0,d=0,e=0,f=0,g=0;
        if((a/1000)>0){
            b=a/1000;
            a=a%1000;
        }

        if((a/500)>0){
            c=a/500;
            a=a%500;
        }

        if((a/100)>0){
            d=a/100;
            a=a%100;
        }
        if((a/50)>0){
            e=a/50;
            a=a%50;
        }

        if((a/10)>0){
            if(a%10>3){
                return intToRoman1(a1+2*(10-a1%10));
            }
            f=a/10;
            a=a%10;
        }

//        if((a/5)>0){
//            g=a/5;
//            a=a%5;
//        }

        String str="";
        for(int i=0;i<b;i++) {
            str=str+map.get(1000);
        }
        for(int i=0;i<c;i++) {
            str=str+map.get(500);
        }
        for(int i=0;i<d;i++) {
            str=str+map.get(100);
        }
        for(int i=0;i<e;i++) {
            str=str+map.get(50);
        }
        for(int i=0;i<f;i++) {
            str=str+map.get(10);
        }
//        for(int i=0;i<g;i++) {
//            str=str+map.get(5);
//        }

        str=str+map.get(a);
        return str;
    }

    public static String intToRoman1(int a) {
        Map<Integer,String> map = new HashMap<Integer,String>();
        map.put(1,"I");
        map.put(10,"X");
        map.put(50,"L");
        map.put(100,"C");
        map.put(5,"V");
        map.put(500,"D");
        map.put(1000,"M");

        map.put(2,"II");
        map.put(3,"III");
        map.put(4,"IV");
        map.put(6,"VI");
        map.put(7,"VII");
        map.put(8,"VIII");
        map.put(9,"IX");


        map.put(0,"");

        int b=0,c=0,d=0,e=0,f=0,g=0;
        if((a/1000)>0){
            b=a/1000;
            a=a%1000;
        }

        if((a/500)>0){
            c=a/500;
            a=a%500;
        }

        if((a/100)>0){
            d=a/100;
            a=a%100;
        }
        if((a/50)>0){
            e=a/50;
            a=a%50;
        }

        if((a/10)>0){
            f=a/10;
            a=a%10;
        }

//        if((a/5)>0){
//            g=a/5;
//            a=a%5;
//        }

        String str="";
        for(int i=0;i<b;i++) {
            str=map.get(1000)+str;
        }
        for(int i=0;i<c;i++) {
            str=map.get(500)+str;
        }
        for(int i=0;i<d;i++) {
            str=map.get(100)+str;
        }
        for(int i=0;i<e;i++) {
            str=map.get(50)+str;
        }
        for(int i=0;i<f;i++) {
            str=map.get(10)+str;
        }
//        for(int i=0;i<g;i++) {
//            str=str+map.get(5);
//        }

        str=map.get(a)+str;
        return str;
    }





    }
