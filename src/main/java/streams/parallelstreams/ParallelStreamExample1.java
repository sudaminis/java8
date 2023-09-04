package streams.parallelstreams;

import data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class ParallelStreamExample1 {

    public static List<String> sequentialPrintStudentActivities(){
        long startTime = System.currentTimeMillis();
        List<String> activities = StudentDataBase.getAllStudents().stream()
                .map(student -> student.getActivities())
                .flatMap(List::stream)
                .distinct()
                .sorted().collect(Collectors.toList());
        long endTime = System.currentTimeMillis();
        System.out.println("Sequential stream duration = " + ( endTime - startTime ) );
        return activities;
    }

    public static List<String> parallelPrintStudentActivities() {
        long startTime = System.currentTimeMillis();
        List<String> activities = StudentDataBase.getAllStudents().stream().parallel()
                .map(student -> student.getActivities())
                .flatMap(List::stream)
                .distinct()
                .sorted().collect(Collectors.toList());
        long endTime = System.currentTimeMillis();
        System.out.println("Parallel stream duration = " + ( endTime - startTime ) );
        return activities;

    }
    public static void main(String[] args) {
        System.out.println(parallelPrintStudentActivities());
        System.out.println(sequentialPrintStudentActivities());
    }
}
