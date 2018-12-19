package Competitions;

import java.util.ArrayList;
import java.util.Scanner;

//
//Valid Chess Board
//        You are given a tiled chart paper of  rows and  columns. There are a total of  tiles in it. Each tile is colored either black or white. Now, you need to count how many ways are there to cut valid chessboards of size  out of this chart paper.
//
//        Notes
//
//        . One chessboard is different from another if either of them contains at least one tile which is different from another chessboard.
//        . The chess board formation should have distinct colors of adjacent cells i.e. BlackWhite alternative (regular chessboard rules apply).
//
//        Input Format
//
//        The first line contains two space-separated integers  and  as input.
//        In the next  lines, you are given a string of  characters. Each character is either  or . If it is  then the tile color is white, if it is then the tile color is black.
//
//        Output Format
//
//        In the output, you need to print an integer that denotes the required count as stated in the problem statement.
//
//        Constraints
//
//
//        Sample Input
//        9 9
//        010101010
//        101010101
//        010101010
//        101010101
//        010101010
//        101010101
//        010101010
//        101010101
//        010101010
//        Sample Output
//        4
//        Explanation
//        There are four ways to cut the chessboard out of the given chart paper.
//
//
//
//
//
//        Note: Your code should be able to convert the sample input into the sample output. However, this is not enough to pass the challenge, because the code will be run on multiple test cases. Therefore, your code must solve this problem statement.
//
public class ChessBoard {
    public static void main(String args[] ) throws Exception {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();

        ArrayList<String []> arr1 = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
           String str = s.next();
            String [] arr = str.split("(?!^)");
            arr1.add(arr);
        }
        if(n<8 ||  m<8 ){
            System.out.println(0);
            return;
        }

        int count=0;
        for (int i = 0; i <= n - 8; i++) {
            for (int j = 0; j <= m - 8; j++) {
                boolean ifCess = fn(arr1,i,j);
                if(ifCess){
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    private static boolean fn( ArrayList<String []> arr1, int i, int j) {
        for(int row =i;row<i+7;row++){
            String [] arr = arr1.get(row);
            String [] arrnext = arr1.get(row+1);
            int col = j;
            for(;col<j+7;col++){
               String ch = arr[col];String ch1 = arr[col+1];
               String c2 = arrnext[col];

                if(ch.equals(ch1) || ch.equals(c2)){
                    return false;
                }
            }
            String ch = arr[col];
            String c2 = arrnext[col];

            if(ch.equals(c2)){
                return false;
            }

        }
        return true;
    }
}
