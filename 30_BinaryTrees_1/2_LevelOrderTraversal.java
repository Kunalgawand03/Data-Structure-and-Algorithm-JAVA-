package 30_BinaryTrees-1;
import java.util.*;

public class 2_LevelOrderTraversal {
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

    public static void levelOrderTraversal(Node root) {
        if (root == null) {
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null); // Marker for end of level

        while (!queue.isEmpty()) {
            Node currentNode = queue.remove();

            if (currentNode == null) {
                System.out.println(); // End of current level
                if (!queue.isEmpty()) {
                    queue.add(null); // Add marker for next level
                }
            } else {
                System.out.print(currentNode.data + " ");

                if (currentNode.left != null) {
                    queue.add(currentNode.left);
                }
                if (currentNode.right != null) {
                    queue.add(currentNode.right);
                }
            }
        }
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

        System.out.println("Level Order Traversal:");
        levelOrderTraversal(root);
    }
}

//----------------------------------
//Output:
//Level Order Traversal:
//1
//2 3
//4 5 6

