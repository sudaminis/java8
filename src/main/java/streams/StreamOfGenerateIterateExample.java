package streams;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamOfGenerateIterateExample {

    public static void main(String[] args) {
        Stream<String> streamOfString = Stream.of("A","B","C");
        streamOfString.forEach(System.out::println);
        Stream.iterate(1,x->x*3).forEach(System.out::println);
        Stream.iterate(1,x->x*3).limit(10).forEach(System.out::println);

        Supplier<Integer> integerSupplier = new Random()::nextInt;
        Stream.generate(integerSupplier).limit(10).forEach(System.out::println);
    }
}
