package Competitions;
// image of question is attached
import java.util.Scanner;

public class BeautifulNumbers {
    static int [] store =new int[]{0, 1, 1, 2, 1, 2, 2,
            3, 1, 2, 2, 3, 2, 3, 3, 4};

    public static  int beauty(long num){
        long x = 0;
        if (num==0)
            return store[0];
        x = num & 0xf;
        return store[(int) x] +
                beauty(num >> 4);
    }

    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t>0){
            t--;
            long n = s.nextLong();

            int sum = 0;
            int count = 1;
            while (sum<=n){
                sum = sum+beauty(count);
                count++;
                if(sum==n){
                    break;
                }
            }
            System.out.println(count-1);
        }
    }
}
