package streams;

import data.Student;
import data.StudentDataBase;

import java.util.List;

public class StreamsFindExample {
    static List<Student> allStudents = StudentDataBase.getAllStudents();

    public static Student findAny() {
        return allStudents.stream().filter(student->student.getGpa()>=3.9).findAny().get();
    }

    public static Student findFirst() {
        return allStudents.stream().filter(student->student.getGpa()>=3.5).findFirst().get();
    }
    public static void main(String[] args) {
        System.out.println("Find any = " +findAny());
        System.out.println("Find first = "+findFirst());
    }
}
