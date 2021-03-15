package com.bridgeLabs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BinarySearchTree_Testing {

    BinarySearchTree<Integer> tree;
    Node<Integer> root;

    @BeforeEach
    public void setUp() {
        tree = new BinarySearchTree<>();
        root = new Node<>(56);

    }

    @Test
    public void Creating_BST_of3node() {
        tree.insert(root, 30);
        tree.insert(root, 70);
        tree.preOrder(root);
        Assertions.assertEquals(3, tree.size(root));
    }

}

