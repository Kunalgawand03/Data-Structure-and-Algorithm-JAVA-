package OOPs;

public class Inheritance {
    public static void main(String args[]) {
        Dog d1 = new Dog();
        d1.bark(); // Calling method from Dog class
        d1.eat();  // Calling inherited method from Animal class
    }
}

class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal { // Dog class inherits from Animal class
    void bark() {
        System.out.println("The dog barks.");
    }
}

//Output:
//The dog barks.
//This animal eats food.
// Inheritance is a fundamental concept in object-oriented programming (OOP) that allows a new class (called a subclass or derived class) to inherit properties and behaviors (attributes and methods) from an existing class (called a superclass or base class). This promotes code reusability and establishes a hierarchical relationship between classes.
// In this example, we have a base class Animal with a method eat(). The Dog class
// extends the Animal class, meaning it inherits the eat() method from Animal. The Dog class also has its own method bark().
// When we create an object of the Dog class (d1), we can call both the bark() method (specific to Dog) and the eat() method (inherited from Animal). This demonstrates how inheritance allows the Dog class to reuse code from the Animal class while also adding its own unique functionality.

