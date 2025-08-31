package OOPs;

public class HirarchialInheritance {
    public static void main(String args[]) {
        Dog d = new Dog();
        d.bark();
        d.eat();

        Cat c = new Cat();
        c.meow();
        c.eat();
    }
}
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}
class Cat extends Animal {
    void meow() {
        System.out.println("The cat meows.");
    }
}
//Output:
//The dog barks.
//This animal eats food.
//The cat meows.
//This animal eats food.
// Hierarchical inheritance is a type of inheritance in object-oriented programming where multiple subclasses inherit from a single superclass. This allows the subclasses to share common attributes and behaviors defined in the superclass while also having their own unique features.
