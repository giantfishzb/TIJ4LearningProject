// Using "instance initialization" to perform
// construction on an anonymous inner clas.

public class Parcel10 {
    public Destination
    destination(String dest, float price) {
        return new Destination() {
            private int cost;
            {
                cost = Math.round(price);
                if(cost > 100) {
                    System.out.println("Over budget!");
                }
            }
            private String label = dest;
            @Override
            public String readLabel() {
                return label;
            }
        };
    }
    public static void main(String[] args) {
        Parcel10 p10 = new Parcel10();
        Destination d = p10.destination("interesting", 101.56f);
    }
}
