package com.example.PractiseJava8.functionalInterface;

import com.example.PractiseJava8.data.Student;
import com.example.PractiseJava8.data.StudentDB;

import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {

    public static void main(String[] args) {
        Supplier<List<Student>> studentSupplier = () -> StudentDB.getAllStudents();

        System.out.println(studentSupplier.get());
        System.out.println(StudentDB.studentSupplier.get());

    }
}
