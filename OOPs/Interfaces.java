package OOPs;

public class Interfaces {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.move();
    }
}

interface Chessplayer {
    void move();
}

class Queen implements Chessplayer {

    public void move() {
        System.out.println("Queen moves in all directions");
    }
}   

class Rook implements Chessplayer {

    public void move() {
        System.out.println("Rook moves in straight line");
    }
}

class King implements Chessplayer {

    public void move() {
        System.out.println("King moves one step in any direction");
    }
}


//Output:
// Queen moves in all directions
// When a Horse object is created, the constructor of the Animal class is called first
// followed by the constructor of the Horse class.
// Animal -> Horse -> Chicken

//Interfaces are used to achieve abstraction and multiple inheritance in Java.
// An interface is a collection of abstract methods (methods without a body).   
