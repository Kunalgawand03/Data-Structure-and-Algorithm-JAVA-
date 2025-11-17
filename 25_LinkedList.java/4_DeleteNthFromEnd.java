//Delete Nth Node from End of Linked List

package LinkedList.java;

import java.util.LinkedList;

public class 4_DeleteNthFromEnd {
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

    public void deleteNthFromEnd(int n) {
        // 1st Approach: Calculate Size then Delete
        if (head == null || n > size) {
            return; // Invalid case
        }

        if (n == size) {
            head = head.next; // Remove head
            size--;
            return;
        }

        Node current = head;
        int targetIndex = size - n - 1;

        for (int i = 0; i < targetIndex; i++) {
            current = current.next;
        }

        current.next = current.next.next; // Bypass the nth node from end
        size--;

        //2nd Approach : Two Pointer Approach
        int size = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            size++;
        }
        
        if (n == size) {
            head = head.next; // Remove head
            return;
        }

        Node current = head;
        int targetIndex = size - n - 1;
        for (int i = 0; i < targetIndex; i++) {
            current = current.next;
        }
        current.next = current.next.next; // Bypass the nth node from end

    }

    public static void main(String args[]){
        LinkedList ll = new LinkedList();
        ll.head = new Node(1);
        ll.head.next = new Node(2);
        ll.tail = new Node(3);
        ll.print();              // 1 2 3

        ll.deleteNthFromEnd(2);
        ll.print();             // 1 3

    }
}

// Time Complexity: O(L) where L is the length of the linked list
// Space Complexity: O(1)

