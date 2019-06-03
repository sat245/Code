package Competitions.LendingCart;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProfitSort {

    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        List<Integer> list = new ArrayList<>(n);
        while (n>0){
            n--;
            list.add(scan.nextInt());
        }

        int q = scan.nextInt();
        while (q>0){
            q--;

            int l = scan.nextInt();
            int r = scan.nextInt();
            int count =0;
            for(int i=0;i<list.size();i++){
                int num = list.get(i);

                if(num>=l && num<=r){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
