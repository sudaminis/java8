package streams;

import data.Student;
import data.StudentDataBase;

import java.util.List;

public class StreamsMapReduceExample {

    private static int noOfNotebooks1() {
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGradeLevel() >= 3)
                .filter(student -> student.getGender().equalsIgnoreCase("female"))
                .map(Student::getNoteBooks)
                .reduce(0, (a, b) -> a + b);
    }
    public static void main(String[] args) {
        System.out.println(noOfNotebooks1());
        System.out.println(noOfNotebooks2());
    }

    private static int noOfNotebooks2() {
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getNoteBooks)
                .reduce(0, Integer::sum);
    }
}
