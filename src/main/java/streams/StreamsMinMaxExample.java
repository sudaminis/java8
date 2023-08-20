package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsMinMaxExample {

    private static int getMax(List<Integer> integers) {
        return integers.stream()
                .reduce(0,(a,b)-> a>b ? a:b);
    }

    //optional handles empty list
    private static Optional<Integer> getMaxOptional(List<Integer> integers) {
        return integers.stream()
                .reduce((a,b)-> a>b ? a:b);
    }

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(6,7,8,9,10);
        System.out.println(getMax(integerList));

        integerList = new ArrayList<>();
        Optional<Integer> integerOptional = getMaxOptional(integerList);
        if( integerOptional.isPresent()) {
            System.out.println("Got max = " +integerOptional.get());
        } else {
            System.out.println("Max not found" +
                    "");
        }

    }
}
