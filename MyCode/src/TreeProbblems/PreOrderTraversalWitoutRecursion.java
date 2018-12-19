package TreeProbblems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class PreOrderTraversalWitoutRecursion {
    public static void main(String[] args) {
        BalancedTreeNode balancedTreeNode = new BalancedTreeNode().getTree();
        BalancedTreeNode treeRootNode = new BalancedTreeNode().getTree();
        int[] arr = preorderTraversal(treeRootNode);
        System.out.println(arr);

    }

    public static int[] preorderTraversal(BalancedTreeNode A) {
        BalancedTreeNode root=A;
        Stack stack = new Stack();
        ArrayList<Integer> arr = new ArrayList<>();
        Map<BalancedTreeNode,Boolean> map = new HashMap<>();
        int index=0;
        boolean flag=true;
        boolean flag1=false;
        if(A==null){
            return new int[0];
        }
        do{
            if (A != null ) {
                arr.add(A.data);
                stack.push(A);
                A=A.left;
            }else{
                if(!stack.isEmpty())
                A= (BalancedTreeNode) stack.pop();
                if(A!=null){
                    A=A.right;
                }

            }

        }while (!stack.empty() || A!=null);
        int []array = new int[arr.size()];
        for(int i=0;i<arr.size();i++){
            array[i]=arr.get(i);
        }
        return array;
    }
}
