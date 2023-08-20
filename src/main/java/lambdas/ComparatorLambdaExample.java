package lambdas;

import java.util.Comparator;

public class ComparatorLambdaExample {
    public static void main(String[] args) {
        //prior java 8
        Comparator<Integer> comparator = (o1, o2) -> o1.compareTo(o2);
        System.out.println("Result = " +comparator.compare(3,4));

        Comparator<Integer> comparatorLambda =
                Integer::compareTo;

        System.out.println("Result using lambda = " +comparatorLambda.compare(3,4));
    }
}

