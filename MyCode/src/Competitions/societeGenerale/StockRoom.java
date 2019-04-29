package Competitions.societeGenerale;


import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Stockroom
{
    public static void main (String[] args) throws java.lang.Exception
    {
       Scanner scan = new Scanner(System.in);
       int test = scan.nextInt();
       while (test>0){
           test--;
           String n1 = scan.next();
           int n=0;
           if(n1!=null){
               n= Integer.parseInt(n1);
           }

           String [] str=null;
           Map<String,Integer> map = new HashMap<>(n);
           while(n>=0){
               n--;
                str = scan.nextLine().split(" ");
                if(str.length==2 && str[0].equals("top")){
                    int topLimit = Integer.parseInt(str[1]);

                    fn(map,topLimit);
                    System.out.println();
                } else {
                    if (map.containsKey(str[0])) {
                        map.put(str[0], map.get(str[0]) + 1);
                    } else if(str[0]!=null && !str[0].equals("")){
                        map.put(str[0], 1);
                    }
                }
           }


       }
    }

    public static void fn(Map<String,Integer> map,int topLimit){
        List<Map.Entry<String, Integer> > list =
                new LinkedList<Map.Entry<String, Integer> >(map.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getKey().compareTo(o2.getKey());
            }
        });

        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        Map<String,Integer> temp = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        int count = 0;
        for(Map.Entry<String,Integer> obj:temp.entrySet()){
            count++;
            if (count<=topLimit && count<=map.size()) {
                System.out.print(obj.getKey()+" ");
            }else {
                break;
            }
        }
    }
}
