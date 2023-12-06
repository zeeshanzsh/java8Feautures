package com.example.PractiseJava8.streams;

import com.example.PractiseJava8.data.Student;
import com.example.PractiseJava8.data.StudentDB;

import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

/**
 * @author zeeshan
 */


public class StreamsMapReduce {
    static Consumer<String> stringConsumer = (s) -> System.out.println(s);

    public static List<String> getName(){
        return StudentDB.getAllStudents().stream()
                .filter( student -> student.getGradeLevel()>=3)
                .filter(student -> student.getGender().equals("female"))
                .peek(student -> stringConsumer.accept(student.getGender()) )
                .map(Student::getName)
                .peek(s -> stringConsumer.accept(s))
                .collect(Collectors.toList());
}

    public static void main(String[] args) {
        getName();
    }
}
