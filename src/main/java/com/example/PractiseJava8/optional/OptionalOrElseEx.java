package com.example.PractiseJava8.optional;

import com.example.PractiseJava8.data.Student;
import com.example.PractiseJava8.data.StudentDB;

import java.util.Optional;

/**
 * @author zeeshan
 */


public class OptionalOrElseEx {

    public static String optionalOrElse() {
        Optional<Student> optionalS = Optional.ofNullable(StudentDB.studentSupplier.get());
        return optionalS.map(Student::getName).orElse("Unknown");
    }
    public static String optionalOrElseGet() {
        Optional<Student> optionalS = Optional.ofNullable(StudentDB.studentSupplier.get());
        return optionalS.map(Student::getName).orElseGet(() -> "Unknown");
    }
    public static String optionalOrElseGetNull() {
        Optional<Student> optionalS = Optional.ofNullable(null);
        return optionalS.map(Student::getName).orElseGet(() -> "Unknown");
    }

    public static void main(String[] args) {
        System.out.println(optionalOrElse());
        System.out.println(optionalOrElseGetNull());
        System.out.println(optionalOrElseGet());
    }
}
