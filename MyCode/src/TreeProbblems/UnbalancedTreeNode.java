package TreeProbblems;

public class UnbalancedTreeNode {
    int data;
    BalancedTreeNode left;
    BalancedTreeNode right;


    public static BalancedTreeNode getTree() {
       // BalancedTreeNode treeRootNode = new BalancedTreeNode();
      //  BalancedTreeNode root = treeRootNode.getTree();

        BalancedTreeNode node11 = new BalancedTreeNode();
        node11.data=11;

        BalancedTreeNode node12 = new BalancedTreeNode();
        node12.data=12;

        BalancedTreeNode node13 = new BalancedTreeNode();
        node13.data=13;

        node11.left=null;
       // node12.left=node13;
        node11.right=node12;
        node12.right = node13;

     //   root.left.left.right=node11;

        return node11;

    }
}
