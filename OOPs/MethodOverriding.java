package OOPs;

public class MethodOverriding {
    public static void main(String args[]) {
        Cat c1 = new Cat();
        c1.sound(); // Calls the overridden method in Cat class
        c1.eat();   // Calls the inherited method from Animal class
    }
}

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }

    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Cat extends Animal { // Cat class inherits from Animal class
    @Override
    void sound() { // Overriding the sound method
        System.out.println("The cat meows");
    }
}

//Output:
//The cat meows
//This animal eats food.
// Method Overriding is a feature in Java that allows a subclass to provide a specific implementation of a method that is already defined in its superclass. When a method in a subclass has the same name, return type, and parameters as a method in its superclass, the method in the subclass overrides the method in the superclass.
// This is useful when you want to modify or extend the behavior of a method inherited from a parent class.
