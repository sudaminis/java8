package defaults;

public interface Interface2 extends Interface1 {

    default void methodB() {
        System.out.println("Inside method B");
    }

    // at runtime, java will resolve to child implementation
    default void methodA() {
        System.out.println("Inside method A " + Interface2.class);
    }
}
