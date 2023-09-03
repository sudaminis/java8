package streams;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamsFilterExample {

    public static void main(String[] args) {
        filterStudents().forEach(System.out::println);

        //reduce - terminal operation of streams api.
        //another terminal operation we have seen is collect.
        //reduce function is used to reduce contents of stream to a single value
        //sum of all elements of stream, perform multiplication of all elements of stream
        //takes two parameters ( default value, binaryOperator<T>)
        //binaryOperator takes two inputs of same type and returns output of the same type.
    }

    private static List<Student> filterStudents() {
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGender().equalsIgnoreCase("Female"))
                .collect(Collectors.toList());
    }
}
