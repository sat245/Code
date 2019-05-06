package Competitions.Visa;

import java.util.ArrayList;
import java.util.List;

public class QueryString {


    public static List<Integer> findCompletePrefixes(List<String> names, List<String> query) {
        // Write your code here

        int count = 0;
        List<Integer> counter = new ArrayList<>();
        for(int i=0;i<query.size();i++){
            count=0;
            String s2=query.get(i);
            for(int j =0;j<names.size();j++){
                String s1 = names.get(j);
                if(s1.contains(s2) && s1.length()>s2.length()){
                    count++;
                }
            }
            counter.add(count);


        }

        return counter;
    }

    public static void main(String [] args ){
        List<String > names = new ArrayList<>();
        names.add("jackson");names.add("jack");
        List<String > query = new ArrayList<>();
        query.add("jack");

        List<Integer> res = findCompletePrefixes(names,query);

        for(int i=0;i<res.size();i++){
            System.out.println(res.get(i));
        }

    }

}
