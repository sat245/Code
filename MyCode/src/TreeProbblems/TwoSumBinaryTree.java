package TreeProbblems;

public class TwoSumBinaryTree {

    public static boolean  fn(BalancedTreeNode a,BalancedTreeNode b,int sum){

        if(a==null || b==null){
            return false;
        }

        int temp=0;
        temp = a.data + b.data;
        if(a==b){
            if(temp>sum){
                b=a.left;
            }else
            a=b.right;
        }
        if(a==null || b==null){
            return false;
        }
             temp = a.data + b.data;

        if(temp==sum){
            return true;
        }

        if(temp<sum){
            return (fn(a.right,b,sum) || fn(a,b.right,sum));
        }else {
            return (fn(a,b.left,sum) || fn(a.left,b,sum));

        }

    }

    public  static  void main(String [] args){
        BalancedTreeNode root = new BalancedTreeNode();
        BalancedTreeNode root1 = new BalancedTreeNode();
        BalancedTreeNode root2 = new BalancedTreeNode();
        BalancedTreeNode root3 = new BalancedTreeNode();
        BalancedTreeNode root4 = new BalancedTreeNode();

        root.data=10;
        root.left=root1;
        root.right=root2;

        root1.data=9;
        root2.data=20;
//
//        root1.left=root3;
//        root3.data=20;

        int abc = fn(root,root,40)==true?1:0;

        System.out.println(abc);
    }
}
