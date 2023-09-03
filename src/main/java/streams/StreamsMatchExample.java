package streams;

import data.Student;
import data.StudentDataBase;

import java.util.List;

public class StreamsMatchExample {
    static List<Student> allStudents = StudentDataBase.getAllStudents();
    // returns true if all elements of stream match the predicate
    public static boolean allMatch() {
        return allStudents.stream()
                .allMatch(st -> st.getGpa() >= 3.9);
    }

    // returns true if any element of stream matches the predicate
    public static boolean anyMatch() {
        return allStudents.stream()
                .anyMatch(st -> st.getGpa() >= 3.5);
    }
    //returns true if none of the elements of stream match the predicate

    public static boolean noneMatch() {
        return allStudents.stream()
                .noneMatch(st -> st.getGpa() >= 7.5);
    }

    public static void main(String[] args) {
        System.out.println("all match - do all students have given gpa " + allMatch());
        System.out.println("none match - do none of the students have given gpa " + noneMatch());
        System.out.println("any match - do any of the students have given gpa " + anyMatch());
    }
}
