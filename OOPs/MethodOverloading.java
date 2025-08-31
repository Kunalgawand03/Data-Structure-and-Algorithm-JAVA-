package OOPs;

public class MethodOverloading {
    public static void main(String args[]) {
        MathOperation mo = new MathOperation();
        System.out.println(mo.add(5, 10));          // Calls the first add method
        System.out.println(mo.add(5.5, 10.5));      // Calls the second add method
        System.out.println(mo.add(5, 10, 15));      // Calls the third add method
    }
}

class MathOperation {
    // Method to add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add two doubles
    double add(double a, double b) {
        return a + b;
    }

    // Overloaded method to add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }
}


//Output:
//15
//15.0
//30
// Method Overloading is a feature in Java that allows a class to have more than one method with the same name, but with different parameter lists (different type, number, or both). The correct method to be called is determined at compile time based on the arguments passed to the method.
