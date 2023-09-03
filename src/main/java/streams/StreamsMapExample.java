package streams;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsMapExample {
    static List<String> getStudentNames() {
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }
    public static void main(String[] args) {
        //collect names of students
        System.out.println("Get all student names = " +getStudentNames());

    }
}
