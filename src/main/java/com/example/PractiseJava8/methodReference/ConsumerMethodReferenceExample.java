package com.example.PractiseJava8.methodReference;

import com.example.PractiseJava8.data.Student;
import com.example.PractiseJava8.data.StudentDB;

import java.util.function.Consumer;

/**
 *
 */
public class ConsumerMethodReferenceExample {

    static Consumer<Student> studentConsumer = ConsumerMethodReferenceExample::printStudentActivities;
    static Consumer<Student> studentConsumerName = ConsumerMethodReferenceExample::printStudentName;

    private static void printStudentActivities(Student student) {
        System.out.println(student.getActivities());
    }

    private static void printStudentName(Student student) {
        System.out.println(student.getName());
    }

    public static void main(String[] args) {
        StudentDB.getAllStudents().forEach(studentConsumer.andThen(studentConsumerName));
    }
}
