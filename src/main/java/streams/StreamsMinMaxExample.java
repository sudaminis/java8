package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsMinMaxExample {



    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(6,7,8,9,10);
        System.out.println("Got max value = " +findMaxValue(integerList));
        System.out.println("Got min value = " +findMinValue(integerList));

        Optional<Integer> integerOptional = getMaxOptional(integerList);
        if( integerOptional.isPresent()) {
            System.out.println("Got max = " +integerOptional.get());
        } else {
            System.out.println("Max not found" +
                    "");
        }

        integerOptional = getMinOptional(integerList);
        if( integerOptional.isPresent()) {
            System.out.println("Got min= " +integerOptional.get());
        } else {
            System.out.println("Min not found" +
                    "");
        }



    }

    private static Optional<Integer> getMaxOptional(List<Integer> integerList) {
        return integerList.stream()
                .reduce((a,b)->a>b?a:b);
    }

    private static int findMaxValue(List<Integer> integerList) {
        //x  holds max value from the result of the function
        //y holds value from stream
        //6 7 8 9 10
        return integerList.stream()
                .reduce(0, (x,y) -> x > y? x :y);
    }

    private static Optional<Integer> getMinOptional(List<Integer> integerList) {
        return integerList.stream()
                .reduce((a,b)->a<b?a:b);
    }

    private static int findMinValue(List<Integer> integerList) {
        //x  holds max value from the result of the function
        //y holds value from stream
        //6 7 8 9 10
        return integerList.stream()
                .reduce(0, (x,y) -> x < y? x :y);
    }
}
