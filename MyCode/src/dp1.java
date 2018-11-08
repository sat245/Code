/**
 * Created by i318862 on 12/06/17.
 * n-->1
 */
public class dp1 {
   static int r=0;
    static int [] arr = new int[10];
    public static int fn(int n) {

        if (n == 1) return 0;
        if (n == 2) return 1;
        if (n == 3) return 1;
        if(arr[n]!=-1) return arr[n];
        r = 1 + fn(n - 1);

        if (n % 2 == 0) {
            r = Math.min(r, 1 + fn((n / 2)));
        }
        if (n % 3 == 0) {
            r = Math.min(r, 1 + fn((n / 3)));
        }

        arr[n]=r;
        return r;
    }

    public static void main(String [] args) {
        arr[0]=-1;
        arr[1]=0;
        arr[2]=1;
        arr[3]=1;
        arr[4]=-1;
        arr[5]=-1;
        arr[6]=-1;
        arr[7]=-1;
        arr[8]=-1;
        arr[9]=-1;

        System.out.print(fn(6) +"***");
    }
}
