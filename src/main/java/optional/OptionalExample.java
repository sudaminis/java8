package optional;

import data.Student;
import data.StudentDataBase;

import java.util.Optional;

public class OptionalExample {
    public static String getStudentName() {
        Student student = StudentDataBase.studentSupplier.get();
        if( student != null ) {
            return student.getName();
        } else {
            return null;
        }

    }

    public static Optional<String> getStudentNameOptional() {
        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        if(studentOptional.isPresent()) {
            return studentOptional.map(Student::getName);
        }
        return Optional.empty();
    }
    public static void main(String[] args) {
        String studentName = getStudentName();
        if( studentName != null ) {
            System.out.println("Name length = " +studentName.length());
        }
        Optional<String> studentNameOptional = getStudentNameOptional();
        if(studentNameOptional.isPresent()) {
            System.out.println("Length = " +studentNameOptional.get().length());
        } else {
            System.out.println("Not present");
        }
    }
}
