package streams;

import data.Student;
import data.StudentDataBase;

import java.util.List;

public class StreamsMatchExample {
    static List<Student> allStudents = StudentDataBase.getAllStudents();
    public static boolean allMatch() {
        return allStudents.stream()
                .allMatch(st -> st.getGpa() >= 3.5);
    }

    public static boolean anyMatch() {
        return allStudents.stream()
                .anyMatch(st -> st.getGpa() >= 3.5);
    }

    public static boolean noneMatch() {
        return allStudents.stream()
                .noneMatch(st -> st.getGpa() >= 7.5);
    }



    public static void main(String[] args) {
        //anyMatch
        // returns true if any one of the stream elements matches the predicate
        // returns true if all of the stream elements match the predicate
        // returns true if none of the stream elements match the predicate
        System.out.println("all match " + allMatch());
        System.out.println("none match " + noneMatch());
        System.out.println("any match " + anyMatch());
    }
}
