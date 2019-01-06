package Competitions;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// image of question is attached

public class PlayingWithGraphs {
    public static void main(String args[] ) throws Exception {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if(n<=0){
            return;
        }
        Map<Integer,Integer> map = new HashMap<>(n);
        int count =1;
        while (n>0){
            n--;
            int x = s.nextInt();
            if(x>0)
            map.put(count++,x);
        }

        int queries = s.nextInt();

        while (queries>0){
            queries--;
            int a =s.nextInt();
            int b = s.nextInt();
            switch (a) {
                case 1:{
                    int temp = b;
                   if(!map.containsKey(temp)){
                       System.out.println(temp);
                       break;
                   }
                   boolean flag = false;
                   Map<Integer,Integer> visited = new HashMap<>();
                   visited.put(temp,1);
                    while (map.containsKey(temp)){
                        temp  = map.get(temp);

                        if(visited.containsKey(temp)){
                            flag =true;
                            break;
                        }else {
                            visited.put(temp,1);
                        }
                    }
                    if(flag){
                        System.out.println("LOOP");
                    }else {
                        System.out.println(temp);
                    }
                    break;
                }
                case 2:{
                    if(map.containsKey(b))
                    map.remove(b);
                    break;
                }
            }
        }

    }
}
