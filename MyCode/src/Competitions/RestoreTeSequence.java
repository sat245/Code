package Competitions;

//Given a sequence of  distinct integers. In each step, a group of zero or more integers (not necessarily contiguous) change their positions. This process is repeated for  times. An integer  moves only once in all the  steps. The original sequence is restored at the beginning of each step.
//
//        Suppose the initial sequence is .
//
//        After step , let's say  moves. So, sequence after first step may be  or some other sequence is also possible e.g. .
//
//        After step , since  has already moved it will not move again. Let's say the group of  and  moves this time. So, the sequence may be  or .
//
//        After step , let's say no one moves. So, our sequence remains .
//
//        Similarly step  and step  can be processed.
//
//        Now, you are given the sequence of integers after each step. Can you restore the original sequence? It is guaranteed that the sequence exists and is unique.
//
//
//        Input Format
//
//        The first line of the input contains a single integer , the number of integers in the sequence.
//        Then  lines follow, the -th line contains  space-separated integers denoting the sequence after -th step.
//
//        Output Format
//
//        Output  space-separated integers representing the original sequence.
//
//        Constraints
//
//
//        Sample Input
//        6
//        2 3 1 6 4 7
//        2 1 6 3 4 7
//        7 4 2 3 6 1
//        2 3 6 1 4 7
//        3 6 1 4 2 7
//        Sample Output
//        2 3 6 1 4 7
//        Explanation
//        The original sequence is . The movements are as follows:
//
//        :  moves
//
//        :  and  moves
//
//        :  and  moves
//
//        : no movement
//
//        :  moves


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RestoreTeSequence {
    public static void main(String args[] ) throws Exception {

        //Scanner
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        List<Integer> a1 = new ArrayList<>();

        int count = 0;
        while (n>count){
           count++;
            a1.add(s.nextInt());
        }

        List<Integer> a2 = new ArrayList<>();
         count = 0;
        while (n>count){
            count++;
            a2.add(s.nextInt());
        }

        List<Integer> a3 = new ArrayList<>();
         count = 0;
        while (n>count){
            count++;
            a3.add(s.nextInt());
        }

        List<Integer> a4 = new ArrayList<>();
         count = 0;
        while (n>count){
            count++;
            a4.add(s.nextInt());
        }

        List<Integer> a5 = new ArrayList<>();
        count = 0;
        while (n>count){
            count++;
            a5.add(s.nextInt());
        }
        List<Integer> result = new ArrayList<>();

        for(int i=0;i<n;i++){
            int [] arr = new int[10];
            arr[a1.get(i)]++;
            arr[a2.get(i)]++;
            arr[a3.get(i)]++;
            arr[a4.get(i)]++;
            arr[a5.get(i)]++;


            int max = Integer.MIN_VALUE;
            int index=0;
            for(int j =0;j<arr.length;j++)
            {
                if(arr[j]>max){
                    max =arr[j];
                    index = j;
                }
            }
            result.add(index);
        }
        for(int i=0;i<result.size();i++){
            System.out.print(result.get(i)+" ");
        }
    }

}
