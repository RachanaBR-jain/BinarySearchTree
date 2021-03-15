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
        Assertions.assertEquals(13, tree.size(root));
    }
    @Test
    public void CreatingBST_of_N_node() {
        setUp();
        tree.insert(root, 30);
        tree.insert(root, 70);
        tree.insert(root, 22);
        tree.insert(root, 40);
        tree.insert(root, 60);
        tree.insert(root, 95);
        tree.insert(root, 11);
        tree.insert(root, 65);
        tree.insert(root, 3);
        tree.insert(root, 16);
        tree.insert(root, 63);
        tree.insert(root, 67);

        tree.preOrder(root);
        Assertions.assertEquals(13, tree.size(root));
    }

    @Test
    public void seach_elementsInBST(){
        CreatingBST_of_N_node();
        Assertions.assertEquals(true, tree.search(root, 63));
    }

}

