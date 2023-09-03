package streams;

import data.Student;
import data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamsComparatorExample {

    public static void main(String[] args) {
        // students sorted by name
        getStudentsSortedByFirstName().forEach(System.out::println);

        // students sorted by gpa in ascending order
        getStudentsSortedByGpaDescending().forEach(System.out::println);

        // students sorted by gpa in descending order
        getStudentsSortedByGpaAscending().forEach(System.out::println);
    }

    private static List<Student> getStudentsSortedByGpaAscending() {
        return StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getGpa).reversed())
                .collect(Collectors.toList());

    }

    private static List<Student> getStudentsSortedByGpaDescending() {
        return StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getGpa))
                .collect(Collectors.toList());
    }

    private static List<Student> getStudentsSortedByFirstName() {
        return StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getName))
                .collect(Collectors.toList());
    }
}
