package com.example.PractiseJava8.ImperativeVsDeclrative;

import java.util.List;
import java.util.stream.IntStream;

public class ImperativeVsDeclarativeExample {

    public static void main(String args[]){
        /**
         * Imperative way  -- How Style of programming
         */

        int sum=0;
        for(int i=0;i<=100; i++){
            sum+=i;
        }
        System.out.println("Imperative sum value is "+ sum);
        /**
         * Declarative way   -- what style of programming
         */

        int sum1 =IntStream.rangeClosed(0,100).sum();
        System.out.println("Declarative sum value is "+ sum1);

        int sum2 =IntStream.rangeClosed(0,100).parallel().sum();
        System.out.println("Declarative sum value using Parallel "+ sum2);

    }
}
