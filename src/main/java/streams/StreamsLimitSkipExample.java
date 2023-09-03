package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsLimitSkipExample {

    private static Optional<Integer> limitSum(List<Integer> integerList) {
        return integerList.stream()
                .limit(2)
                .reduce(Integer::sum);
    }

    private static Optional<Integer> skipSum(List<Integer> list) {
        return list.stream()
                .skip(2)
                .reduce(Integer::sum);
    }

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(6,7,8,9,10);
        Optional<Integer> optionalInteger = limitSum(integerList);

        if( optionalInteger.isPresent()) {
            System.out.println("Example limit sum = " +limitSum(integerList).get());
        } else {
            System.out.println("Not found");
        }

        optionalInteger = skipSum(integerList);

        if( optionalInteger.isPresent()) {
            System.out.println("Example skip sum = " +skipSum(integerList).get());
        } else {
            System.out.println("Not found");
        }



    }
}
