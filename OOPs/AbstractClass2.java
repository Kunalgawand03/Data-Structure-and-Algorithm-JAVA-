//1st and 2nd property

package OOPs;

public class AbstractClass2 {
    public static void main(String[] args) {
        Chicken chicken = new Chicken();
        // When a Horse object is created, the constructor of the Animal class is called first
        // followed by the constructor of the Horse class.

        //Animal -> Horse -> Chicken
    }
}

abstract class Animal {
    String color;

    Animal() {
        System.out.println("Animal constructor called");
    }

    void eat() {
        System.out.println("Animal eats");
    }
    abstract void walk();
}

class Horse extends Animal {

    Horse() {
        System.out.println("Horse constructor called");
    }

    void walk() {
        System.out.println("Horse walks on four legs");
    }
}

class Chicken extends Animal {

    Chicken() {
        System.out.println("Chicken constructor called");
    }

    void walk() {
        System.out.println("Walks on 2 legs");
    }
}


///Output:
/// Animal constructor called
/// Horse constructor called    
/// Chicken constructor called


/// When a Horse object is created, the constructor of the Animal class is called first
/// followed by the constructor of the Horse class.


