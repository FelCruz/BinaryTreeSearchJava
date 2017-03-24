/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarytreejavaee;

import beans.BinaryTree;
import beans.Node;

/**
 *
 * @author DesenvolvedorJava
 */
public class PrintOrder {

    /* Given a binary tree, print its nodes according to the
      "bottom-up" postorder traversal. */
    void printPostorder(Node node) {
        if (node == null) {
            return;
        }

        // first recur on left subtree
        printPostorder(node.getLeft());

        // then recur on right subtree
        printPostorder(node.getRight());

        // now deal with the node
        System.out.print(node.getKey() + " ");
    }

    /* Given a binary tree, print its nodes in inorder*/
    void printInorder(Node node) {
        if (node == null) {
            return;
        }

        /* first recur on left child */
        printInorder(node.getLeft());

        /* then print the data of node */
        System.out.print(node.getKey() + " ");

        /* now recur on right child */
        printInorder(node.getRight());
    }

    /* Given a binary tree, print its nodes in preorder*/
    void printPreorder(Node node) {
        if (node == null) {
            return;
        }

        /* first print data of node */
        System.out.print(node.getKey() + " ");

        /* then recur on left sutree */
        printPreorder(node.getLeft());

        /* now recur on right subtree */
        printPreorder(node.getRight());
    }

    // Wrappers over above recursive functions
    void printPostorder(BinaryTree bt) {
        printPostorder(bt.getRoot());
    }

    void printInorder(BinaryTree bt) {
        printInorder(bt.getRoot());
    }

    void printPreorder(BinaryTree bt) {
        printPreorder(bt.getRoot());
    }
}
