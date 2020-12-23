package ArrayProblems;

import java.util.*;

/**
 * Created by satyam mishra, Data Structure on 27/01/18.
 */
public class flipkartRound1 {
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        String str=in.nextLine();
//        int len=str.length();
//        int m = in.nextInt();
//        while(m>0){
//            m--;
//            int index=in.nextInt();
//            if(index>0) {
//                str = reverse(str, index - 1, len - index + 1);
//            }
//        }
        System.out.println(getLongestBalancedChromosome(str));

    }
    static int getLongestBalancedChromosome(String c) {
        if(c.length()<1){
            return 0;
        }
        int arr[] = new int[c.length()];
        Map<Integer, List<Integer>> cummalativeSumHash = new HashMap<>();
        for (int i = 0; i < c.length(); i++) {
            if (i == 0) {
                arr[0] = c.charAt(0) == '1' ? 1: -1;
            } else {
                arr[i] = arr[i-1] + (c.charAt(i) == '1' ? 1 : -1);
            }
            List<Integer> sumList = cummalativeSumHash.getOrDefault(arr[i], new ArrayList<>());
            sumList.add(i);
            cummalativeSumHash.put(arr[i], sumList);
        }
        int max = 0;
        for (int key : cummalativeSumHash.keySet()) {
            List<Integer> sumList = cummalativeSumHash.get(key);
            max = Math.max(max, sumList.get(sumList.size() - 1) - sumList.get(0));
        }
        for (int i = c.length()-1; i >= 0; i--) {
            if (arr[i] == 0) {
                max = Math.max(i+1, max);
                break;
            }
        }
        return max;
    }
    static int getLongestBalancedChromosome(String c ,int start,int end){
        int count1=0;
        int count0=0;
        for(int i=start;i<end;i++){
            if(c.charAt(i)=='0'){
                count0++;
            }
            if(c.charAt(i)=='1'){
                count1++;
            }
        }
        if(count0==count1){
            //System.out.print(c.substring(start,end));
            return end-start;
        }

//        return (Math.max(getLongestBalancedChromosome(c,start+1,end),getLongestBalancedChromosome(c,start,end-1)));
        if(getLongestBalancedChromosome(c,start+1,end)>0){
            return getLongestBalancedChromosome(c,start+1,end);
        }
        if(getLongestBalancedChromosome(c,start,end-1)>0){
            return getLongestBalancedChromosome(c,start,end-1);
        }
        return 0;
    }

}
