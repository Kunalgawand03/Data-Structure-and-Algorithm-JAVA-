package OOPs;

public class StaticKey {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.schoolName = "ABC School";
        
        Student s2 = new Student();
        System.out.println(s2.schoolName); // Output: ABC School
    }
}

class Student {
    String name;
    int rollno;

    static String schoolName;
    
    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }
}
   
//Output:
// ABC School
// Static keyword is used to create class-level variables and methods.
// Static members belong to the class rather than to any specific instance of the class.
// This means that all instances of the class share the same static variable or method.
// In the example above, schoolName is a static variable, so when we change it using one instance (s1),
// the change is reflected when we access it using another instance (s2).


    
