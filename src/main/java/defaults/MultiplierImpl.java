package defaults;

import java.util.List;

public class MultiplierImpl implements Multiplier {

    @Override
    public int multiply(List<Integer> integerList) {
        return integerList.stream()
                .reduce(1, (a,b) -> a * b);
    }

    public int size(List<Integer> list) {
        System.out.println("Inside impl class");
        return list.size();
    }
}
