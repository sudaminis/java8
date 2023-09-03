package streams.numericstreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class NumericStreamsExample {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6);
        System.out.println(sumOfIntegers(integerList));
        System.out.println(sumOfIntegersUsingIntStream());
    }

    public static int sumOfIntegersUsingIntStream() {
        return IntStream.rangeClosed(1,6).sum();
    }

    private static int sumOfIntegers(List<Integer> integerList) {
        // performs unboxing of wrapper class. extra efforts.
        return integerList.stream().reduce(0,(a,b)->a+b).intValue();
    }


}
