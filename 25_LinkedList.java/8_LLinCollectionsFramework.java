package LinkedList.java;
import java.util.LinkedList;

public class 8_LLinCollectionsFramework {
    public static void main(String args[]) {
        //Create a LinkedList using Java Collections Framework
        LinkedList<Integer> list = new LinkedList<>();

        //Add elements to the LinkedList
        list.addLast(10);
        list.addLast(20);
        list.addFirst(5);

        System.out.println("LinkedList: " + list); //Output: [5, 10, 20]

        //Remove elements from the LinkedList
        list.removeFirst();
        System.out.println("After removing first element: " + list); //Output: [10, 20]
    }
}


