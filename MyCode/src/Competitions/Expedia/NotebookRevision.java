package Competitions.Expedia;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
// got 75/100 in it
public class NotebookRevision {
    public static void main(String args[] ) throws Exception {

        Scanner s = new Scanner(System.in);
        int page = s.nextInt();
        List<Long> difficulty = new ArrayList<>(page);

        while (page>0){
            page--;
            difficulty.add(s.nextLong());

        }

        long k = s.nextLong();
        int [] arr = new int[difficulty.size()];
        for (int i = difficulty.size()-1;i>=0;i--){
            long temp = (difficulty.get(i)/k);

            for(int j = i-1;j>=0;j--){
                if(temp>=difficulty.get(j) && arr[j]<=arr[i]){
                    arr[j]=arr[i]+1;
                }
            }
        }
        int max=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }

        System.out.println(max+1);

    }
}
