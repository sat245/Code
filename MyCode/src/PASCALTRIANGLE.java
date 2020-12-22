import java.util.ArrayList;

/**
 * Created by satyam mishra, Data Structure on 01/11/17.
 */
public class PASCALTRIANGLE {
//    public static void main(String [] args) {
//        generate(5);
//    }
//
//    public static ArrayList<ArrayList<Integer>> generate(int a) {
//        ArrayList<ArrayList<Integer>> bb= new ArrayList<ArrayList<Integer>>();
//        if(a>0) {
//            ArrayList<Integer> qq = new ArrayList<Integer>();
//            qq.add(1);
//            bb.add(qq);
//
//            int[][] array = new int[a][a];
//            array[0][0] = 1;
//            for (int i = 1; i < a; i++) {
//                array[i][0] = 1;
//            }
//
//
//            for (int i = 1; i < a; i++) {
//                ArrayList<Integer> aa = new ArrayList<Integer>();
//                aa.add(array[i][0]);
//                for (int j = 1; j < i + 1; j++) {
//                    int count1 = 1;
//                    int count2 = 1;
//                    if ((i - 1) >= 0) {
//                        count1 = array[i - 1][j];
//                        if ((j - 1) >= 0) {
//                            count2 = array[i - 1][j - 1];
//                        }
//                    }
//                    array[i][j] = count1 + count2;
//                    if(i==k){
//                    aa.add(count1 + count2);
//                }
//
//                bb.add(aa);
//
//            }
////            for (int i = 0; i < a; i++) {
////                for (int j = 0; j < a; j++) {
////                    System.out.print(" " + array[i][j]);
////                }
////
////                System.out.println("");
////            }
//
//        }
//        return bb;
//}
}
