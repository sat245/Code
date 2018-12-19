package TreeProbblems;


import java.util.ArrayList;
import java.util.Stack;

//Given binary tree
//
//        1
//        \
//        2
//        /
//        3
//        return [1,3,2].
public class InorderTraversalWithoutRecursion {
    public static int[] inorderTraversal(BalancedTreeNode A) {
        Stack stack = new Stack();
        ArrayList<Integer> arr = new ArrayList<>();
        int index=0;
        boolean flag=true;
        if(A==null){
            return new int[0];
        }
        do{
            if (A!=null && flag) {
                stack.push(A);
                A=A.left;
                flag=true;
            }else {
                A = (BalancedTreeNode) stack.pop();
              arr.add(A.data);

                if(A.right!=null){
                    A = A.right;
                    flag=true;
                }else{
                 //   A = (BalancedTreeNode) stack.pop();
                    flag=false;
                }

            }
        }while (!stack.empty() || flag);
        int []array = new int[arr.size()];
        for(int i=0;i<arr.size();i++){
            array[i]=arr.get(i);
        }
        return array;
}

public static void main(String [] args){
        BalancedTreeNode balancedTreeNode = new BalancedTreeNode().getTree();
        BalancedTreeNode treeRootNode = new BalancedTreeNode().getTree();
        int [] arr = inorderTraversal(treeRootNode);
        System.out.println(arr);

}
}
