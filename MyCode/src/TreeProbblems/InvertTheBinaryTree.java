package TreeProbblems;


public class InvertTheBinaryTree {

    public static   void invertTree1(BalancedTreeNode A) {
        if(A==null)return ;

        BalancedTreeNode temp = A.left;
        A.left = A.right;
        A.right = temp;

        invertTree(A.left);
        invertTree(A.right);

    }

    public static  BalancedTreeNode invertTree(BalancedTreeNode A) {
        invertTree1(A);
        return A;
    }

    public static void main(String [] args){
        BalancedTreeNode balancedTreeNode = new BalancedTreeNode().getTree();
       balancedTreeNode= invertTree(balancedTreeNode);
       System.out.println("(((((0)))))))");
    }
}
