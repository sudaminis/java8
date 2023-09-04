package streams.parallelstreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ParallelStreamBoxedExample {

    public static int sequentialSum(List<Integer> list) {
        long start = System.currentTimeMillis();
        int sum = list.stream().reduce(0,(a,b)->a+b);
        long end = System.currentTimeMillis();
        System.out.println("Duration in sequential = " + ( end - start));
        return sum;
    }

    public static int parallelSum(List<Integer> list) {
        long start = System.currentTimeMillis();
        int sum = list.stream().parallel().reduce(0,(a,b)->a+b);
        long end = System.currentTimeMillis();
        System.out.println("Duration in parallel = " + ( end - start));
        return sum;
    }

    public static void main(String[] args) {

        List<Integer> integerList = IntStream.rangeClosed(1,10000)
                .boxed().collect(Collectors.toList());

        System.out.println(parallelSum(integerList));
        System.out.println(sequentialSum(integerList));

    }
}
