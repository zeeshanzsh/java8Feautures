package com.example.PractiseJava8.functionalInterface;

import com.example.PractiseJava8.data.Student;
import com.example.PractiseJava8.data.StudentDB;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

    static Consumer<Student> studentConsumerName = c -> System.out.println(c.getName().toUpperCase());
    static Consumer<Student> studentConsumerActivities = c -> System.out.println(c.getActivities());


    public static void main(String[] args) {
        /**
         * Print only Name
         */
        List<Student> studentList = StudentDB.getAllStudents();
        //studentList.forEach(s -> studentConsumerName.accept(s));
        studentList.forEach(studentConsumerName);

        /**
         * Print only Activities
         */

        studentList.forEach(studentConsumerActivities);
        /**
         * Print Name and Activities
         */
        studentList.forEach(student -> studentConsumerName.andThen(studentConsumerActivities).accept(student));

    }
}
