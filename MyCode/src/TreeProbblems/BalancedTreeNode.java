package TreeProbblems;

class BalancedTreeNode implements TreeRootNode{
      int data;
      BalancedTreeNode left;
      BalancedTreeNode right;

//      BalancedTreeNode(int x) {
//       val = x;
//      left=null;
//      right=null;
//     }
    @Override
    public  BalancedTreeNode getTree(){
        BalancedTreeNode node = new BalancedTreeNode();
        node.data=4;

        BalancedTreeNode node1 = new BalancedTreeNode();
        node1.data=2;

        BalancedTreeNode node2 = new BalancedTreeNode();
        node2.data=6;

        BalancedTreeNode node3 = new BalancedTreeNode();
        node3.data=11;

        BalancedTreeNode node4 = new BalancedTreeNode();
        node4.data=3;

        BalancedTreeNode node5 = new BalancedTreeNode();
        node5.data=5;

        BalancedTreeNode node6 = new BalancedTreeNode();
        node6.data=7;

        node.left=node1;
        node.right=node2;

        node1.left=node3;
        node1.right=node4;

        node2.left=node5;
        node2.right=node6;


        node3.left=null;
        node3.right=null;
        node4.left=null;
        node4.right=null;
        node5.left=null;
        node5.right=null;
        node6.left=null;
        node6.right=null;

        return node;

    }
 }