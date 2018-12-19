package TreeProbblems;

import org.omg.CORBA.BAD_CONTEXT;

import java.util.ArrayList;

public class BinaryTreeFromInorderAndPostorder {


    public static BalancedTreeNode buildTree(BalancedTreeNode a, ArrayList<Integer> in, ArrayList<Integer> po, int start, int end, int sizeOfPost){

        if(end<start) return null;
        if(start==end){
            BalancedTreeNode obj = new BalancedTreeNode();
            obj.data=in.get(start);
            return obj;
        }

        if(a==null){
            a=new BalancedTreeNode();
        }
        a.data=po.get(sizeOfPost);
        int mid= calculateIndex(in,a.data, start, end);
        a.left = buildTree(a.left,in,po,start,mid-1,sizeOfPost-1);
        a.right = buildTree(a.right,in,po,mid+1,end,sizeOfPost-1);
        return a;
    }

    private static int calculateIndex(ArrayList<Integer> in, int data, int start, int end) {
        for(int i=start;i<=end;i++){
            if(in.get(i)==data)
                return i;
        }
        return -1;
    }

    public static BalancedTreeNode buildTree(ArrayList<Integer> A, ArrayList<Integer> B) {
       BalancedTreeNode root=new BalancedTreeNode();

        return buildTree(root,A,B,0,A.size()-1,A.size()-1);
    }

    public static void main(String [] args){
        ArrayList<Integer> in= new ArrayList<>();
        ArrayList<Integer> po= new ArrayList<>();

        in.add(7);in.add(5);in.add(6);        in.add(2);in.add(3);in.add(1); in.add(4);


        po.add(5);po.add(6);po.add(3);         po.add(1);po.add(4);po.add(2);po.add(7);


        buildTree(in,po);
        System.out.println("JKL");


    }
}
