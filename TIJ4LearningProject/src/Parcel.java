// Creating inner classes
public class Parcel {
    class Contents {
        private int i = 11;

        public int value() {
            return i;
        }
    }
    class Destionation {
            private String label;
            Destionation(String whereTo) {
                label = whereTo;
            }
            String readLabel() {
                return label;
            }
    }
    // using inner classes looks just like
    // just any other class,within Parcell
    public void ship(String dest) {
        Contents c = new Contents();
        Destionation d = new Destionation(dest);
        System.out.println(d.readLabel());
    }
    public static void main(String[] args) {
        Parcel p = new Parcel();
        p.ship("I really wanna focus on coding for all my life!");
    }
}
