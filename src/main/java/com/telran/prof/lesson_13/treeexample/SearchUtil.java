package com.telran.prof.lesson_13.treeexample;

import java.util.LinkedList;
import java.util.Queue;

public class SearchUtil {

    public  static void breadthFirstSearch(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode pollNode = queue.poll();
                System.out.print(pollNode.getValue() + " ");
                if (pollNode.getLeft() != null) {
                    queue.add(pollNode.getLeft());
                }
                if (pollNode.getRight() != null) {
                    queue.add(pollNode.getRight());
                }
            }
            System.out.println();
        }

    }

    public static void dfsPostOrder(TreeNode node) {
        if (node == null) {
            return;
        }
        dfsPostOrder(node.getLeft());

        dfsPostOrder(node.getRight());

        System.out.print(node.getValue() + " ");

    }

    public static void dfsPreOrder(TreeNode node) {
        if (node == null) {
            return;
        }
        System.out.print(node.getValue() + " ");

        dfsPreOrder(node.getLeft());
        dfsPreOrder(node.getRight());
    }
}