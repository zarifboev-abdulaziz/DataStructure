import com.sun.source.tree.BinaryTree;
import com.sun.source.util.TreeScanner;
import myDataStructure.MyBinarySearchTree;
import myDataStructure.MyLinkedList;

public class Main {
    public static void main(String[] args) {

//        int[] nums = {20, 10, 30, 6, 14, 24, 3, 8, 26};
        int[] nums = {7, 4, 9, 1, 6, 8, 10};
        MyBinarySearchTree tree1 = new MyBinarySearchTree();
        MyBinarySearchTree tree2 = new MyBinarySearchTree();

        for (int i = 0; i < nums.length; i++) {
            tree1.insert(nums[i]);
            tree2.insert(nums[i]);
        }

        System.out.println(tree1.equals(tree2));

    }

}
