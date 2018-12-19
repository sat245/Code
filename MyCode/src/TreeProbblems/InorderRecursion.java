package TreeProbblems;

public class InorderRecursion {
    public static void main(String[] args) {
        BalancedTreeNode balancedTreeNode = new BalancedTreeNode().getTree();
         inorderTraversal(balancedTreeNode);
        System.out.println("####");
    }

    public static void  inorderTraversal(BalancedTreeNode root){

        if(root==null){
            return;
        }else {
                inorderTraversal(root.left);
                 System.out.println(root.data);{
                inorderTraversal(root.right);
            }
        }
    }

}
