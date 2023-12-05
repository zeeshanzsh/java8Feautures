package com.example.PractiseJava8.optional;

import com.example.PractiseJava8.data.Student;
import com.example.PractiseJava8.data.StudentDB;
import com.example.PractiseJava8.methodReference.RefactorMethodReference;

import java.security.PublicKey;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

/**
 * @author zeeshan
 */


public class OptionalFlatMapEx {

    public static Optional<String> optionalFilter() {

        Optional<Student> student = Optional.ofNullable(StudentDB.studentSupplier.get());
        if(student.isPresent()){
        return student.filter(s -> s.getGpa()>=3.2)
                .map(Student::getName);

        }else {
            return Optional.empty();
        }
    }

    public static void studentActivities(){
        Optional<Student> optionalStudent =  Optional.ofNullable(StudentDB.studentSupplier.get());

        if(optionalStudent.isPresent()){
           Optional<List<String>> activitiesList = optionalStudent.filter(student -> student.getGpa()>=4)
                    .map(Student::getActivities);
           System.out.println(activitiesList.get());

        }else{
        System.out.println("No Records");
        }
    }

    public static void main(String[] args) {
        System.out.println(optionalFilter().get());
        studentActivities();
    }
}
