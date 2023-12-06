package com.example.PractiseJava8.streams;

import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.logging.Log;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author zeeshan
 */
@Slf4j
public class StreamOfGenerateIterateEx {

    static Supplier<Integer> supplierInteger = new Random()::nextInt;



    public static void main(String[] args) {
        log.info("Printing supplier Integer Random numbers");
        Stream.generate(supplierInteger)
                .limit(10)
                .forEach(System.out::println);

        log.info("Printing Multiple of 2 and sum it");
        Stream.iterate(1, x-> x*2)
                .limit(10)
                .forEach(System.out::println);

        log.info("Printing even numbers");
        IntStream.rangeClosed(1,10)
                .filter(x -> x % 2 == 0)
                .forEach(System.out::println);

        log.info("Printing odd numbers");
        IntStream.rangeClosed(1,10)
                .filter(x -> x % 2 != 0)
                .forEach(System.out::println);
    }


}
