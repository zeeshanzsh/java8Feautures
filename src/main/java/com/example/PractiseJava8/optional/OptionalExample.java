package com.example.PractiseJava8.optional;

import com.example.PractiseJava8.data.Student;
import com.example.PractiseJava8.data.StudentDB;

import java.util.Optional;

/**
 * @author zeeshan
 */


public class OptionalExample {

    public static Optional getStudentNameOptional(){
        Optional<Student> student = Optional.ofNullable(StudentDB.studentSupplier.get());
        //Optional<Student> student = Optional.ofNullable(null);

        if(student.isPresent()){
            student.get();
            return student.map(Student::getName);
        }
        return Optional.empty();
    }

    public static void main(String[] args) {
        Optional<String> stringOptional = getStudentNameOptional();

        if(stringOptional.isPresent()){
            System.out.println(stringOptional.get());
        }else {
            System.out.println("No Student name found");
        }


    }
}
