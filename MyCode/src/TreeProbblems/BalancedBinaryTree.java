package TreeProbblems;

//
//Given a binary tree, determine if it is height-balanced.
//
//        Height-balanced binary tree : is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.
//        Return 0 / 1 ( 0 for false, 1 for true ) for this problem
//
//        Example :
//
//        Input :
//         1
//        / \
//       2   3
//
//        Return : True or 1
//
//        Input 2 :
//        3
//       /
//      2
//     /
//    1
//
//        Return : False or 0
//        Because for the root node, left subtree has depth 2 and right subtree has depth 0.
//        Difference = 2 > 1.

import java.util.ArrayList;

public class BalancedBinaryTree {
    static ArrayList<Integer> l = new ArrayList<>();
    static  ArrayList<Integer> r = new ArrayList<>();
    public static int isBalanced(BalancedTreeNode A) {
      height(A);
      for(int i=0;i<l.size();i++){
          if(Math.abs(l.get(i)-r.get(i))>1){
              return 0;
          }
      }
      return 1;
    }

    public static int height(BalancedTreeNode A){
        if (A == null) {
            return 0;
        }else {
           int lhheigt = 1 + height(A.left);
           int reigt = 1 + height(A.right);
           l.add(lhheigt);
           r.add(reigt);
           return Math.max(lhheigt,reigt);
        }
    }
        public static void main (String[]args){
            UnbalancedTreeNode balancedTreeNode = new UnbalancedTreeNode();
            BalancedTreeNode treeRootNode = UnbalancedTreeNode.getTree();
            int arr = isBalanced(treeRootNode);
            System.out.println(arr);

        }
    }
