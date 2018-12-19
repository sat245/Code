package TreeProbblems;

import org.omg.CORBA.BAD_CONTEXT;

import java.util.ArrayList;

public class KtSmallestNumber {
    static ArrayList<Integer> arr =  new ArrayList<>();
    public  void fn(BalancedTreeNode root) {
        if(root==null){
            return;
        }
        fn(root.left);
        arr.add(root.data);
        fn(root.right);
    }
    public int kthsmallest(BalancedTreeNode A, int B) {
        fn(A);
        return arr.get(B-1);
    }
}
