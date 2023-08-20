package functionalinterfaces;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;


public class ConsumerExample {

    static List<Student> allStudents = StudentDataBase.getAllStudents();
    static Consumer<Student> c2 = (student) -> System.out.println(student);
    static Consumer<Student> c3 = (student -> System.out.println(student.getName()));
    static Consumer<Student> c4 = (student -> System.out.println(student.getActivities()));

    public static void main(String[] args) {

        Consumer<String> consumer =
                (s) -> System.out.println(s.toLowerCase());

        consumer.accept("IAMUPPERCASE");
       printName();
       printNameAndActivities();
       printNameAndActivitiesUsingCondition();


    }

    private static void printNameAndActivitiesUsingCondition() {
        System.out.println("Printing name and activities using condition");
        allStudents.forEach(student -> {
            if(student.getGradeLevel() > 3 && student.getGpa() > 3) {
                c3.andThen(c4).accept(student);
            }
        });
        System.out.println("-----------------------------");
    }

    public static void printName() {
        System.out.println("Printing name");
        allStudents.forEach(c2);
        System.out.println("-----------------------------");
    }

    public static void printNameAndActivities() {
        System.out.println("Printing name and activities");
        allStudents.forEach(c3.andThen(c4)); // consumer chaining
        System.out.println("-----------------------------");
    }



}
