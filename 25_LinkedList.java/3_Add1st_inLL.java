package LinkedList.java;

import java.util.LinkedList;

public class 3_Add1st_inLL {
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

    // Add First
    public void addFirst(int data) {
        // Step 1: Create new node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // Step 2: NewNode next = head
        newNode.next = head; // Link

        // Step 3: head = newNode
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;     // Link
        tail = newNode;          // Update tail
    }


    // Add in between i.e at idx
    public void add(int idx, int data) {  
        if (idx == 0) {
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }

        // i = idx - 1; temp -> prev
        newNode.next = temp.next;
        temp.next = newNode;
    }


    public int removeFirst() {
        if (size == 0) {
            System.out.println("Linked List is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        int val = head.data;
        head = head.next;
        size--;
        return val;
    }


    public int removeLast() {
        if (size == 0) {
            System.out.println("Linked List is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        // Find second last node
        Node temp = head;
        for (int i = 0; i < size - 2; i++) {
            temp = temp.next;
        }

        int val = tail.data;  
        tail = temp;
        tail.next = null;
        size--;
        return val;
    }


    // Iterative Search                //O(n)
    public int itrSearch(int key) {
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    // Recursive Search
    public int helper(Node head, int key) {
        // Base case
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }

        int idx = helper(head.next, key);
        if (idx == -1) {
            return -1;
        }
        return idx + 1;
    }

    public int recSearch(int key) {
        return helper(head, key);
    }


    public void reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while (curr != null) {
            // Step 1: next = curr.next
            next = curr.next;
            // Step 2: curr.next = prev
            curr.next = prev;
            // Step 3: prev = curr
            prev = curr;
            // Step 4: curr = next
            curr = next;
        }
        head = prev;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addFirst(0);
        ll.print();      // Output: 0 -> 1 -> 2 -> null

        ll.addLast(3);
        ll.addLast(4);
        ll.print();      // Output: 0 -> 1 -> 2 -> 3 -> 4 -> null
        System.out.println("Size of linked list: " + ll.size);  // Output: Size of linked list: 5
        
        ll.removeFirst();
        ll.print();      // Output: 1 -> 2 -> 3 -> 4 -> null

        ll.removeLast();
        ll.print();      // Output: 1 -> 2 -> 3 -> null

        System.out.println("Index of 3: " + ll.itrSearch(3)); // Output: Index of 3: 2
        System.out.println("Index of 10: " + ll.itrSearch(10)); // Output: Index of 10: -1

        System.out.println("Index of 2 (recursive): " + ll.recSearch(2)); // Output: Index of 2 (recursive): 1

        ll.reverse();
        ll.print();      // Output: 3 -> 2 -> 1 -> null 
    }
}

// Output:
// 0 -> 1 -> 2 -> null
// 0 -> 1 -> 2 -> 3 -> 4 -> null
// Size of linked list: 5
// 1 -> 2 -> 3 -> 4 -> null
// 1 -> 2 -> 3 -> null
// Index of 3: 2
// Index of 10: -1
// Index of 2 (recursive): 1
// 3 -> 2 -> 1 -> null

//LeetCode Link: https://leetcode.com/problems/design-linked-list/