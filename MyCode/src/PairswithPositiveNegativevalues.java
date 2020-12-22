import java.util.Scanner;

/**
 * Created by satyam mishra, Data Structure on 28/10/17.
 */
public class PairswithPositiveNegativevalues {
    public static void main (String[] args) {
        //code
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            t--;

            int n = sc.nextInt();

            int [] arr = new int[n];

            for(int i = 0;i<n;i++){
                arr[i]=sc.nextInt();
            }
                fn(arr,n);
            System.out.println();
        }
    }

    private static void fn(int[] arr, int n) {
        int [] pos = new int[1000];
        int [] neg = new int[1000];
        int count = 0;

        for(int i=0;i<n;i++){
            int num = arr[i];
            if(num>0){
                pos[num] = 1;

                if(neg[num]==1) {
                    pos[num] = 2;
                    count++;
                }


            }
            if(num<0) {
                neg[Math.abs(num)] = 1;
                if(pos[Math.abs(num)]==1 && neg[Math.abs(num)]==1) {
                    pos[Math.abs(num)]=2;
                    count++;
                }



            }
        }

        if(count==0){
            System.out.print(0);
        } else {
            for(int i =0;i<1000;i++){
                if(pos[i]==2){
                    System.out.print(-1*i+" ");
                    System.out.print(i);
                    System.out.print(" ");
                }
            }
        }
    }
}
