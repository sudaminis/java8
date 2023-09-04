package streams.parallelstreams;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class ParallelStreamsExample {

    public static long checkPerformanceResult(Supplier<Integer> supplier, int numberOfTimes ) {
        long startTime = System.currentTimeMillis();
        for ( int i = 0; i < numberOfTimes; i++ ) {
            supplier.get();
        }
        long endTime = System.currentTimeMillis();

        return endTime - startTime;
    }

    public static int sumParallelStream() {
        return IntStream.rangeClosed(1,1000)
                .parallel().sum();
    }
    public static int sumSequentialStream() {
        return IntStream.rangeClosed(1,1000)
                .sum();
    }
    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());
        System.out.println("Check performance for parallel stream " + checkPerformanceResult(ParallelStreamsExample::sumParallelStream, 20));
        System.out.println("Check performance for sequential stream " +checkPerformanceResult(ParallelStreamsExample::sumSequentialStream, 20));
    }
}
