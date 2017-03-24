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
public class BinaryTreeJavaEE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        
        //root
        tree.setRoot(new Node(1));
        
        //nivel 1
        tree.getRoot().setLeft(new Node(2));
        tree.getRoot().setRight(new Node(3));
        
        //nivel 2
        tree.getRoot().getLeft().setLeft(new Node(4));
        tree.getRoot().getLeft().setRight(new Node(5));        
        tree.getRoot().getRight().setLeft(new Node(6));
        tree.getRoot().getRight().setRight(new Node(7));
        
//        tree.root = new Node(1);
//        tree.root.left = new Node(2);
//        tree.root.right = new Node(3);
//        tree.root.left.left = new Node(4);
//        tree.root.left.right = new Node(5);

        PrintOrder po = new PrintOrder();
        System.out.println("Preorder traversal of binary tree is ");
        po.printPreorder(tree);

        System.out.println("\nInorder traversal of binary tree is ");
        po.printInorder(tree);

        System.out.println("\nPostorder traversal of binary tree is ");
        po.printPostorder(tree);
    }
}
