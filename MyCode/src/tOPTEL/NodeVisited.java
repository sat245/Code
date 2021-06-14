package tOPTEL;

import java.security.PublicKey;
import java.util.*;

/**
 * Data Structures & Algorithms
 * https://github.com/SatyamMishra245/Code/tree/master/MyCode
 *
 * @ author : satyam mishra
 * @ created : 02-06-2021
 */
public class NodeVisited {
    public static  boolean solution(int N, int[] A, int[] B) {
        // write your code in Java SE 8

        Map <Integer, ArrayList<Integer>> map = new HashMap<Integer, ArrayList<Integer>>();

        for (int i = 0; i <A.length; i++) {
            int x = A[i];
            if (map.containsKey(x)) {
                ArrayList arr = (ArrayList) map.get(x);
                arr.add(B[i]);
            } else {
                ArrayList arr = new ArrayList<String>();
                arr.add(B[i]);
                map.put(x, arr);
            }
        }
        for (int i = 0; i <A.length; i++) {
            int x = B[i];
            if (map.containsKey(x)) {
                ArrayList arr = (ArrayList) map.get(x);
                arr.add(A[i]);
            } else {
                ArrayList arr = new ArrayList<String>();
                arr.add(A[i]);
                map.put(x, arr);
            }
        }
        Map<Integer,Boolean> visited = new HashMap<>();
        Queue<Integer> queue = new ArrayDeque<>();
        ArrayList<Integer> arr =  map.get(1);
        if(arr!=null && arr.size()>0) {
            Collections.sort(arr);
            arr.forEach(x -> queue.add(x));

        }
        while (!queue.isEmpty()) {
            int num = queue.poll();
            visited.put(num, true);
            arr = map.get(num);
            if(arr!=null && arr.size()>0) {
                Collections.sort(arr);
                arr.forEach(x -> !visited.containsKey(x)? queue.add(x));

            }

            if (visited.size() == N) {
                return true;
            }
        }
        return false;
    }


    public static void main(String [] args) {
        int N=4;
        int [] A = {1,2,1,3};
        int [] B = {2,4,3,4};
        System.out.println(solution(N,A,B));
    }
}
