package myDataStructure;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyBinarySearchTree {
    private Node parent;
//    private int size;

    private class Node{
        int value;
        Node left;
        Node right;

        public Node(int val) {
            this.value = val;
        }

        @Override
        public String toString(){
            return "Node=" + value;
        }
    }


    public boolean search(int value){
        Node current = parent;

        while (current != null){
            if (current.value == value){
                return true;
            }

            if (current.value > value){
                current = current.left;
            } else {
                current = current.right;
            }
        }

        return false;
    }

    public void insert(int value){
        if (parent == null){
            parent = new Node(value);
            return;
        }

        Node current = parent;

        while (true){
            if (current.value > value){
                if (current.left == null){
                    current.left = new Node(value);
                    break;
                }
                current = current.left;
            } else {
                if (current.right == null){
                    current.right = new Node(value);
                    break;
                }
                current = current.right;
            }
        }
    }



    public void breadthFirst(){
        Node current = parent;

        List<Node> nodeList = new ArrayList<>();
        nodeList.add(current);

        while (!nodeList.isEmpty()){
            LinkedList<Node> nodes = new LinkedList<>();
            for (Node node : nodeList) {
                System.out.println(node.value);
                if (node.left != null) nodes.addLast(node.left);
                if (node.right != null) nodes.addLast(node.right);
            }

            nodeList = nodes;
        }
    }


    public void preOrder(){
        preOrderRecursion(parent);
    }

    private void preOrderRecursion(Node node){
        if (node == null) return;

        System.out.println(node.value);
        preOrderRecursion(node.left);
        preOrderRecursion(node.right);
    }

    public void inOrder(){
        inOrderRecursion(parent);
    }

    private void inOrderRecursion(Node node){
        if (node == null) return;

        inOrderRecursion(node.left);
        System.out.println(node.value);
        inOrderRecursion(node.right);
    }

    public void postOrder(){
        postOrderRecursion(parent);
    }

    private void postOrderRecursion(Node node){
        if (node == null) return;

        postOrderRecursion(node.left);
        postOrderRecursion(node.right);
        System.out.println(node.value);
    }

    public int height(){
        return height(parent);
    }

    private int height(Node node){
        if (node == null) return -1;
        if (node.left == null && node.right == null) return 0;

        return 1 + Math.max(height(node.left), height(node.right));
    }

    public boolean equals(MyBinarySearchTree tree){
        if (tree == null) return false;

        return equals(parent, tree.parent);
    }

    private boolean equals(Node first, Node second){
        if (first == null && second == null) return true;
        if (first != null && second != null)
            return first.value == second.value
                    && equals(first.left, second.left)
                    && equals(first.right, second.right);

        return false;
    }




}
