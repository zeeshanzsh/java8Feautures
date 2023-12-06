package com.example.PractiseJava8.parallelStream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author zeeshan
 */


public class ParallelStreamBoxedEx {

    public static int sequentialSum(List<Integer> integerList){
        long start = System.currentTimeMillis();
        int sum = integerList.stream().reduce(0,(x,y) -> x+y);
        long duration = System.currentTimeMillis()-start;
        System.out.println("Duration in Sequential Stream : "+ duration);
        return sum;
    }
    public static int parallelSum(List<Integer> integerList){

        long start = System.currentTimeMillis();
        int sum = integerList
                .parallelStream()
                .reduce(0,(x,y)->x+y); // perform the unboxing from Integer to int
        long duration = System.currentTimeMillis()-start;
        System.out.println("Duration in Parallel Stream : "+ duration);
        return sum;

    }

    public static void main(String[] args) {

        List<Integer> integerList = IntStream.rangeClosed(1,1000).boxed().collect(Collectors.toList());

        System.out.println(sequentialSum(integerList));
        System.out.println(parallelSum(integerList));
    }
}
