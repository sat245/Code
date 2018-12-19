package TreeProbblems;

import java.util.ArrayList;


public class PrintPathSum {

static ArrayList<ArrayList<Integer>> arr = new ArrayList<>();

    public static ArrayList<ArrayList<Integer>> pathSum(BalancedTreeNode A, int B) {
        ArrayList<Integer> array = new ArrayList<>();
        getPath(A,B,array,0);
        return arr;
    }

    public static void getPath(BalancedTreeNode A,int B,ArrayList array,int index){
     if(A==null){
         return;
     }
     array.add(index,A.data);
     index=index+1;
     if(A.left==null && A.right==null){
         calculateSum(B,array,index);
     }else{
         getPath(A.left,B,array,index);
         getPath(A.right,B,array,index);
     }
    }

    private static void calculateSum(int b, ArrayList<Integer> array,int len) {
        int sum=0;
        ArrayList<Integer> xyz = new ArrayList<>();
        for(int i=0;i<len;i++){
            xyz.add(array.get(i));
            sum=sum+array.get(i);
        }

        if(sum==b){
            arr.add(xyz);
        }
    }

    public static void main(String [] args){
        BalancedTreeNode root = new BalancedTreeNode();
        BalancedTreeNode root1 = new BalancedTreeNode();
        BalancedTreeNode root2 = new BalancedTreeNode();
        BalancedTreeNode root3= new BalancedTreeNode();
        BalancedTreeNode root4 = new BalancedTreeNode();
        BalancedTreeNode root5 = new BalancedTreeNode();
        BalancedTreeNode root6= new BalancedTreeNode();
        BalancedTreeNode root7 = new BalancedTreeNode();
        BalancedTreeNode root8 = new BalancedTreeNode();
        BalancedTreeNode root9 = new BalancedTreeNode();



        root.data=5;
        root.left=root1;
        root.right=root2;


        root1.data=4;
        root1.left=root3;
        root1.right=null;

        root2.data=8;
        root2.left=root4;
        root2.right=root5;

        root3.data=11;
        root3.left=root6;
        root3.right=root7;

        root4.data=9;

        root5.data=4;
        root5.left=root8;
        root5.right=root9;

        root6.data=7;
        root7.data=2;
        root8.data=0;
        root9.data=0;

        pathSum(root,17);

        System.out.println("(((***)))");
    }

}
