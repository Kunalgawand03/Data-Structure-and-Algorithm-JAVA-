package OOPs;

public class SuperKey {
    Horse horse = new Horse();
}

class Animal {
    Animal() {
        System.out.println("Animal constructor called");
    }
}

class Horse extends Animal {
    Horse() {
        super(); // Calls the constructor of the parent class (Animal)
        System.out.println("Horse constructor called");
    }
}

//Output:
// Animal constructor called
// Horse constructor called

// When a Horse object is created, the constructor of the Animal class is called first
// followed by the constructor of the Horse class.

