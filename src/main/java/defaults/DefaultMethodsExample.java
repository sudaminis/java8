package defaults;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DefaultMethodsExample {

    public static void main(String[] args) {

        /*
        Sort list of names in alphabetical order
         */

        List<String> stringList = Arrays.asList("Adam", "Jenny", "Alex", "Dan", "Mike", "Erik");
        /*
        Prior Java 8
         */
        Collections.sort(stringList);
        System.out.println("Sorted list using collections.sort prior java 8 = " +stringList);

        /*
        Java 8
         */
        stringList = Arrays.asList("Adam", "Jenny", "Alex", "Dan", "Mike", "Erik");
        stringList.sort(Comparator.naturalOrder());
        System.out.println("Sorted list using collections.sort java 8 = " +stringList);
        stringList.sort(Comparator.reverseOrder());
        System.out.println("Sorted list using collections.sort reverse order java 8 = " +stringList);

    }
}
