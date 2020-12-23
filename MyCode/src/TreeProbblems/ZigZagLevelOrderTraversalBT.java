package TreeProbblems;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Queue;

public class ZigZagLevelOrderTraversalBT {


    static   ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
    static   Queue queue = new ArrayDeque();
    static   Queue queue1 = new ArrayDeque();

    public static ArrayList<ArrayList<Integer>> zigzagLevelOrder(BalancedTreeNode A) {
        fn(A);
        return arr;
    }




    public static void fn(BalancedTreeNode a) {
        queue.add(a);
        boolean flag =false;
        while (!queue.isEmpty() || !queue1.isEmpty()) {
            ArrayList<Integer> array = new ArrayList();
            if (!queue.isEmpty()) {
                while (!queue.isEmpty()) {
                    BalancedTreeNode balancedTreeNode = (BalancedTreeNode) queue.poll();
                    array.add(balancedTreeNode.data);

                    if (balancedTreeNode.right != null)
                        queue1.add(balancedTreeNode.right);

                    if (balancedTreeNode.left != null)
                        queue1.add(balancedTreeNode.left);
                }
                if (flag) {
                    arr.add(array);
                    flag = false;
                } else {
                    Collections.reverse(array);
                    arr.add(array);
                    flag = true;
                }
            }
            array = new ArrayList();
            if (!queue1.isEmpty()) {
                while (!queue1.isEmpty()) {
                    BalancedTreeNode balancedTreeNode = (BalancedTreeNode) queue1.poll();
                    array.add(balancedTreeNode.data);

                    if (balancedTreeNode.right != null)
                        queue.add(balancedTreeNode.right);

                    if (balancedTreeNode.left != null)
                        queue.add(balancedTreeNode.left);
                }
                if (flag) {
                    arr.add(array);
                    flag = false;
                } else {
                    flag = true;
                    Collections.reverse(array);
                    arr.add(array);
                }
            }
        }
        //arr.remove(arr.size()-1);
    }

    public static void main(String [] args){
        BalancedTreeNode balancedTreeNode = new BalancedTreeNode().getTree();
        zigzagLevelOrder(balancedTreeNode);
        System.out.println("((())))");
    }
}
