/* Create an interface that contains a nested class that has a static method that
 * calls the methods of your interface and displays the results. Implement your
 * interface and pass an instance of your implementation to the method.
 */


/**--This is my answer
 * public interface InnerClassExercise21 {
    void f();
    class NestedClass implements InnerClassExercise21 {
        @Override
        public static void f() {
            { System.out.println("Nested class!"); }
        }
        public static void g(NestedClass nc) {
            f();
        }
    }
}*/


interface StarSea {
    void f();
    void g();
    class StarSeaBridge {
       static void d(StarSea starSea) {
            starSea.f();
        }
    }
}
public class InnerClassExercise21 implements StarSea {

    @Override
    public void f() {
        System.out.println("StarSea park is so beautiful!");
    }

    @Override
    public void g() {

    }
    public static void main(String[] args) {
        InnerClassExercise21 innerClassExercise21 = new InnerClassExercise21();
        StarSea.StarSeaBridge.d(innerClassExercise21);
    }
}
