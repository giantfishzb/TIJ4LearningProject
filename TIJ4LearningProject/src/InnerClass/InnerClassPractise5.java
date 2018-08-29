// Page 194
// Create a class with an inner class. In a separate class, make an instance
// of the inner class

/**---Maybe this another answer
class OtherClass {
    InnerClassPractise5 innerClassPractise5 = new InnerClassPractise5();
    InnerClassPractise5.Contents ct = innerClassPractise5.contents();
    public void f() {
        System.out.println("InnerClass's instance " + ct.value());
    }
}
public class InnerClassPractise5 {
    class Contents{
        private int i = 10;
        public int value() {
            return i;
        }
    }
    public Contents contents() {
        return new Contents();
    }
    public static void main(String[] args) {
        OtherClass otherClass = new OtherClass();
        otherClass.f();
    }
}
*/
/**--this is standard answer*/
class Outer{
    class Inner{
        Inner() {
            System.out.println("Outer.Inner()");
        }
    }
}
public class InnerClassPractise5{
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner outi = outer.new Inner();
        }
}
