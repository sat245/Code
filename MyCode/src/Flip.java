import java.util.ArrayList;

/**
 * Created by satyam mishra, Data Structure on 29/06/17.
 */
public class Flip {
    public static ArrayList<Integer> flip(String A) {
        char [] arr = A.toCharArray();
        int count0 = 0 , count1 = 0;

        int left =0,l=-1,r=-1; int righ =arr.length-1;count0 = 0;count1=0;

       while(left<=righ) {
            if(arr[left] == '0') {
                count0 ++;
                l = left;
            }
            if(arr[righ] == '0' && left!=righ) {
                count0++;
                r=righ;
            }

            if(count0>0) {
                if(arr[left] == '1') {
                    count1 ++;
                }
                if(arr[righ] == '1' && left!=righ) {
                    count1++;
                }
            }
            if(count0==count1) {
                count0=0;
                count1=0;
                l=-1;
                r=-1;
            }
           left++;
           righ--;

        }

        ArrayList arr1 = new ArrayList();
        arr1.add(l);
        arr1.add(r);

        return arr1;
    }

    public static void main(String [] args) {
        String str = "01001010110000";
        System.out.println(flip(str));
    }

}
