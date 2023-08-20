package functionalinterfaces;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {
    public static void main(String[] args) {
        BiConsumer<String,String> biConsumer =
                (a,b) -> System.out.println("A = " +a+ " and B = " +b);
        biConsumer.accept("String a", "String b");

        BiConsumer<Integer, Integer> multiply =
                ( i1, i2) -> System.out.println( "Multiplication of two numbers is " + Math.multiplyExact(i1,i2));

        BiConsumer<Integer, Integer> divide =
                ( i1, i2) -> System.out.println( "Division of two numbers is " +i1/i2);

        multiply.andThen(divide).accept(10,5);

        nameAndActivities();

    }

    public static void nameAndActivities() {
        BiConsumer<String,List<String>> biConsumer = ( name,activities) ->
                System.out.println("Name = " +name+ " activities = " +activities);
        List<Student> allStudents = StudentDataBase.getAllStudents();
        allStudents.forEach(student -> biConsumer.accept(student.getName(),student.getActivities()));

    }
}
