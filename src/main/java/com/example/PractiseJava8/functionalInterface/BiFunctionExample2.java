package com.example.PractiseJava8.functionalInterface;

import com.example.PractiseJava8.data.Student;
import com.example.PractiseJava8.data.StudentDB;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class BiFunctionExample2 {

    static Predicate<Student> studentGradePredicate = (s) -> s.getGradeLevel()>=3;
    static Predicate<Student> studentGpaPredicate = (s) -> s.getGpa()>=3.9;


    static BiFunction<List<Student>, Predicate<Student> , Map<String, Double>> biFunction =
            ((students, studentsPredicate) -> {
                Map<String,Double> studentGradeMap = new HashMap<>();
                students.forEach(student -> {
                    if(studentsPredicate.test(student)){
                        studentGradeMap.put(student.getName(),student.getGpa());
                    }
                });
                return  studentGradeMap;
    });

    public static void main(String args[]){

        System.out.println(biFunction.apply(StudentDB.getAllStudents(),studentGpaPredicate));

    }
}
