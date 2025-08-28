package OOPs;

public class ClassesndObjects {
    
    public static void main(String args[]) {
        Pen p1 = new Pen(); // Instantiating a Pen object
        p1.setColor("Blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
    }
}

class Pen {
    String color;
    int tip;

    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }
}

class Student {
    String name;
    int age;
    float percentage;

    void calcPercentage(int phy, int chem, int math) {
        percentage = (phy + chem + math) / 3;
    }
}

// Class vs Object
// Class is a blueprint or template for creating objects. It defines the properties (attributes) and behaviors (methods) that the objects created from the class will have.
// An object is an instance of a class. It is created based on the structure defined by
// the class and can hold specific values for the properties defined in the class.
// For example, in the code above, Pen is a class, and p1 is an object of the Pen class.
// Similarly, Student is a class, and we can create multiple objects of the Student class, each representing a different student with their own name, age, and percentage.
// In summary, a class is a blueprint, while an object is a specific instance of that blueprint.

//Output:
// Blue
