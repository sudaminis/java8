package streams.parallelstreams;

import java.util.stream.IntStream;

// if you have a mutable variable, do not use parallel streams at all.
// because it will give incorrect results.
public class SumClient {
    public static void main(String[] args) {
        Sum sum = new Sum();
        IntStream.rangeClosed(1,1000)
                .parallel().forEach(sum::performSum);

        System.out.println(sum.getTotal());
    }
}
