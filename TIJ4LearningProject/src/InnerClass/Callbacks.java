//Using inner classes for callbacks

interface Incrementable {
    void increment();
}

// Very simple to just implement the interface
class Callee1 implements Incrementable {
    private int i = 0;
    @Override
    public void increment() {
     i++;
     System.out.println(i);
    }
}

class MyIncrement {
    public void increment() { System.out.println("Other operation"); }
    static void f(MyIncrement mi) { mi.increment(); }
}

// if your class must implement increment() in
// some other way, you must use an inner class:
class Callee2 extends MyIncrement {
    private int i = 0;
    public void increment() {
        super.increment();
        i++;
        System.out.println(i);
    }
    private class Closure implements Incrementable {
        /*Specify outer-class method,otherwise you'd get an infinite recursion*/
        @Override
        public void increment() {
          Callee2.this.increment();
      }
    }
    Incrementable getCallbackRefence() {
        return new Closure();
    }
}

class Caller {
    private Incrementable callbackRefence;
    Caller(Incrementable cbh) { callbackRefence = cbh; }
    void go() { callbackRefence.increment(); }
}
public class Callbacks {
    public static void main(String[] args) {
        Callee1 c1 = new Callee1();
        Callee2 c2 = new Callee2();
        MyIncrement.f(c2);
        Caller caller1 = new Caller(c1);
        Caller caller2 = new Caller(c2.getCallbackRefence());
        caller1.go();
        caller1.go();
        caller2.go();
        caller2.go();
    }
}
