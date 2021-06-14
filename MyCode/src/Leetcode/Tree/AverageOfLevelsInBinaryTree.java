package Leetcode.Tree;

import Leetcode.Tree.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

// @author: sayam mishra
//Average of Levels in Binary Tree
public class AverageOfLevelsInBinaryTree {
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> queue1 = new ArrayDeque<>();
        Queue<TreeNode> queue2 = new ArrayDeque<>();
        List<Double> list = new ArrayList<>();
        queue1.add(root);

        while (!queue1.isEmpty() || !queue2.isEmpty()) {

                double sum = 0;int count = 0;
                while (!queue1.isEmpty()) {
                    TreeNode treeNode = queue1.poll();
                    sum = sum + treeNode.val;
                    count++;
                    if(treeNode.left !=null)queue2.add(treeNode.left);
                    if(treeNode.right!=null)queue2.add(treeNode.right);
                }
                if(count > 0) {
                    list.add( (sum/count));
                    sum = 0;
                    count = 0 ;
                }

            while (!queue2.isEmpty()) {
                TreeNode treeNode = queue2.poll();
                sum = sum + treeNode.val;
                count++;
                if(treeNode.left !=null)queue1.add(treeNode.left);
                if(treeNode.right!=null)queue1.add(treeNode.right);
            }
            if(count > 0) {
                list.add((double) (sum/count));
                sum = 0;
                count = 0 ;
            }

        }
        return list;
    }
}
