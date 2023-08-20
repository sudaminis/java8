package streams;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsExample {

    public static void main(String[] args) {
        Map<String, List<String>> map = StudentDataBase.getAllStudents()
                .stream().filter(student->student.getGradeLevel() >= 3).
                collect(Collectors.toMap(Student::getName,Student::getActivities));

        System.out.println("Map = " +map);

        //enhance this use case by creating a predicate of student
        Predicate<Student> grade = (s) -> s.getGradeLevel() >= 3;

        Map<String, List<String>> map1 = StudentDataBase.getAllStudents()
                .stream().filter(grade).
                collect(Collectors.toMap(Student::getName,Student::getActivities));

        System.out.println("Map1 = " +map1);

        // map method to change the type of stream from one type to another
        // flatmap method converts one type to another
        // used where each element of stream is a collection or an array

    }
    public static List<String> getAllStudentNames() {
        return StudentDataBase.getAllStudents().stream().map(Student::getName)
                .map(String::toUpperCase).collect(Collectors.toList());
    }
}
