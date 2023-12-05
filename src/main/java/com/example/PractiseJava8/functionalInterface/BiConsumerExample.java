package com.example.PractiseJava8.functionalInterface;

import com.example.PractiseJava8.data.Student;
import com.example.PractiseJava8.data.StudentDB;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {


    public static void nameAndActivities(){
        BiConsumer<String, List<String>> biConsumer = (name, activities) -> System.out.println(name + " : "+ activities );

        BiConsumer<String, String> biConsumerGender = (name, gender) -> System.out.println(name + " : "+ gender );

        List<Student> students = StudentDB.getAllStudents();

        students.forEach((student -> biConsumer.accept(student.getName(),student.getActivities())));

        students.forEach((student -> biConsumerGender.accept(student.getName(),student.getGender())));

    }

    public static void main(String[] args) {

        BiConsumer<String, String> stringStringBiConsumer = (a,b) -> {
            System.out.println("a :" + a + " , b : "+b);
        };
        stringStringBiConsumer.accept("java7","java8");


        BiConsumer<Integer,Integer> multiply = (a,b) -> {
            System.out.println("Multiplication is : " + (a*b));
        };

        BiConsumer<Integer,Integer> division = (a,b) -> {
            System.out.println("Division is : " + (a/b));
        };

        multiply.andThen(division).accept(10,5);

        nameAndActivities();


    }
}
