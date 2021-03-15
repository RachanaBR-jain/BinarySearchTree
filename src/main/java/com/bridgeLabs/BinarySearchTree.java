package com.bridgeLabs;

public class BinarySearchTree<T extends Comparable<T>> {

    public void insert(Node<T> root, T data) {
        if (root == null) {
            root = new Node<>(data);
        } else if (data.compareTo(root.data) < 0) {
            if (root.right == null) {
                root.right = new Node<>(data);
                return;
            }
            insert(root.right, data);

        } else {

            if (root.left == null) {
                root.left = new Node<>(data);
                return;
            }
            insert(root.left, data);
        }

    }

    public void preOrder(Node<T> root) {
        if (root != null) {
            System.out.println(root.data);
            preOrder(root.left);
            preOrder(root.right);
        }

    }

    public int size(Node<T> root) {
        if (root == null) {
            return 0;
        } else {
            return 1 + size(root.left) + size(root.right);
        }
    }
}


