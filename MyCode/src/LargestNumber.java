import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 * Created by i318862 on 04/11/17.
 */
public class LargestNumber {
    public static void main(String [] args) {

        Scanner scan = new Scanner(System.in);
        int test  = (scan.hasNext())?scan.nextInt():0;
        while(test>0) {
            test--;
            int n = (scan.hasNext())?scan.nextInt():0;
            List <Integer>array = new ArrayList<Integer>();
            for(int i=0;i<n;i++) {
                if(scan.hasNext()){
                    array.add( scan.nextInt());
                }
            }
            System.out.print(largestNumber(array));
        }
//       List<Integer> list = new ArrayList<>();
//        list.add(11);
//        list.add(1210);
//        list.add(0);
//        list.add(0);
//        list.add(9);
    }
    public static String largestNumber(final List<Integer> a) {
         Collections.sort(a, new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    if(o1.toString().length()==o2.toString().length()) {
                        return o2-o1;
                    }else {
                        String  aa=o1.toString()+o2.toString();
                        String bb= o2.toString()+o1.toString();
                         if(Long.parseLong(bb)>
                                Long.parseLong(aa))
                             return 1;
                        else
                             return -1;

                    }

                }
            });
        String str  = "";
        for(int i=0;i<a.size();i++) {
            if(str.equalsIgnoreCase("") && a.get(i)==0)
                continue;
           str=str+a.get(i).toString();
        }
        if(str=="")
            return "0";
        return str;
    }
}
