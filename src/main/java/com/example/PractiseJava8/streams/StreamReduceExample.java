package com.example.PractiseJava8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/**
 * @author zeeshan
 */


public class StreamReduceExample {

    public static int performMultiplication(List<Integer> integerList){

        return integerList
                .stream()
                .reduce(1, (a,b) -> a*b);
    }

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,3,5,7);
        System.out.println(performMultiplication(integerList));
    }
}
