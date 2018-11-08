package TreeProbblems;

public class MaxDepth {
    public static void main(String [] args){
        TreeRootNode treeRootNode = new BalancedTreeNode();
        TreeRootNode root = treeRootNode.getTree();
        System.out.println("((()))"+MaxDepth.depth(root));
    }

    private static int depth(TreeRootNode root) {

        if(root==null){
            return 0;
        }
        else {
            int ld = 1 + depth(root.left);
            int rd = 1+ depth(root.right);
            //System.out.println(root.data+"  ld "+ld+"  rd "+rd);
            return Math.max(ld,rd);
        }
    }

}
