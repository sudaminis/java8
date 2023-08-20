package optional;

import java.util.Optional;

public class OptionalPresentExample {


    //ifPresent
    public static void main(String[] args) {
        //isPresent
        Optional<String> optional = Optional.ofNullable("Hello optional");
        System.out.println(optional.isPresent());
        if(optional.isPresent()) {
            System.out.println("it is present");
        }
        //ifPresent will tell you value present or not and gives you additional operation choice
        optional.ifPresent(s-> System.out.println(s.toLowerCase()));

    }
}
