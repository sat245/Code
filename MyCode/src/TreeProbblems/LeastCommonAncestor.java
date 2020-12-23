package TreeProbblems;

import java.util.Stack;

public class LeastCommonAncestor {

   static  Stack stacka = new Stack();
   static  Stack stackb = new Stack();
   static BalancedTreeNode result = null;
   static int q=-1;

    public static boolean preOrder(BalancedTreeNode root,int a,boolean flag,Stack stack){
        if(root == null){
            return false;
        }

        if(root.data==a){
            stack.push(root);
            return true;
        }



        if(flag)
        stack.push(root);
        boolean left = preOrder(root.left,a,flag,stack);
        if(left){
            flag=false;
        }
        boolean right = preOrder(root.right,a,flag,stack);
        if(right){
            flag=false;
        }
        return left || right;
    }

    public static int fn(int a,int b,Stack x,Stack y){
        Stack stack;
        if(x.size()>y.size()){
            stack = y;
            b=a;

        }else {
            stack =x;
        }
        if(stack.isEmpty()){
            return -1;
        }

        while(!stack.isEmpty()){
            result = (BalancedTreeNode) stack.pop();
            boolean x1 = preOrder(result,b,false,stack);
            if(x1){
                return result.data;
            }

        }

        return -1;
    }

    public static int lca(BalancedTreeNode A, int B, int C) {
        int a=-1;
       boolean first =  preOrder(A,B,true,stacka);
        boolean second = preOrder(A,C,true,stackb);
        if(first && second) {
            a = fn(B, C, stacka, stackb);
        }
        return a;

    }

    public static void main (String [] args){
        BalancedTreeNode balancedTreeNode = new BalancedTreeNode().getTree();
        System.out.println(lca(balancedTreeNode,32,24));


        System.out.println("((())))");

    }
}
