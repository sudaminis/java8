package streams.terminal;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.partitioningBy;
import static java.util.stream.Collectors.toSet;

public class StreamsPartitioningByExample {
    public static void partitioningByExample() {

        Predicate<Student> gpaPredicate = student -> student.getGpa() >= 3.8;

        Map<Boolean, List<Student>> partitioningMap =
        StudentDataBase.getAllStudents().stream()
                .collect(partitioningBy(gpaPredicate));

        System.out.println("Partitioning by example ");
        System.out.println(partitioningMap);
    }

    public static void partitioningByExample_1() {

        Predicate<Student> gpaPredicate = student -> student.getGpa() >= 3.8;

        Map<Boolean, Set<Student>> partitioningMap =
                StudentDataBase.getAllStudents().stream()
                        .collect(partitioningBy(gpaPredicate,toSet()));

        System.out.println("Partitioning by example_1 ");
        System.out.println(partitioningMap);
    }

    public static void main(String[] args) {
        partitioningByExample();
        partitioningByExample_1();
    }
}
