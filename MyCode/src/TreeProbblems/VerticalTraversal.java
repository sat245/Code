package TreeProbblems;
//
//Given a binary tree, print a vertical order traversal of it.
//
//        Example :
//        Given binary tree:
//
//          6
//        /   \
//       3     7
//      / \     \
//     2   5     9

//        returns
//
//        [
//        [2],
//        [3],
//        [6 5],
//        [7],
//        [9]
//        ]
//
//
//        Note : If 2 Tree Nodes shares the same vertical level then the one with lesser depth will come first.


import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class VerticalTraversal {
   static int i=0,j=0;
   static Map<Integer, ArrayList<Integer>> map = new TreeMap<>();
    static Map<Integer, Integer> depthMap = new HashMap<Integer, Integer>();


    public static void vetticalDistance(BalancedTreeNode A, int count) {

                if(A==null){
                    return ;
                }
                else {
                        if(map.get(count)==null){
                            map.put(count,new ArrayList<Integer>());
                        }
                        ArrayList arr = map.get(count);
                        arr.add(A.data);
                        vetticalDistance(A.left,count+1);
                        vetticalDistance(A.right,count-1);

                }
            }

        public static void main(String [] args){
                BalancedTreeNode treeRootNode = new BalancedTreeNode();
                BalancedTreeNode root = treeRootNode.getTree();


           int [][] a= verticalOrderTraversal(root);


                System.out.println("((()))");
        }

    public static int[][] verticalOrderTraversal(BalancedTreeNode A) {
        VerticalTraversal.vetticalDistance(A,0);
        depthMap(A,0);
        int i=0,j=0;
        int [][] arr = new int[depthMap.size()][depthMap.size()];
        for (Map.Entry<Integer,ArrayList<Integer>> obj:map.entrySet()){
            if(obj.getValue().size()>1){
                ArrayList<Integer> arr1 =new ArrayList<>();
                arr1.add(0);
                for(int k=0;k<obj.getValue().size();k++){
                    if(depthMap.get(obj.getValue().get(k))<=arr1.get(0)){
                        arr1.add(0,obj.getValue().get(k));
                    }else {
                        arr1.add(obj.getValue().get(k));
                    }

                }

                for(int k=0;k<arr1.size();k++){
                    arr[i][j++]=arr1.get(k);
                }

            }else {
                    arr[i][j] = obj.getValue().get(0);
            }
            j=0;
            i++;
        }
        return arr;
    }

    private static void depthMap(BalancedTreeNode root,int count) {
        if(root==null){
            return;
        }else {
            depthMap.put(root.data,count);
            depthMap(root.left,count+1);
            depthMap(root.right,count+1);
        }
    }
}


