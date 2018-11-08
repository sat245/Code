package TreeProbblems;

public class UnbalancedTreeNode implements TreeRootNode{
    int data;
    BalancedTreeNode left;
    BalancedTreeNode right;


    @Override
    public TreeRootNode getTree() {
        BalancedTreeNode treeRootNode = new BalancedTreeNode();
        BalancedTreeNode root = treeRootNode.getTree();

        BalancedTreeNode node11 = new BalancedTreeNode();
        node11.data=11;

        BalancedTreeNode node12 = new BalancedTreeNode();
        node12.data=12;

        BalancedTreeNode node13 = new BalancedTreeNode();
        node13.data=12;

        node11.left=node12;
        node11.right=node13;

        root.left.left.right=node11;

        return root;

    }
}
