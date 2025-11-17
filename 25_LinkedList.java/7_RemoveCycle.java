package LinkedList.java;

public class 7_RemoveCycle {
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

    public static void removeCycle(){
        //Floyd's Cycle Finding Algorithm
        Node slow = head;
        Node fast = head;
        boolean cycleExists = false;

        //Detect Cycle
        while(fast != null && fast.next != null){
            slow = slow.next;        //+1
            fast = fast.next.next;     //+2

            if(slow == fast){
                cycleExists = true;      //cycle exists
                break;
            }
        }

        if(cycleExists == false){
            return;
        }

        //Find meeting point
        slow = head;
        Node prev = null; //to keep track of node before fast

        while(slow != fast){
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        //Remove Cycle
        prev.next = null;
    }

    public static void main(String[] args) {
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = head.next; //Creating a cycle

        removeCycle();

        //Print Linked List after removing cycle
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}

//Output:
//1 2 3 4 5