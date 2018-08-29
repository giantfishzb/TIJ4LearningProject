// Create a class with a non-default constructor and no default constructor.
// Create a second class that has a method that returns a reference to an
// object of the first class. Create the object that you return by making an
// anonymous inner class that inherits from the first class.

class Rain {
    private String label;
    public Rain(String wherTo) {
        label = wherTo;
    }
    public String readLabel() { return label; }
}
public class InnerClassExercise15 {
    Rain rain() {
        return new Rain("heavy") {
            private void f() {}
        };
    }
    public static void main(String[] args) {
        InnerClassExercise15 inner15 = new InnerClassExercise15();
        System.out.println(inner15.rain().readLabel());
    }
}
