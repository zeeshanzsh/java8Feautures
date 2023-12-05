package com.example.PractiseJava8.functionalInterface;

import com.example.PractiseJava8.data.StudentDB;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

    static Comparator<Integer> integerComparator = (a,b) -> a.compareTo(b);


    public static void main(String[] args) {


        StudentDB.getAllStudents();
        BinaryOperator<Integer> maxBy = BinaryOperator.maxBy(integerComparator);
        System.out.println(maxBy.apply(10,5 ));

        BinaryOperator<Integer> minBy = BinaryOperator.minBy(integerComparator);
        System.out.println(minBy.apply(10,5));
    }
}
