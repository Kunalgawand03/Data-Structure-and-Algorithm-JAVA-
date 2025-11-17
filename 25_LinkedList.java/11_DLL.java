package LinkedList.java;

public class 11_DLL {
    public static class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // Add First
    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head; // Link
        head.prev = newNode; // Link prev of old head to newNode
        head = newNode;      // Update head
    }

    // Add Last
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;     // Link
        newNode.prev = tail;     // Link prev of newNode to old tail
        tail = newNode;          // Update tail
    }

    //Remove First
    public int removeFirst() {
        if (size == 0) {
            System.out.println("DLL is empty");
            return -1;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }

        int val = head.data;
        head = head.next; // Move head to next node
        head.prev = null; // Set prev of new head to null
        size--;
        return val;
    }

    //Remove Last
    public int removeLast() {
        if (size == 0) {
            System.out.println("DLL is empty");
            return -1;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }

        int val = tail.data;
        tail = tail.prev; // Move tail to previous node
        tail.next = null; // Set next of new tail to null
        size--;
        return val;
    }

    //Reverse DLL
    public void reverse() {
        Node curr = head;
        Node prev = null;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            curr.prev = next; // Update prev pointer

            prev = curr;
            curr = next;
        }

        // Swap head and tail
        Node temp = head;
        head = tail;
        tail = temp;
    }


    // Print DLL
    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        11_DLL dll = new 11_DLL();
        dll.addFirst(10);
        dll.addFirst(20);
        dll.addLast(5);
        dll.addLast(1);
        dll.print(); // 20 <-> 10 <-> 5 <-> 1 <-> null

        // Remove first and last
        dll.removeFirst();
        dll.print(); // 10 <-> 5 <-> 1 <-> null
        dll.removeLast();
        dll.print(); // 10 <-> 5 <-> null
    }
}

//LeetCode Link: https://leetcode.com/problems/design-doubly-linked-list/
