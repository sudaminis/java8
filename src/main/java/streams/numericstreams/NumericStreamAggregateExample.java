package streams.numericstreams;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamAggregateExample {
    public static void main(String[] args) {
       int sum =  IntStream.rangeClosed(1,15).sum();
       OptionalInt optionalInt = IntStream.rangeClosed(1,50).max();
       if( optionalInt.isPresent()) {
           System.out.println(optionalInt.getAsInt());
       }
        OptionalLong optionalLong = LongStream.rangeClosed(50,100).min();
       if( optionalLong.isPresent()) {
           System.out.println(optionalLong.getAsLong());
       }

       OptionalDouble optionalDouble = IntStream.rangeClosed(1,50).average();
       if( optionalDouble.isPresent()) {
           System.out.println(optionalDouble.getAsDouble());
       }
    }


}
