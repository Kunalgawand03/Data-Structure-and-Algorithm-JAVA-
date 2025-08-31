package OOPs;

public class CopyConstructor {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.name = "Shraddha";
        s1.roll = 21;

        Student s2 = new Student(s1); // Using the copy constructor to create a new object
        System.out.println(s2.name); // Output: Shraddha

        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;
        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]); // Output: 100 90 80 (shallow copy)
        }
    }
}

class Student {
    String name;
    int roll;
    String Pass;
    int marks[];

    // Copy Constructor  ---Shallow Copy constructor
    Student(Student s1) { // Constructor that takes another Student object as a parameter
        marks = new int[3]; // Initializing the marks array
        this.name = s1.name; // Copying the name from the passed object
        this.roll= s1.roll;   // Copying the age from the passed object
        this.marks = s1.marks; // Shallow copy of the marks array
    }

    Student() { // Default constructor
        marks = new int[3]; // Initializing the marks array
        System.out.println("Constructor is called...");
    }

}


//A copy constructor is a special type of constructor that initializes a new object as a copy of an existing object. In this example, the Student class has a copy constructor that takes another Student object as a parameter and copies its attributes (name and age) to the new object being created. This allows us to create a new Student object (s2) that is a copy of an existing Student object (s1).
//When we run the code, it prints "Shraddha", which is the name of the copied object (s2).

//Note: In this example, the copy constructor performs a shallow copy of the marks array. This means that both s1 and s2 will reference the same marks array in memory. If you modify the marks array in one object, it will affect the other object as well. If you want to create a deep copy (where each object has its own copy of the array), you would need to create a new array and copy the elements individually.
//For deep copy, you can modify the copy constructor as follows:
// Student(Student s1) {
//     marks = new int[3]; // Initializing the marks array
//     this.name = s1.name; // Copying the name from the passed object
//     this.roll= s1.roll;   // Copying the age from the passed object
//     for (int i = 0; i < s1.marks.length; i
//         this.marks[i] = s1.marks[i]; // Deep copy of the marks array
// }
// }
//This way, s1 and s2 will have their own separate copies of the marks array.

//Output:
//Constructor is called...
//Shraddha
//100
//90
//80

