import java.util.ArrayList;

/**
 * Created by satyam mishra, Data Structure on 01/11/17.
 */
public class AntiDiagonals {
    public static void main (String[] args) {
        int[] multi = new int[]
                {1,2};
        int[] multi1 = new int[]
                {3,4};
        ArrayList a=new ArrayList();ArrayList a2=new ArrayList();
        ArrayList a1=new ArrayList();
        a.add(1);
        a.add(2);
        a.add(3);
        a1.add(4);
        a1.add(5);
        a1.add(6);
        a2.add(7);
        a2.add(8);
        a2.add(9);


        ArrayList<ArrayList<Integer>> b1 = new ArrayList<ArrayList<Integer>>();
        b1.add(a);
        b1.add(a1);
        b1.add(a2);
        b1 = diagonal(b1);
         System.out.println("OK");
                    //code
        }

    public static ArrayList<ArrayList<Integer>> diagonal(ArrayList<ArrayList<Integer>> a) {
        if (a.size() <= 0) {
            return a;
        }
        if (a.size() == 1) {
            return a;
        }
        Integer[][] arr = new Integer[a.size()][a.size()];
        for (int i = 0; i < a.size(); i++) {
            for (int j = 0; j < a.get(0).size(); j++) {
                arr[i][j] = (a.get(i)).get(j);
            }
        }

        ArrayList<ArrayList<Integer>> aa = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < a.size(); i++){
            ArrayList<Integer> bb = new ArrayList<Integer>();

            if (i == 0) {
                bb=new ArrayList<Integer>();
                for (int j = 0; j < a.get(0).size(); j++) {
                    bb=new ArrayList<Integer>();
                    bb.add(arr[i][j]);
                    int l = i;
                    int k = j;
                    while (k - 1 >= 0) {
                        k--;
                        l++;
                        bb.add(arr[l][k]);
                    }
                    aa.add(bb);
                }
            }

        else{
            bb=new ArrayList<Integer>();
                int j = a.get(i).size();
                bb.add(arr[i][j-1]);
                int k = j-1;
            int l = i;
            while ((l + 1) < j && k >= 0) {
                l++;
                k--;
                bb.add(arr[l][k]);


            }
                aa.add(bb);

            }

    }
    return aa;

}

    }

