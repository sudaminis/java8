package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsLimitSkipExample {

    private static Optional<Integer> limit(List<Integer> integerList) {
        return integerList.stream()
                .limit(2)
                .reduce(Integer::sum);
    }

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(6,7,8,9,10);
        Optional<Integer> optionalInteger = limit(integerList);

        if( optionalInteger.isPresent()) {
            System.out.println(limit(integerList).get());
        } else {
            System.out.println("Not found");
        }

    }
}
