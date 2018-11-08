package Practise;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.lang.Integer;

class TestClass {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        for (int i = 0; i < M; i++) {
            StringTokenizer tk = new StringTokenizer(br.readLine());
            int type = Integer.parseInt(tk.nextToken());
            if (type == 1) {
                int val = Integer.parseInt(tk.nextToken());
                add_to_list(val);
            } else if (type == 2) {
                int val = Integer.parseInt(tk.nextToken());
                remove_from_list(val);
            } else if (type == 3) {
                int ans = find_least_frequency();
                System.out.println(ans);
            } else if (type == 4) {
                int ans = find_highest_frequency();
                System.out.println(ans);
            }
        }
    }

    public static void add_to_list(int val) {
        //Process queries of type 1 here
        if(arr.containsKey(val)){
            arr.put(val,arr.get(val)+1);
        }else {
            arr.put(val,1);
        }
        reset_highest_freq(val);
    }

    public static void remove_from_list(int val) {
        //Process queries of type 2 here
        if(!arr.containsKey(val)){
            return;
        }
        if(arr.get(val)>1){
            if(val==lowestNum) {
                arr.put(val, arr.get(val) - 1);
                    if(arr.size()>0) {
                    find_highest_frequency_on_removal();
                }
            } else {
                arr.put(val, arr.get(val) - 1);
            }
        }else {
            if(val==lowestNum){
                arr.remove(val);
                if(arr.size()>0) {
                    find_highest_frequency_on_removal();
                }
            }else {
                arr.remove(val);
            }

        }
        reset_highest_freq(val);

    }

    public static int find_least_frequency() {
        //Process queries of type 3 here
        int leastFrequency=1,highestNum=-1;

       for(Integer obj:arr.keySet()){
           if(leastFrequency>arr.get(obj)){
               leastFrequency = arr.get(obj);
               highestNum = obj;
           }else if(leastFrequency==arr.get(obj)){
                    if(obj>highestNum){
                        leastFrequency = arr.get(obj);
                        highestNum = obj;
                    }
           }
       }
       return highestNum;
    }

    public static int find_highest_frequency() {
        //Process queries of type 4 here
        if(arr.size()==0){
            return -1;
        }
        return lowestNum;
    }

    public static void reset_highest_freq(Integer val) {
        //Process queries of type 4 here
        if(arr.get(val)>highestFrequency){
            highestFrequency = arr.get(val);
            lowestNum = val;
        } else if(arr.get(val)==highestFrequency) {
            if (val<lowestNum){
                lowestNum=val;
            }
        }
    }

    public static void find_highest_frequency_on_removal(){
        highestFrequency=0;lowestNum=-1;
        for(Integer obj:arr.keySet()) {
            if (highestFrequency < arr.get(obj)) {
                highestFrequency = arr.get(obj);
                lowestNum = obj;
            } else if (highestFrequency == arr.get(obj)) {
                if (obj < lowestNum) {
                    highestFrequency = arr.get(obj);
                    lowestNum = obj;
                }
            }
        }
    }


    static Map <Integer,Integer> arr = new HashMap<>();
    static int highestFrequency=0,lowestNum=-1;


}