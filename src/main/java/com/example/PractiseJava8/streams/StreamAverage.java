package com.example.PractiseJava8.streams;

import com.example.PractiseJava8.data.Student;
import com.example.PractiseJava8.data.StudentDB;

/**
 * @author zeeshan
 */


public class StreamAverage {

    public static Object getAvgGPA(){
        return StudentDB.getAllStudents()
                .stream()
                .mapToDouble(Student::getGpa) // Use mapToDouble for primitive double values
                .average()
                .orElse(0.0); // Provide a default value if there are no students
         }

    public static void main(String[] args) {
        System.out.println(getAvgGPA());
    }
}
