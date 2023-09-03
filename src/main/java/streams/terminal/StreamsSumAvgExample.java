package streams.terminal;

import data.Student;
import data.StudentDataBase;

import java.util.stream.Collectors;

public class StreamsSumAvgExample {
    // perform summation of all notebooks
    public static int getSum() {
        return StudentDataBase.getAllStudents().stream()
                .collect(Collectors.summingInt(Student::getNoteBooks));
    }

    public static double getAvg() {
        return StudentDataBase.getAllStudents().stream()
                .collect(Collectors.averagingInt(Student::getNoteBooks));
    }
    public static void main(String[] args) {
        System.out.println("Total number of notebooks " + getSum());
        System.out.println("Average number of notebooks " +getAvg());
    }
}
