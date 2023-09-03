package streams;

import data.Student;
import data.StudentDataBase;

import java.util.Optional;

public class StreamFindAnyFindFirstExample {

    static Optional<Student> findAnyStudent() {
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGpa() > 4.9)
                .findAny();
    }
    static Optional<Student> findFirstStudent() {
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGpa() > 3.9)
                .findFirst();
    }

    public static void main(String[] args) {
        Optional<Student> studentOptional = findAnyStudent();
        if( studentOptional.isPresent()) {
            System.out.println("Found student = " +studentOptional.get());
        } else {
            System.out.println("Did not find student");
        }
        studentOptional = findFirstStudent();
        if( studentOptional.isPresent()) {
            System.out.println("Found first student = " +studentOptional.get());
        } else {
            System.out.println("Did not find student");
        }
    }
}
