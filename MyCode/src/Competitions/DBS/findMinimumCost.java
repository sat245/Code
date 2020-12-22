package Competitions.DBS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by satyam mishra, Data Structure on 12/03/19.
 */
public class findMinimumCost {
    public static void main(String [] args){
        System.out.print(solve(10,2,2,1,5,5,20));
    }
    static  int solve(int S,int cnt1,int cnt2,int cnt3,int cost1,int cost2,int cost3){
        int e1=2,e2=3,e3=5;

        abc x = new abc(cost1,cnt1,2);
        abc y = new abc(cost2,cnt2,3);
        abc z = new abc(cost3,cnt3,5);

        List<abc> list = new ArrayList<>();
        list.add(x);list.add(y);list.add(z);

        Collections.sort(list, new Comparator<abc>() {
            @Override
            public int compare(abc o1, abc o2) {
                return o1.cost-o2.cost;
            }
        });

        x = list.get(0);y=list.get(1);z=list.get(2);
        for(int i =0;i<=z.count;i++){
            for (int j=0;j<=y.count;j++){
                for(int k =0;k<=x.count;k++){
                    int sum = (i*z.energy)+(j*y.energy)+(k*x.energy);

                    if(sum==S){
                        return ((i*z.cost)+(j*y.cost)+(k*x.cost));
                    }
                }
            }
        }
      return -1;
    }


}

class abc {
    int cost;
    int count;
    int energy;

    public abc(int cost, int count, int energy) {
        this.cost = cost;
        this.count = count;
        this.energy = energy;
    }
}
