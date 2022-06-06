package myDataStructure;

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



    public void stringRepresentation(){
        show(parent);
    }

    public void show(Node node){
        if (node == null) return;

        System.out.println(node.value);
        show(node.left);
        show(node.right);
    }

}
