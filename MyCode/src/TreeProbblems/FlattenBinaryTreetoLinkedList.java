//package TreeProbblems;
//
//public class FlattenBinaryTreetoLinkedList {
//    BalancedTreeNode newRoot=null;
//    public  void fn(BalancedTreeNode root){
//       if(root.left==null){
//           newRoot = root;
//
//           return;
//       }
//
//        if(root.right==null){
//            return;
//        }
//
//        if(root==null){
//            return;
//        }
//
//        fn(root.left);
//        BalancedTreeNode temp = root.right;
//        root.right = root.left;
//        root.left=null;
//        newRoot.right= temp;
//        fn(newRoot.right);
//
//
//        }
//
//
//
//
//    public static void main(String [] args){
//        BalancedTreeNode root = new BalancedTreeNode().getTree();
//        fn(root);
//        System.out.println("(((())))");
//    }
//
//    public BalancedTreeNode flatten(BalancedTreeNode a) {
//        fn(a);
//        return a;
//    }
//}
