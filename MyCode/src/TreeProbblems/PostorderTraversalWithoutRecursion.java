package TreeProbblems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class PostorderTraversalWithoutRecursion {

    public static void main(String [] args){
        BalancedTreeNode balancedTreeNode = new BalancedTreeNode().getTree();
        BalancedTreeNode treeRootNode = new BalancedTreeNode().getTree();
        int [] arr = postorderTraversal(treeRootNode);
        System.out.println(arr);

    }

    public static int[] postorderTraversal(BalancedTreeNode A) {
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
            if(A!=null && !map.containsKey(A)){
                stack.push(A);
                map.put(A,true);
                A=A.left;
                flag=false;
                }else
                if(A!=null && A.right!=null && !map.containsKey(A.right)){
                    stack.push(A);
                    //stack.push(A.right);
                    map.put(A,true);
                    A = A.right;
                    flag=false;
            }

            else {
                    if (A != null)
                        arr.add(A.data);
                    if(stack.isEmpty() && A==root){
                        flag=false;
                    }else {
                        A = (BalancedTreeNode) stack.pop();
                        flag = true;
                    }
                }

                }while (!stack.empty() || flag);
        int []array = new int[arr.size()];
        for(int i=0;i<arr.size();i++){
            array[i]=arr.get(i);
        }
        return array;
    }

}
