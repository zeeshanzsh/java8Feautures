package com.example.PractiseJava8.parallelStream;
/**
 * @author zeeshan
 */
import com.example.PractiseJava8.data.Student;
import com.example.PractiseJava8.data.StudentDB;

import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {

    public static List<String> sequentialPrintStudentActivities(){
        return StudentDB
                .getAllStudents()
                .stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .sorted()
                .distinct()
                .collect(Collectors.toList());


    }

    public static void main(String[] args) {
        System.out.println(sequentialPrintStudentActivities());
    }
}
