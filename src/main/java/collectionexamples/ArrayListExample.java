package collectionexamples;

import java.util.*;

public class ArrayListExample {

    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        List<Integer> myList1 = new ArrayList<>(myList);

        TreeSet<Integer> mySet = new TreeSet<>();
        mySet.addAll(Set.of(100,24,44,67,8,-10,0));
        System.out.println(mySet);
        System.out.println( mySet.ceiling(25) );
        System.out.println( mySet.floor(25) );

        System.out.println( mySet.add(101) );



    }
}
