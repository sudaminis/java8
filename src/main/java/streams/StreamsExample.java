package streams;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsExample {

    public static void main(String[] args) {

        // create a map of student and activities
        Map<String, List<String>> studentActivities = StudentDataBase.getAllStudents().stream()
                .collect(Collectors.toMap(Student::getName, Student::getActivities));

        // get students that are in certain grade level
        List<String> studentNames = StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGradeLevel() > 3 ).map(Student::getName).collect(Collectors.toList());


        Predicate<Student> gradeFilter = ( student -> student.getGradeLevel() >= 3);
        Predicate<Student> gpaFilter = ( student -> student.getGpa() >= 3.9);

        // apply a chain of filters to get student name and a list of activities for students with grade level > 3 and gpa > 3.9
        Map<String, List<String>> filteredStudentActivities = StudentDataBase.getAllStudents().stream()
                .filter(gradeFilter)
                .filter(gpaFilter)
                .collect(Collectors.toMap(Student::getName, Student::getActivities));

        System.out.println(filteredStudentActivities);

    }
}
