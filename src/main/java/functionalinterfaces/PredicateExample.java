package functionalinterfaces;

import java.util.function.Predicate;

public class PredicateExample {

    static Predicate<Integer> isEven = (i1) -> i1 % 2 == 0;
    static Predicate<Integer> isDivisibleByFive = (i1) -> i1 % 5 == 0;

    public static void main(String[] args) {

        System.out.println(isEven.test(30));
        predicateAnd();
        predicateOr();
        predicateNegate();
    }

    public static void predicateNegate() {
        System.out.println(isEven.and(isDivisibleByFive).negate().test(20));
    }
    public static void predicateAnd() {
        System.out.println(isEven.and(isDivisibleByFive).test(20));
    }

    public static void predicateOr() {
        System.out.println(isEven.or(isDivisibleByFive).test(7));
    }

}
