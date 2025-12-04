package BinaryTrees;

public class BuildTreePreorder {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int item) {
            data = item;
            left = null;
            right = null;
        }
    }

    static int idx = -1;
    public static Node buildTree(int nodes[]) {
        idx++;
        if (nodes[idx] == -1) {
            return null;
        }
        Node newNode = new Node(nodes[idx]);
        newNode.left = buildTree(nodes);
        newNode.right = buildTree(nodes);
        return newNode;
    }
    

    // Function to print the tree in preorder (for testing purposes)
    public static void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    // Function to print the tree in inorder (for testing purposes)
    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // Function to print the tree in postorder (for testing purposes)
    public static void postOrder(Node root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }


    //Level Order Traversal
    public void levelOrder(Node root) {
        if (root == null) {
            return;
        }
        java.util.Queue<Node> queue = new java.util.LinkedList<>();
        queue.add(root);
        queue.add(null);

        while (!queue.isEmpty()) {
            Node currNode = queue.remove();
            if (currNode == null) {
                System.out.println();
                if (queue.isEmpty()) {
                    break;
                } else {
                    queue.add(null);
                }
            } else {
                System.out.print(currNode.data + " ");
                if (currNode.left != null) {
                    queue.add(currNode.left);
                }
                if (currNode.right != null) {
                    queue.add(currNode.right);
                }
            }
        }
    }


    public static void main(String args[]) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(root.data);  // Output the root data to verify
                            // Output: 1

        tree.preOrder(root); // Output the tree in preorder to verify
                        // Output: 1 2 4 5 3 6
                        
        tree.inorder(root); // Output the tree in inorder to verify
                        // Output: 4 2 5 1 3 6

        tree.postOrder(root); // Output the tree in postorder to verify
                        // Output: 4 5 2 6 3 1

        System.out.println("\nLevel Order Traversal:");
        tree.levelOrder(root); // Output the tree in level order to verify
                             // Output:
                                // 1
                                // 2 3
                                // 4 5 6
    }
}

//Output: 1
//Explanation: The first element in the preorder traversal array is always the root of the binary tree. In this case, the first element is 1, which becomes the root node of the constructed binary tree.

