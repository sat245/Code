package Competitions.Visa;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CustomerServiceCapacity {
    static int howManyAgentsToAdd(int noOfCurrentAgents, List<List<Integer>> callsTimes) {

        Collections.sort(callsTimes, new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> o1, List<Integer> o2) {
                return o1.get(0).compareTo(o2.get(0));
            }
        });
        int count=0;
        for(int i=1;i<callsTimes.size();i++){
            for(int j=0;j<i;j++) {
                if (callsTimes.get(i).get(0) > callsTimes.get(j).get(1)) {
                    callsTimes.get(j).add(1,callsTimes.get(i).get(1));
                    continue;
                } else {
                    count++;
                }
            }
        }

        if(count>noOfCurrentAgents){
            return count-noOfCurrentAgents;
        }
        return 0;
    }

}
