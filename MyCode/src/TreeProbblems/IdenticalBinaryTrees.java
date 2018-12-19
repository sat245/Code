package TreeProbblems;

import com.sun.org.apache.regexp.internal.RE;

import javax.swing.tree.TreeNode;

public class IdenticalBinaryTrees {
    public static int isSameTree(BalancedTreeNode A, BalancedTreeNode B) {
        if(isSame(A,B)){
            return 1;
        }
        return 0;
    }

    public static boolean isSame(BalancedTreeNode A, BalancedTreeNode B) {
        if(A==null && B!=null){
            return false;
        }

        if(A!=null && B==null){
            return false;
        }

        if(A==null && B==null){
            return true;
        }

        boolean l = isSame(A.left,B.left);
        boolean r= isSame(A.right,A.right);

       return ((A.data==B.data) && l && r);

    }

    public static void main(String [] args){
        BalancedTreeNode root = new BalancedTreeNode();
        BalancedTreeNode root1 = new BalancedTreeNode();
        BalancedTreeNode root2 = new BalancedTreeNode();

        root.data=5;
        root.left=root1;
        root.right=root2;

        root1.data=5;
        root2.data=1;





        BalancedTreeNode treeRootNode = new BalancedTreeNode();
        BalancedTreeNode treeRootNode1 = new BalancedTreeNode();

        treeRootNode.left=treeRootNode1;
        treeRootNode.data=3;
        treeRootNode1.data=5;



        boolean a = isSame(treeRootNode,root);

        System.out.println("((()))" + a);
    }
}
