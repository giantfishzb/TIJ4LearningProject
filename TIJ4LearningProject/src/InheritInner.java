// Inheriting an inner class

class WithInner {
    class Inner {}
}

public class InheritInner {
//    InheritInner(WithInner wi) {
//        wi.super();
//    }
    private class Test extends WithInner.Inner {
        public Test(WithInner x) {
            x.super();
            System.out.println("i am a little confuse about inherit inner class");
        }
    }
    public static void main(String[] args) {
        WithInner wi = new WithInner();
        InheritInner ii = new InheritInner();
        InheritInner.Test t = ii.new Test(wi);
        //InheritInner ii = new InheritInner(wi);
    }
}
