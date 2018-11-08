//public class solution {
//
//    public static String[] permutationOfString(String input){
//        if(input.length() == 0){
//            String output[] = {""};
//            return output;
//        }
//        String[] smallerOutput = permutationOfString(input.substring(1));
//
//        String output[] = new String[input.length()*smallerOutput.length];
//
//        int k =0;
//        for(int i = 0; i < smallerOutput.length; i++){
//            String currentString = smallerOutput[i];
//            for(int j = 0; j <= currentString.length(); j++){
//                output[k] = currentString.substring(0, j) + input.charAt(0) + currentString.substring(j);
//                k++;
//            }
//        }
//        return output;
//    }
//
//    public static void main(String [] args) {
//        String [] arr = permutationOfString("ABCD");
//        for (int i=0;i<arr.length;i++){
//            System.out.println(arr[i]);
//        }
//    }
//
//}

import java.util.Scanner;

public class solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int arr_i=0; arr_i < 6; arr_i++) {
            for (int arr_j = 0; arr_j < 6; arr_j++) {
                arr[arr_i][arr_j] = in.nextInt();
            }
        }

            for(int i =0;i<6;i++){
                for(int j=0;j<6;j++) {
                    System.out.print(arr[i][j]);
                }
                System.out.println();
            }

            long sum = 0;long maxsum=-Integer.MAX_VALUE;
            for(int i = 0; i<=3;i++) {
                for(int j = 0; j<=3 ; j++) {
                    sum = sum + arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
                    if(maxsum<sum){
                        maxsum=sum;
                    }
                    sum=0;
                }
            }
            System.out.print(maxsum);
        }
    }

