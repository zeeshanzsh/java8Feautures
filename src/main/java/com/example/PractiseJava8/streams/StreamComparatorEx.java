package com.example.PractiseJava8.streams;

import com.example.PractiseJava8.data.Student;
import com.example.PractiseJava8.data.StudentDB;
import lombok.extern.slf4j.Slf4j;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author zeeshan
 */

@Slf4j
public class StreamComparatorEx {

    /**
     * Sorting based on name
     *
     * @return
     */
    public static List<Student> getSortByName() {
        return StudentDB.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getName))
                .collect(Collectors.toList());

    }

    public static List<Student> getSortByGPA() {
        return StudentDB.getAllStudents()
                .stream()
                .sorted(Comparator.comparing(Student::getGpa))
                .collect(Collectors.toList());
    }

    public static List<Student> sortStudentsByGpaDesc() {
        return StudentDB.getAllStudents()
                .stream()
                .sorted(Comparator.comparing(Student::getGpa).reversed())
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {

        getSortByName().forEach(student -> System.out.println(student.getName()));
        getSortByGPA().forEach(student -> System.out.println("Name: " + student.getName() + " GPA :" + student.getGpa()));
        log.info("Sort Student by desc");
        sortStudentsByGpaDesc().forEach(student -> System.out.println("Name: " + student.getName() + " GPA :" + student.getGpa()));
    }
}
