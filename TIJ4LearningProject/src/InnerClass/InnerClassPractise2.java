// TIJ innerClasses exercise2 Page349
class Word{
    private String text;
    public Word(String label) {
        text = label;
    }
    public String toString() {
        return text;
    }
}

interface Selector{
    boolean end();
    Object current();
    void next();
}

public class InnerClassPractise2 {
    private Object[] items;
    private int next = 0;
    public InnerClassPractise2(int size) {
        items = new Object[size];
    }
    public void add(Object x) {
        if(next < items.length) {
            items[next++] = x;
        }
    }
    private class SequenceSelector implements Selector {
        private int i = 0;
        public boolean end() {
            return i == items.length;
        }
        public Object current() {
            return items[i];
        }
        public void next() {
            if(i < items.length) { i++;}
        }
    }
    public Selector selector() {return new SequenceSelector();}
    public static void main(String[] args) {
        InnerClassPractise2 innerClassPractise2 = new InnerClassPractise2(10);
        //InnerClassPractise2.SequenceSelector sequenceSelector = innerClassPractise2.new SequenceSelector();
        for(int i = 0; i < 10; i++) {
            innerClassPractise2.add(new Word(Integer.toString(i)));
        }
        Selector selector = innerClassPractise2.selector();
        while(!selector.end()) {
            System.out.println(selector.current());
            selector.next();
        }
        Word w1 = new Word("message1");
        Word w2 = new Word("message2");
        Word w3 = new Word("message3");
        InnerClassPractise2 innerClassPractise21 = new InnerClassPractise2(3);
        innerClassPractise21.add(w1);
        innerClassPractise21.add(w2);
        innerClassPractise21.add(w3);
        InnerClassPractise2.SequenceSelector selector1 = innerClassPractise21.new SequenceSelector();
        while (!selector1.end()) {
            System.out.println(selector1.current());
            selector1.next();
        }
    }
}
