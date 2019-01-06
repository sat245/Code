package Graph;

import sun.plugin.dom.core.CoreConstants;

import java.security.Key;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

public class ValidPath {
    public static String solve(int A, int B, int C, int D, ArrayList<Integer> E, ArrayList<Integer> F) {

        Map<coordinate, Integer> bannedX = new HashMap();


        for (int i = 0; i < C; i++) {
            int x = E.get(i);
            int y = F.get(i);

            bannedX.put(new coordinate(x+D,y),1);
            bannedX.put(new coordinate(x,y+D),1);

            if((x-D)>0){
                bannedX.put(new coordinate(x-D,y),1);

            }

            if((y-D)>0){
                bannedX.put(new coordinate(x,y-D),1);
                }



        }

        Queue<coordinate> queuex = new ArrayDeque<>();

        queuex.add(new coordinate(0, 0));

        coordinate obj = new coordinate(A,B);

        while (!queuex.isEmpty()) {

            coordinate coordinate = queuex.poll();
            int x = coordinate.x;
            int y = coordinate.y;

            if(coordinate.equals(obj)){
                return "YES";
            }

            if (bannedX.containsKey(coordinate)) {
                continue;
            }else {

                if((x+1)<=A)
                queuex.add(new coordinate(x+1,y));

                if((y+1)<=B)
                queuex.add(new coordinate(x,y+1));

                if((x+1)<=A && (y+1)<=B)
                    queuex.add(new coordinate(x+1,y+1));

                if((x-1)>0){
                    queuex.add(new coordinate(x-1,y));
                    if((y+1)<=B)
                        queuex.add(new coordinate(x-1,y+1));

                }

                if((y-1)>0){
                    queuex.add(new coordinate(x,y-1));
                    if((x+1)<=A)
                        queuex.add(new coordinate(x+1,y-1));
                }

                if((x-1)>0 && (y-1)>0){
                    queuex.add(new coordinate(x-1,y-1));
                }

            }
            }

    return "NO";
        }
    public static void main(String [] args){

        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(2);

        ArrayList<Integer> arr1 = new ArrayList<Integer>();
        arr1.add(3);



        String str = solve(2,3,1,1,arr,arr1);

        System.out.println("*** " + str);
    }
    }

    class coordinate {
        int x;
        int y;

        public coordinate(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

