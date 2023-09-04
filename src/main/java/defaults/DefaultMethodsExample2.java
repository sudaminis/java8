package defaults;

import data.Student;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

import static data.StudentDataBase.*;

public class DefaultMethodsExample2 {

    static Consumer<Student> studentConsumer = (student -> System.out.println(student));

    static Comparator<Student> gpaComparator = Comparator.comparingDouble(Student::getGpa);
    static Comparator<Student> nameComparator = Comparator.comparing(Student::getName);
    static Comparator<Student> gradeComparator = Comparator.comparing(Student::getGradeLevel);



    public static void sortByName(List<Student> list ) {
        System.out.println("After sort by name : ");

        list.sort(nameComparator);
        list.forEach(studentConsumer);
    }

    public static void sortByGpa(List<Student> list ) {
        System.out.println("After sort by gpa : ");
        list.sort(gpaComparator);
        list.forEach(studentConsumer);
    }

    public static void comparatorChaining(List<Student> list ) {
        System.out.println("After comparator chaining : ");

        list.sort(gradeComparator.thenComparing(nameComparator));
        list.forEach(studentConsumer);
    }
    public static void main(String[] args) {
        List<Student> allStudents = getAllStudents();

        System.out.println("Before sort : ");
        allStudents.forEach(studentConsumer);
        sortByName(allStudents);

        comparatorChaining(allStudents);
    }
}
