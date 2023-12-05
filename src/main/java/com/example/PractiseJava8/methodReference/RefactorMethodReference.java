package com.example.PractiseJava8.methodReference;

import com.example.PractiseJava8.data.Student;
import com.example.PractiseJava8.data.StudentDB;

import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * @author zeeshan
 */


public class RefactorMethodReference {

    static Predicate<Student> studentPredicate = RefactorMethodReference::greaterThanGradeLevel;

    static Consumer<Student> studentConsumer = RefactorMethodReference::greaterThanGradeLevel;

    static Consumer<Student> studentName = RefactorMethodReference::printName;

    private static boolean greaterThanGradeLevel(Student student) {
        return student.getGradeLevel()>=3.7;
    }
    private static void printName(Student student) {
        System.out.println(student.getName()+ " : "+ student.getGradeLevel());
    }

    public static void main(String[] args) {
       System.out.println(studentPredicate.test(StudentDB.studentSupplier.get()));
    }
}
