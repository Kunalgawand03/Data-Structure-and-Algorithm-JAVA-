package OOPs;

public class Constructor {
    public static void main(String args[]) {
        Student s1 = new Student(); // Constructor is called here
    }
}

class Student {
    String name;
    int roll;

    Student(){        // This is a constructor     //Non-parameterized constructor
        System.out.println("Constructor called");
    }
}

//Output:
//Constructor called


//A constructor is a special method that is called when an object is instantiated. It usually initializes the object's attributes. In this example, when we create a new Student object, the constructor prints "Constructor called" to the console.
//If you do not define a constructor, Java provides a default constructor that takes no arguments and does nothing. However, if you define any constructor (with or without parameters), the default constructor is not provided automatically.

//2nd Aproach
/* 
public class Constructor {
    public static void main(String args[]) {
        Student s1 = new Student("Shraddha"); // Constructor is called here
        System.out.println(s1.name);
    }
}

class Student {
    String name;
    int roll;

    Student(String name){        // This is a constructor  //Parameterized constructor
        this.name = name;
    }
}

//Output:
//Shraddha
    */