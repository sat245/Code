package Practise;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class TestClass1 {
    public static void main(String args[] ) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int L[] = new int[N];
        int R[] = new int[N];
        for (int i = 0; i < N; i++) {
            StringTokenizer tk = new StringTokenizer(br.readLine());
            L[i] = Integer.parseInt(tk.nextToken());
            R[i] = Integer.parseInt(tk.nextToken());
        }
        align_rectangles(N , L , R);
        for(int i = 0; i < N; i++) {
            System.out.println(L[i] + " " + R[i]);
        }
    }
    public static void align_rectangles(int N,int L[],int R[]){
        //Not that you neeed to update the arrays L and R as per the new aligned order
        if (N<=1){
            return;
        }
        ArrayList<xy> arr = new ArrayList<>(N);
            for(int i=0;i<N;i++){
                xy obj = new xy();
                obj.l=L[i];obj.w=R[i];obj.area=L[i]*R[i];

                arr.add(obj);
            }
        Collections.sort(arr, new Comparator<xy>() {
            @Override
            public int compare(xy o1, xy o2) {
                return o1.l-o2.l;
            }
        });
        for(int i=0;i<N;i++){
            int start=0;int end=0;
            if(i+1<N && arr.get(i).l==arr.get(i+1).l){
                start = i;
                end=i+1;
                while (end<N && arr.get(start).l==arr.get(end).l) {
                    end++;
                }
                Collections.sort(arr.subList(start, end-1), new Comparator<xy>() {
                    @Override
                    public int compare(xy o1, xy o2) {
                        return  o2.w-o1.w;
                    }
                });
            }
            L[i]=arr.get(i).l;
            R[i]=arr.get(i).w;
        }
    }


}

class xy{
     int l;
     int w;
     int area;

}
