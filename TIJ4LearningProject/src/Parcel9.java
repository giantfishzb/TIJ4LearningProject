// An anonymous inner class that performs
// initialization. A briefer version of Parcel5.java

public class Parcel9 {
    /**Argument must be final to use inside anonymous inner class*/
    public Contents destination(int dt) {
        return new Contents() {
            @Override
            public int value() {
                return  dt;
            }
        };
    }
    public static void main(String[] args) {
        Parcel9 p9 = new Parcel9();
        Contents de = p9.destination(10);
        System.out.println(de.value());
    }
}
/** A variable or parameter whose value is never changed after it is initialized is effectively final.
 *  but in JDK 8 and later final is not necessary*/