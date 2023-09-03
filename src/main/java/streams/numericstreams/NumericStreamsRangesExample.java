package streams.numericstreams;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class NumericStreamsRangesExample {
    public static void main(String[] args) {
        IntStream intStream = IntStream.rangeClosed(1,50);
        System.out.println(intStream.count());
        intStream = IntStream.rangeClosed(1,50);
        intStream.forEach(System.out::println);

        intStream = IntStream.range(1,50);
        System.out.println(intStream.count());
        intStream = IntStream.range(1,50);
        intStream.forEach(System.out::println);
        intStream = IntStream.range(1,50);
        intStream.asDoubleStream()
                .forEach(System.out::println);
    }
}
