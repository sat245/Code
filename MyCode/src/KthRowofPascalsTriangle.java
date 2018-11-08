import java.util.ArrayList;

/**
 * Created by i318862 on 01/11/17.
 */
public class KthRowofPascalsTriangle {

    public static void main(String [] args) {
       ArrayList<Integer> aaaa =  getRow(2);
        for(int i = 0;i<aaaa.size();i++) {
            System.out.print(aaaa.get(i)+" ");
        }
    }
    public static ArrayList<Integer> getRow(int a) {
        ArrayList<Integer> aa = new ArrayList<Integer>();
        int k=a;
        if(k>=0) {
            ArrayList<Integer> qq = new ArrayList<Integer>();
            qq.add(1);
            if(k==0) {
                return qq;
            }
            int[][] array = new int[a+1][a+1];
            array[0][0] = 1;
            for (int i = 1; i <=a; i++) {
                array[i][0] = 1;
            }


            for (int i = 1; i <=a; i++) {
                aa.add(array[i][0]);
                for (int j = 1; j < i + 1; j++) {
                    int count1 = 1;
                    int count2 = 1;
                    if ((i - 1) >= 0) {
                        count1 = array[i - 1][j];
                        if ((j - 1) >= 0) {
                            count2 = array[i - 1][j - 1];
                        }
                    }
                    array[i][j] = count1 + count2;
                        aa.add(count1 + count2);
                    }
                if(i==k) {
                    return aa;
                }
                aa.clear();

            }
//            for (int i = 0; i < a; i++) {
//                for (int j = 0; j < a; j++) {
//                    System.out.print(" " + array[i][j]);
//                }
//
//                System.out.println("");
//            }

        }
        return aa;
    }

}
