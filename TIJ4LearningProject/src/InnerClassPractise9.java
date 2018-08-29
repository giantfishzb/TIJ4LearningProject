//

public class InnerClassPractise9 {
    private ExerciseInterface9 f() {
        class TrackShip implements ExerciseInterface9 {
            private String s = "buyticket";
            @Override
            public String ship() {
                return s;
            }
            @Override
            public void ticketPrint() {
                System.out.println(s);
            }
        }
        return new TrackShip();
    }
    public static void main(String[] args) {
        InnerClassPractise9 innerClassPractise9 = new InnerClassPractise9();
        innerClassPractise9.f().ticketPrint();
    }
}
