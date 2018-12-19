package TreeProbblems;

public class SymmetricBinaryTree {

    public static int isSymmetric(BalancedTreeNode A) {
        if(A==null){
            return 0;
        }
        if(isSymmetric(A.left,A.right)){
            return 1;
        }
        return 0;
    }

    public static boolean isSymmetric(BalancedTreeNode A,BalancedTreeNode B){

        if(A==null && B==null){
            return true;
        }

        return (A.data==B.data && isSymmetric(A.right,B.left) && isSymmetric(A.left,B.right));
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



        int a = isSymmetric(treeRootNode);

        System.out.println("((()))" + a);
    }
}


