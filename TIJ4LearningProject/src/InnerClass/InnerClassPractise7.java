// create an class with private field and private method. create an inner class
// that it can modify the field of outer class and invoke the method.

public class InnerClassPractise7 {
    private String str = "InnerClass is abstract!";
    private void f() {
        System.out.println(str);
    }
    class Contents{
        private int i = 10;
        void change(String whereTo) {
            str = whereTo;
            f();
        }
    }
    public void print() {
        Contents c = new Contents();
        c.change("is this right?");
        System.out.println(c.i);
    }
    public static void main(String[] args) {
        InnerClassPractise7 innerClassPractise7 = new InnerClassPractise7();
        innerClassPractise7.f();
        innerClassPractise7.print();
    }
}
/**--*/