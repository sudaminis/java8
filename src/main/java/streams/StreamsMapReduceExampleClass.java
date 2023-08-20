package streams;

import data.Student;
import data.StudentDataBase;

import java.util.List;

public class StreamsMapReduceExampleClass {
    static List<Student> allStudents = StudentDataBase.getAllStudents();
    private static int noOfNotebooks() {
        return allStudents.stream()
                .filter(student -> student.getGradeLevel()>=3)
                .map(student -> student.getNoteBooks())
                //.reduce(0,(a,b)->a+b);
                .reduce(0,Integer::sum);
    }
    public static void main(String[] args) {
        System.out.println(noOfNotebooks());
    }
}
