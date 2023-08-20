package streams;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsFlatMapExample {
    public static void main(String[] args) {
        System.out.println(printStudentActivities());
        System.out.println(getStudentActivitiesCount());
        //distinct returns distinct elements of stream
        //count counts number of elements in stream
        //sorted sorts the elements of stream in alphabetical order

    }
    public static List<String> printStudentActivities() {
       return StudentDataBase.getAllStudents()
               .stream() //stream of Students
               .map(Student::getActivities) // stream of List of Strings
               .flatMap(List::stream) // stream of string
               .distinct().sorted().collect(Collectors.toList());

    }

    public static long getStudentActivitiesCount() {
        return StudentDataBase.getAllStudents()
                .stream() //stream of Students
                .map(Student::getActivities) // stream of List of Strings
                .flatMap(List::stream) // stream of string
                .distinct().count();

    }
}
