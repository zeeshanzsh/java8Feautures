package com.example.PractiseJava8.lamdas;

import java.util.function.Consumer;

public class LamdaVariableEx {
    static int value = 4;


    public static void main(String[] args) {


        //local variable

        Consumer<Integer> c1 = (i) -> {
            value++;
            System.out.println(value + i);
        };

        //value =6;

        c1.accept(4);
    }
}