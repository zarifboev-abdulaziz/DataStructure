import com.sun.source.tree.BinaryTree;
import com.sun.source.util.TreeScanner;
import myDataStructure.MyBinarySearchTree;
import myDataStructure.MyLinkedList;

public class Main {
    public static void main(String[] args) {

        MyBinarySearchTree tree = new MyBinarySearchTree();
        tree.insert(4);
        tree.insert(3);
        tree.insert(5);
        tree.insert(2);
        tree.insert(7);
        System.out.println(tree.search(7));


    }

}
