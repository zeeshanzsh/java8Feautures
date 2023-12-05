package com.example.PractiseJava8.functionalInterface;

import com.example.PractiseJava8.data.Student;
import com.example.PractiseJava8.data.StudentDB;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionAndPredicateStudentExample {

    static Predicate<Student> studentGradePredicate = (s) -> s.getGradeLevel()>=3;

    static Function<List<Student>, Map<String,Double>> gpaStudent = students -> {
        Map<String, Double> studentGrademap = new HashMap<>();
        students.forEach((s) -> {
            if(studentGradePredicate.test(s)){
                studentGrademap.put(s.getName(),s.getGpa());
            }
        });
        return studentGrademap;
    };

    public static void main(String[] args) {
        System.out.println(gpaStudent.apply(StudentDB.getAllStudents()));
    }
}
