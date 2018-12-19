package TreeProbblems;


import java.util.ArrayList;

public class InorderTraversalOfCartesianTree {
    static BalancedTreeNode root = new BalancedTreeNode();

    public static BalancedTreeNode buildTree(ArrayList<Integer> A) {
        treeFormation(root, A, 0, A.size() - 1);
        return root;
    }

    public static BalancedTreeNode treeFormation(BalancedTreeNode a, ArrayList<Integer> arr, int left, int right) {
        if (left > right) {
            return null;
        }
        int largest = getLargest(arr, left, right);
        if (a == null) {
            a = new BalancedTreeNode();
        }
        a.data = arr.get(largest);

        a.left = treeFormation(a.left, arr, left, largest - 1);
        a.right = treeFormation(a.right, arr, largest + 1, right);
        return a;

    }

    private static int getLargest(ArrayList<Integer> arr, int left, int right) {
        int max = left;
        for (int i = left; i <= right; i++) {
            if (arr.get(i) > arr.get(max)) {
                max = i;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        buildTree(arr);
        System.out.println("LLLL");
    }

}
