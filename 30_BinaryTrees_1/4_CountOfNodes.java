package BinaryTrees;
import java.util.*;

public class 4_CountOfNodes {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int item) {
            data = item;
            left = null;
            right = null;
        }
    }

    public static int countOfNodes(Node root) {
        if (root == null) {
            return 0;
        }
        int leftCount = countOfNodes(root.left);
        int rightCount = countOfNodes(root.right);
        return leftCount + rightCount + 1;
    }

    public static void main(String[] args) {
        /*
                 1
                / \
               2   3
              / \   \
             4   5   6
        */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        int count = countOfNodes(root);
        System.out.println("Total number of nodes in the tree: " + count); // Output: 6
    }
}

// Output:
// Total number of nodes in the tree: 6
