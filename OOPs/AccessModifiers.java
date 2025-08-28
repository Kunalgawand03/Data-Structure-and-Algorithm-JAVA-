package OOPs;

public class AccessModifiers {
    
    public static void main(String args[]) {
        Pen p1 = new Pen(); // Instantiating a Pen object
        p1.setColor("Blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);

        BankAccount myAccount = new BankAccount();
        myAccount.username = "user123"; // Allowed: username is public
        // myAccount.password = "mypassword"; // Not Allowed: password is private
        myAccount.setPassword("mypassword"); // Allowed: using public method to set private variable
    }
}

class BankAccount {
    public String username;
    private String password;

    public void setPassword(String pwd) {
        password = pwd;
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




