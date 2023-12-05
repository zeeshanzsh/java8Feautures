package com.example.PractiseJava8.functionalInterface;

import com.example.PractiseJava8.data.Student;
import com.example.PractiseJava8.data.StudentDB;

import java.util.List;
import java.util.Locale;
import java.util.function.Function;

public class FunctionExample {

    static Function<String, String> nameCaps = (name) -> name.toUpperCase();

    static Function<String, String> defaultName = (name) -> name.toUpperCase().concat(" Unknown");

    public static void main(String[] args) {
        List<Student> studentList = StudentDB.getAllStudents();
        studentList.forEach(s -> System.out.println(nameCaps.apply(s.getName())));

        studentList.forEach(s -> System.out.println(defaultName.apply(s.getName())));



    }
}
