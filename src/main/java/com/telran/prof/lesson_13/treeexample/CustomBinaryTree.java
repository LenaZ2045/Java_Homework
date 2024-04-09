package com.telran.prof.lesson_13.treeexample;

public class CustomBinaryTree {

    private TreeNode root;

    public TreeNode getRoot() {
        return root;
    }

    public void add(int value) {
        root = addRecursive(root, value);

    }

    private TreeNode addRecursive(TreeNode currentNode, int value) {
        if (currentNode == null) {
            return new TreeNode(value);
        }
        if (currentNode.getValue() > value) {
            currentNode.setLeft(addRecursive(currentNode.getLeft(), value));
        } else if (value > currentNode.getValue()) {
            currentNode.setRight(addRecursive(currentNode.getRight(), value));
        }
        return currentNode;
    }
}