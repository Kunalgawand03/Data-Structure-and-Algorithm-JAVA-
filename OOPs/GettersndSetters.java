package OOPs;

public class GettersndSetters {
    public static void main(String args[]) {
        Pen p1 = new Pen();                  
        p1.setColor("Blue");
        System.out.println(p1.getColor());  // Using getter to access private attribute
        p1.setTip(5);        // Setting the tip using setter
        System.out.println(p1.getTip());     // Using getter to access private attribute
 
    }
}

class Pen {
    private String color;
    private int tip;

    String getColor() {    
        return this.color;  // Getter method for color
    }
     
    int getTip() { 
        return this.tip;
    }

    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }
}


//Output:
//Blue
//5
//Here, we have made the attributes color and tip private and provided public getter methods getColor() and getTip() to access their values. This encapsulation ensures that the internal state of the Pen object can only be modified through its setter methods, maintaining control over how the attributes are accessed and modified.
