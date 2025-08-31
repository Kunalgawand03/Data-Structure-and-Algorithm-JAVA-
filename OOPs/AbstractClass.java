//1st and 2nd property

package OOPs;

public class AbstractClass {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.eat();
        horse.walk();

        Chicken chicken = new Chicken();
        chicken.eat();
        chicken.walk();
    }
}

abstract class Animal {
    
    void eat() {
        System.out.println("Animal eats");
    }
    abstract void walk();
}

class Horse extends Animal {
    void walk() {
        System.out.println("Horse walks on four legs");
    }
}

class Chicken extends Animal {
    void walk() {
        System.out.println("Walks on 2 legs");
    }
}


// Abstract class cannot be instantiated directly

//We can't create objects of abstract class
//EX, Animal a = new Animal(); // Not Allowed

//Output:
//Animal eats
//Horse walks on four legs
//Animal eats
//Walks on 2 legs

