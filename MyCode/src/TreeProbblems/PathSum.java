package TreeProbblems;

import java.util.ArrayList;

public class PathSum {

       static ArrayList<ArrayList<Integer>> arr= new ArrayList();
    public static int hasPathSum(BalancedTreeNode A, int B) {
        if(hasPathSum(A,0,B,0)){
            return 1;
        }
        return 0;
    }

    public static boolean hasPathSum(BalancedTreeNode A, int sum,int finalSum,int count) {

        if(A==null){
            return false;
        }

        sum=sum+A.data;
        if((finalSum==sum) && count>0  && A.left==null && A.right==null)return true;
        System.out.println(A.data);
        boolean x= ((hasPathSum(A.left,sum,finalSum,count+1)) || hasPathSum(A.right,sum,finalSum,count+1));
        System.out.println("***"+A.data);
        return x;
    }

    public static void main(String [] args){
        BalancedTreeNode root = new BalancedTreeNode();
        BalancedTreeNode root1 = new BalancedTreeNode();
        BalancedTreeNode root2 = new BalancedTreeNode();

        BalancedTreeNode treeRootNode = new BalancedTreeNode();
        treeRootNode.data=3;


        root.data=1000;
        root.left=root1;
        root1.left=root2;

        root1.data=2000;
        root2.data=-3001;
        root.right=treeRootNode;





//
//        BalancedTreeNode treeRootNode1 = new BalancedTreeNode();
//
//        treeRootNode.left=treeRootNode1;
//        treeRootNode1.data=5;
//


        int a = hasPathSum(root,-1);

        System.out.println("(((***)))" + a);
    }

}
