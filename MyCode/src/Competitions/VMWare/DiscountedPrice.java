package Competitions.VMWare;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiscountedPrice {


    public static void finalPrice(List<Integer> prices) {
        // Write your code here

            int len = prices.size();

            if(len==0){
                System.out.println(0);
                return;
            }

            int [] list = new int[len];
            for (int i = len-1;i>=0;i--){
                int j = i;
                if(i==len-1){
                    list[i] = prices.get(i);
                    continue;
                }

                if(prices.get(i)>=prices.get(i+1)){
                    list[i] =prices.get(i)-prices.get(i+1);
                }else {
                    while (j<len-1){
                        if(prices.get(i)>=prices.get(j+1)){
                            list[i] =prices.get(i)-prices.get(j+1);
                            break;
                        }
                        if(prices.get(i)>=(prices.get(j+1)-list[j+1])){
                            list[i] =prices.get(i)-(prices.get(j+1)-list[j+1]);
                            break;
                        }
                        j++;
                    }
                    if(j==len-1){
                        list[i] =prices.get(i) ;
                    }
                }
            }
            int sum=0;
            for(int i=0;i<len;i++) {
                sum = sum + list[i];
            }

        System.out.print(sum);
        System.out.println();
                for(int i=0;i<len;i++){
                if(list[i]==prices.get(i)){
                    System.out.print(prices.get(i)+" ");
                }
            }
    }

    public static void main (String [] args){
        List<Integer> list = new ArrayList();

        Integer [] arr = {5,1,3,4,6,2};
        list.add(5);list.add(1);list.add(3);list.add(4);list.add(6);list.add(2);

        finalPrice(list);
    }
}
