package streams.numericstreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamMapExample {
    public static void main(String[] args) {
        System.out.println( mapToObject() );
        System.out.println(mapToLong());
        System.out.println(mapToDouble());
    }
    public static List<Integer> mapToObject() {
        return IntStream.rangeClosed(1,5)
                .mapToObj((i) -> new Integer(i))
                .collect(Collectors.toList());
    }

    public static long mapToLong() {
        return IntStream.rangeClosed(1,5)
                .mapToLong((i)-> new Long(i))
                .sum();
    }

    public static double mapToDouble() {
        return IntStream.rangeClosed(1,5)
                .mapToDouble((i)-> new Double(i))
                .sum();
    }
}
