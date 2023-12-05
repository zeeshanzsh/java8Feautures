package com.example.PractiseJava8.methodReference;

import java.util.function.Function;

/**
 * @author zeeshan
 */
public class FunctionalMethodReferenceEx {

    static Function<String, String> toUpperCaseLambda = String::toUpperCase;

    public static void main(String[] args) {
        System.out.println(toUpperCaseLambda.apply("zeeshan"));
    }
}
