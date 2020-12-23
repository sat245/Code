import java.util.Arrays;

/**
 * Created by satyam mishra, Data Structure on 18/06/17.
 */
public class MedianOfsortedArrays {

    public static int fn(Integer [] a,Integer [] b) {
        if(a.length==2){
            return ((Math.max(a[0],b[0]))+Math.min(a[1],b[1]))/2;
        }

        if (a.length == 1)
            return (a[0] + b[0])/2;
        int m1 = median(a);
        int m2 = median (b);
        if(a[m1]==b[m2]) {
            return a[m1];
        }



        if(a[m1]>b[m2]) {

           return fn(Arrays.copyOfRange(a,0,m1+1),Arrays.copyOfRange(b,m2,b.length));
        }
        else {


            return fn(Arrays.copyOfRange(a,m1,a.length),Arrays.copyOfRange(b,0,m2+1));
        }
    }

    public static int median(Integer [] arr) {

        return (arr.length/2);
    }


    public static void main(String [] args) {
       Integer [] arr = {1, 12, 15, 26, 38};
        Integer [] arr1 = {2, 13, 17, 30, 45};

        System.out.println(fn(arr,arr1));

    }


}
