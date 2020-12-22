package StringProblems;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by satyam mishra, Data Structure on 10/01/18.
 */
public class Numrage {
    public static void main(String [] args){
        Integer [] arr={ 80, 97, 78, 45, 23, 38, 38, 93, 83, 16, 91, 69, 18, 82, 60, 50, 61, 70, 15, 6, 52, 90 };
        Integer [] arr1={ 76, 22, 81, 77, 95, 23, 27, 35, 24, 38, 15, 90, 19, 46, 53, 6, 77, 96, 100, 85, 43, 16, 73, 18, 7, 66  };


        ArrayList<Integer> B=new ArrayList<Integer>(Arrays.asList(arr1));
        ArrayList<Integer> A=new ArrayList<Integer>();

        A.add(10);
        A.add(5);
        A.add(1);
        A.add(0);
        A.add(2);
        System.out.print(numRange(B,98,290));
    }
    public static int numRange(ArrayList<Integer> A, int B, int C) {
        int sum=0,k=0,count=0;
        for(int i=0;i<A.size();i++){

            if(A.get(i)>C){
                continue;
            }
            k=i;
            while (sum<B && k<A.size()) {
                sum=sum+A.get(k);
                k++;
            }

            while (sum>=B && sum<=C && k<=A.size()){
                if(k<A.size())
                sum=sum+A.get(k);
                k++;

                count++;
            }

            sum=0;
            k=i;

        }
        return count;
    }
}
