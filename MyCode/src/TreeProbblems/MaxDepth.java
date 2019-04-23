package TreeProbblems;

public class MaxDepth {
    public static void main(String [] args){
        BalancedTreeNode treeRootNode = new BalancedTreeNode();
        BalancedTreeNode treeRootNode1 = new BalancedTreeNode();
        BalancedTreeNode treeRootNode2 = new BalancedTreeNode();

        treeRootNode.data=1;
        treeRootNode1.data=2;
        treeRootNode2.data=3;
        treeRootNode.left=treeRootNode1;
        treeRootNode1.right=treeRootNode2;

        System.out.println("((()))"+MaxDepth.depth(treeRootNode));
    }

    private static int depth(BalancedTreeNode root) {

        if(root==null){
            return 0;
        }
        else {
            int ld = 1 + depth(root.left);
            int rd = 1+ depth(root.right);
            return Math.max(ld,rd);
        }
    }

}
