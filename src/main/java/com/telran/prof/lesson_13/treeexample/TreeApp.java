package com.telran.prof.lesson_13.treeexample;

public class TreeApp {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(10, null, null);
        TreeNode left = new TreeNode(7, null, null);
        TreeNode right = new TreeNode(13, null, null);
        root.setLeft(left);
        root.setRight(right);

        // 10
        // / \
        //7  13

        CustomBinaryTree customBinaryTree = new CustomBinaryTree();
        customBinaryTree.add(7);
        customBinaryTree.add(4);
        customBinaryTree.add(8);
        customBinaryTree.add(2);
        customBinaryTree.add(5);
        customBinaryTree.add(10);
        customBinaryTree.add(12);

        SearchUtil.breadthFirstSearch(customBinaryTree.getRoot());
        System.out.println();
        SearchUtil.dfsPostOrder(customBinaryTree.getRoot());
        System.out.println();
        SearchUtil.dfsPreOrder(customBinaryTree.getRoot());
    }
}