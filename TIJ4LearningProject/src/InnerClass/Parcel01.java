// Returning a reference to an inner class
public class Parcel01 {
    class Contents {
        private int i = 11;
        public int value() {
            return i;
        }
    }
    class Destination {
        private String label;
        Destination(String whereTo) {
            label = whereTo;
        }
        String readLabel() {
            return label;
        }
    }
    public Destination to(String s) {
        return new Destination(s);
    }
    public Contents contents() {
        return new Contents();
    }
    public void ship(String dest) {
        Contents c = contents();
        Destination d = to(dest);
        System.out.println(d.readLabel());
    }
    public static void main(String[] args) {
        Parcel01 p = new Parcel01();
        p.ship("Today is so hot!");
        Parcel01 q = new Parcel01();
        Parcel01.Destination d = q.new Destination("still learning inner class!");
//        Destination dd = new Destination("is this right");
//        System.out.println(dd.readLabel());
//        Parcel01.Contents c = q.contents();
//        Parcel01.Destination d = q.to("inner class is interesting!");
//        System.out.println(d.readLabel());
    }
}
