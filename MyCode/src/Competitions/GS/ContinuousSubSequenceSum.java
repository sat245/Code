package Competitions.GS;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContinuousSubSequenceSum {
    static int countSubSequence(List<Integer> inputSeq, int targetSum) {
        int count=0;
        for(int i=0;i<inputSeq.size();i++){
            int sum = 0;
            for(int j=i;j<inputSeq.size();j++){
                sum = sum+inputSeq.get(j);
                if(sum==targetSum){
                    count++;
                }
                if(sum>targetSum){
                    break;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        List<Integer> list = new ArrayList();
        while(a>0){
            a--;
            list.add(scan.nextInt());

        }
        int target = scan.nextInt();

        System.out.println(countSubSequence(list,target));
    }
}
