package streams;

import data.Student;
import data.StudentDataBase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduce {
    public static Integer performMultiplication(List<Integer> numbers) {
        return numbers.stream()
                .reduce(1, (a,b)->a*b);
    }

    public static Optional<Integer> performMultiplicationWithoutIdentity(List<Integer> numbers) {
        return numbers.stream()
                .reduce((a,b)->a*b);
    }

    public static Optional<Student> getStudentWithHighestGpa() {
        List<Student> students = StudentDataBase.getAllStudents();
        return students.stream()
                .reduce((s1,s2) -> (s1.getGpa() > s2.getGpa()) ? s1 : s2);
    }

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,4,6,7,8);
        System.out.println(performMultiplication(integerList));

        List<Integer> emptyIntegerList = new ArrayList<>();
        Optional<Integer> optional = performMultiplicationWithoutIdentity(emptyIntegerList);
        System.out.println(optional.isPresent());

    }
}
