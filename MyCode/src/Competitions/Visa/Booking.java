package Competitions.Visa;

import java.util.*;

public class Booking {

    static List<Integer> sort_hotels(String keywords, List<Integer> hotel_ids, List<String> reviews) {

        String [] str = keywords.split(" ");
        Map<Integer,Integer> map = new HashMap();

        for(int i=0;i<hotel_ids.size();i++) {
            String review  = reviews.get(i);
            int id = hotel_ids.get(i);
            int count =0;

            for(int j=0;j<str.length;j++){
                String review1=review;
                String kewworfd = str[j];

                int index = -1;
                index = review1.indexOf(kewworfd);
                if(index>=0){
                    count++;
                    while (index>=0) {
                        review1 = review1.substring(index + 1);
                        index = review1.indexOf(kewworfd);
                        if(index>=0) {
                            count++;
                        }

                    }

                }
            }
            if(map.containsKey(id)){
                map.put(id,map.get(id)+count);
            }else {
                map.put(id,count);
            }
        }

        List<Map.Entry<Integer, Integer> > list = new LinkedList<Map.Entry<Integer, Integer>>(map.entrySet());
        // Sort the list
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer> >() {
            public int compare(Map.Entry<Integer, Integer> o1,
                               Map.Entry<Integer, Integer> o2)
            {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });

        List<Integer> result = new ArrayList<>();
        for (Map.Entry<Integer, Integer> aa : list) {
            result.add(aa.getKey());
        }
            return result;
        }

        public static void main(String [] args){

        }
}
