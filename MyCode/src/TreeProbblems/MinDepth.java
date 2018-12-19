package TreeProbblems;

public class MinDepth {

     public static void main(String [] args){
            BalancedTreeNode treeRootNode = new BalancedTreeNode();
            BalancedTreeNode treeRootNode1 = new BalancedTreeNode();
            BalancedTreeNode treeRootNode2 = new BalancedTreeNode();

            treeRootNode.data=1;
            treeRootNode1.data=2;
            treeRootNode2.data=3;

            treeRootNode.left=treeRootNode1;
            treeRootNode1.right=treeRootNode2;

            System.out.println("((()))"+minDept(treeRootNode));
        }

        private static int minDept(BalancedTreeNode A) {

            if(A==null){
                return 0;
            }

            if(A.left==null && A.right==null){
                return 1;
            }
            int ld=Integer.MAX_VALUE;
            if(A.left!=null)
                ld = 1 + minDept(A.left);
            int rd=Integer.MAX_VALUE;
            if(A.right!=null)
                rd = 1+ minDept(A.right);

            return Math.min(ld,rd);

        }

    }

