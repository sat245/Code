package Competitions;

import java.util.Scanner;

public class Wisen {
    public static void main(String args[] ) throws Exception {

        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
        char [] arr = s.next().toCharArray();
        int query=s.nextInt();
       s.nextLine();
        while (query>0){
            query--;
            String [] input = s.nextLine().split(" ");
            if(input[0].equals("1")){
              arr =  exchange(arr,input[1],input[2]);
            }else {
                lis(arr);
            }
        }

    }

    private static void lis(char[] arr) {
        int []  count = new int[26];
        count[0]=1;
        for(int i=1;i<arr.length;i++){
            for(int j=0;j<i;j++){
                if(arr[i]>arr[j]){
                    int x = count[j]+1;
                    if(x>count[i]){
                        count[i]=x;
                    }
                }else {
                    count[i]=1;
                }
            }
        }
        int max= Integer.MIN_VALUE;
        for(int i=0;i<count.length;i++){
            if(count[i]>max){
                max=count[i];
            }
        }

        System.out.println(max);
    }

    private static char[] exchange(char[] arr,String s, String s1) {
        int a = Integer.parseInt(s);
        char ch = s1.toCharArray()[0];
        arr[a-1]=ch;
        return arr;
    }
}
