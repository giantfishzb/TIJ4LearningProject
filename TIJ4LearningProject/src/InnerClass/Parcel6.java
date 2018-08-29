// Nesting a class within a scope

public class Parcel6 {
    private void internalTracking(boolean b) {
        if(b) {
            class TrackingShip {
                private String id;
                TrackingShip(String s) {
                    id = s;
                }
                String getShip() { return id; }
            }
            TrackingShip ts = new TrackingShip("Ship");
            String s = ts.getShip();
        }
        /**Nested innerclass Can't use it here. out of scope*/
    }
    public void track() { internalTracking(true); }
    public static void main(String[] args) {
        Parcel6 parcel6 = new Parcel6();
        parcel6.track();
    }
}