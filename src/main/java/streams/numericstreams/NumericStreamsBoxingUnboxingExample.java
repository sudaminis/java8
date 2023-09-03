package streams.numericstreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamsBoxingUnboxingExample {
    public static void main(String[] args) {
        List<Integer> wrapper =  boxing();
        System.out.println( unboxing(wrapper) );
    }

    public static List<Integer> boxing(){
        //conversion of int to Integer
        return IntStream.rangeClosed(1,10).boxed()
                .collect(Collectors.toList());
    }

    public static int unboxing(List<Integer> integerList) {
        //wrapper class to primitive conversion
        return integerList.stream()
                .mapToInt(Integer::intValue).sum();
    }

}
