package com.example.PractiseJava8.optional;

import com.example.PractiseJava8.data.Student;
import com.example.PractiseJava8.data.StudentDB;

import java.util.Optional;

/**
 * @author zeeshan
 */


public class OptionalIfPresentEx {

    public static void main(String[] args) {
        Optional<Student> optionalStudent = Optional.ofNullable(StudentDB.studentSupplier.get());
        optionalStudent.ifPresent(s -> System.out.println(s.getActivities()));
    }
}
