package optional;

import data.Bike;
import data.Student;
import data.StudentDataBase;

import java.util.Optional;

public class OptionalMapFlatMapExample {

    //filter - apply filter operations on optional object
    public static void optionalFilter() {
        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        studentOptional.filter(student -> student.getGpa() > 3.0).ifPresent(student -> System.out.println(student));
    }

    //flatMap
    public static void optionalFlatMap() {
        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        Optional<String> name = studentOptional.filter(student -> student.getGpa() > 2.0)
                .flatMap(student -> student.getBike())
                .map(Bike::getName); //returns Optional of bike
        System.out.println("Bike name " +name);
        if(name.isPresent()) {
            System.out.println("Bike name = " +name);
        }

    }


    //map
    public static void optionalMap() {
        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        if( studentOptional.isPresent() ){
            System.out.println( studentOptional.map(student -> student.getName()).get() );
        }
    }
    public static void main(String[] args) {
        optionalFilter();
        optionalMap();
        optionalFlatMap();
    }
}
