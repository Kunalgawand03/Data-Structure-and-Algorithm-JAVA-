package BinaryTrees;
import java.util.*;

public class 1_DiameterOfTree {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int diameterOfTree(Node root) {
        if (root == null) {
            return 0;
        }

        int leftDiameter = diameterOfTree(root.left);
        int rightDiameter = diameterOfTree(root.right);
        int leftHeight = heightOfTree(root.left);
        int rightHeight = heightOfTree(root.right);

        int selfDiameter = leftHeight + rightHeight + 1;

        return Math.max(selfDiameter, Math.max(leftDiameter, rightDiameter));
    }

    public static int heightOfTree(Node root) {    //This function is reused from HeightOfTree.java
                                              //to calculate height of left and right subtrees //which is needed to calculate diameter.
        if (root == null) {
            return 0;
        }
        int leftHeight = heightOfTree(root.left);
        int rightHeight = heightOfTree(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
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

        int diameter = diameterOfTree(root);
        System.out.println("Diameter of the tree: " + diameter); // Output: 5
    }
}

// Output:
// Diameter of the tree: 5

