package streams;

import data.Student;
import data.StudentDataBase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduce {

    public static int performMultiplicationWithIdentity(List<Integer> integerList) {
        //1,3,5,7
        //a=1, b=1(from stream)=1*1=1
        //a=1, b=3(from stream)=1*3=3
        //a=3, b=5(from stream)=3*5=15
        //a=15, b=7(from stream)=15*7=105
        return integerList.stream()
                .reduce(1,(a,b)->a*b);
    }


    private static Optional<Integer> performMultiplicationWithoutIdentity(List<Integer> list) {
        return list.stream().reduce((a,b)->a*b);
    }

    private static Optional<Student> getHighestGpaStudent() {
       return  StudentDataBase.getAllStudents().stream()
                .reduce( (s1,s2) -> s1.getGpa() > s2.getGpa() ? s1 : s2);
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,3,5,7);
        List<Integer> emptyList = new ArrayList<>();
        System.out.println(performMultiplicationWithIdentity(list));
        //without identity, it returns Optional
        System.out.println(performMultiplicationWithoutIdentity(emptyList));

        System.out.println(getHighestGpaStudent());

    }

}
