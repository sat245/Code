package TreeProbblems;

import java.util.ArrayList;

public class SortedArrayToBST {

    public static BalancedTreeNode sortedTOBST(BalancedTreeNode a, ArrayList<Integer> arr, int left, int right,int size){
        if(left>right || left>=size || right>=size){
            return null;
        }
        int mid=(left+right)/2;
        if(a==null){
            a=new BalancedTreeNode();
        }
        a.data=arr.get(mid);

        a.left=sortedTOBST(a.left,arr,left,mid-1,size);
        a.right=sortedTOBST(a.right,arr,mid+1,right,size);
        return a;
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);arr.add(4);
        sortedTOBST(root,arr,0,arr.size()-1,arr.size());
        System.out.println("LLLL");
    }

    static BalancedTreeNode root = new BalancedTreeNode();
}
