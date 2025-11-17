package LinkedList.java;

public class 5_CheckLLPalindrome {
    //Slow and Fast Pointer Approach
    public Node findMid(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; // slow is now at mid
    }

    public boolean checkPalindrome() {
        if (head == null || head.next == null) {
            return true; // An empty list or single node is a palindrome
        }

        // Step 1: Find the middle of the linked list
        Node midNode = findMid(head);

        // Step 2: Reverse the second half of the linked list
        Node prev = null;
        Node curr = midNode;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // Step 3: Compare the first half and the reversed second half
        Node left = head;
        Node right = prev; // 'prev' is now the head of the reversed second half

        while (right != null) {
            if (left.data != right.data) {
                return false; // Not a palindrome
            }
            left = left.next;
            right = right.next;
        }

        return true; // Is a palindrome
    }

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public static int size;
    
    public static void main(String args[]) {
        LinkedList ll = new LinkedList();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(2);
        ll.addLast(1);
        
        ll.print();
        System.out.println(ll.checkPalindrome()); // Output: true
    }
}

//output:
// 1 2 2 1
// true

