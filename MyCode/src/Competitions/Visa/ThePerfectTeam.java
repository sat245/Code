package Competitions.Visa;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ThePerfectTeam {

    static int differentTeams(String skills) {
        Map<Character,Integer> map = new HashMap<>(5);
        map.put('p',0);
        map.put('c',0);
        map.put('m',0);
        map.put('b',0);
        map.put('z',0);

        for (int i=0;i<skills.length();i++){
            char ch = skills.charAt(i);

            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
        }

        int count = Integer.MAX_VALUE;
        for(Map.Entry obj:map.entrySet()){
            int val = (int) obj.getValue();
            if(count>val){
                count=val;
            }
        }

        return count;
    }
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        System.out.println(differentTeams(str));
    }
}

