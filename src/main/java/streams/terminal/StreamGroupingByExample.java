package streams.terminal;

import data.Student;
import data.StudentDataBase;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class StreamGroupingByExample {

    // one parameter version
    public static Map<String,List<Student>> groupStudentsByGender() {
        return StudentDataBase.getAllStudents().stream()
                .collect(groupingBy(Student::getGender));
    }

    // if gpa > 3.8 - outstanding students
    //one parameter version of groupingBy
    public static Map<String,List<Student>> customizedGroupingBy() {
        return StudentDataBase.getAllStudents().stream()
                .collect(groupingBy(student -> student.getGpa() >= 3.8 ? "OUTSTANDING" : "AVERAGE"));
    }

    public static void twoLevelGrouping_1() {
        Map<Integer,Map<String, List<Student>>> studentMap = StudentDataBase.getAllStudents().stream()
                .collect(groupingBy(Student::getGradeLevel, groupingBy(student -> student.getGpa() >= 3.8 ? "OUTSTANDING" : "AVERAGE")));
        System.out.println("two level grouping - 1");
        System.out.println("***********");
        System.out.println(studentMap);
    }

    // two argument version
    public static void twoLevelGrouping_2() {
        Map<Integer,Integer> studentMap = StudentDataBase.getAllStudents().stream()
                .collect(groupingBy(Student::getGradeLevel, summingInt(student -> student.getNoteBooks())));
        System.out.println("two level grouping - 2");
        System.out.println("***********");
        System.out.println(studentMap);
    }
    // 2 argument version collects to a hashmap. 3 argument version can collect to a different map
    public static void threeArgumentGroupBy() {
        LinkedHashMap<String, Set<Student>> studentLinkedHashmap = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getName, LinkedHashMap::new, toSet()));
        System.out.println("3 argument version of grouping by ");
        System.out.println("***********");
        System.out.println(studentLinkedHashmap);

    }

    public static void calculateTopGpa(){
        Map<Integer, Optional<Student>> studentMapOptional = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGradeLevel, maxBy(Comparator.comparing(Student::getGpa))));

        System.out.println(studentMapOptional);

        Map<Integer, Student> studentMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGradeLevel, collectingAndThen(maxBy(Comparator.comparing(Student::getGpa)), Optional::get)));
        System.out.println(studentMap);

    }

    public static void main(String[] args) {
        System.out.println("Students grouped by gender = " + groupStudentsByGender());
        System.out.println("Students grouped by gpa = " + customizedGroupingBy());
        twoLevelGrouping_1();
        twoLevelGrouping_2();
        threeArgumentGroupBy();
    }
}
