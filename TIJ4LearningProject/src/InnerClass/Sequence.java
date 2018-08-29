// Holds a sequence of objects

interface Selector2 {
    void reverseSelector(Object x);
    boolean end();
    Object current();
    void next();
}
public class Sequence {
    private Object[] items;
    private int next = 0;
    public Sequence(int size) {
        items = new Object[size];
    }
    public void add(Object x) {
        if(next < items.length) {
            items[next++] = x;
        }
    }
    private class SequenceSelector implements Selector2 {
        private int i = 0;
        private int j = 0;
        public void reverseSelector(Object x) {
            if(j < items.length ) {
                items[items.length - (j++) - 1] = x;
            }
        }
        public boolean end() { return i == items.length; }
        public Object current() { return items[i]; }
        public void next() {
            if(i < items.length) {
                i++;
            }
        }
        public Sequence outerInstance() {
            return Sequence.this;
        }
    }
    public Selector2 selector2() {
        return new SequenceSelector();
    }
    public static void main(String[] args) {
        Sequence sequence = new Sequence(10);
//        for (int i = 0; i < 10; i++) {
//            sequence.add(i);
//        }
        Selector2 selector2 = sequence.selector2();
        for(int i = 0; i < 10; i++) {
            selector2.reverseSelector(i);
        }
        while(!selector2.end()) {
            System.out.println(selector2.current() + " ");
            selector2.next();
        }
    }
}
