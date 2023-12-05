package com.example.PractiseJava8.lamdas;

public class RunnableLamdaEx {

    public static void main(String[] args) {
        /**
         * prior Java 8
         */

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Runnable 1");
            }
        };
        new Thread(runnable).start();


        /**
         * JAVA 8 lambda
         */

        Runnable runnable2 = () ->{
          System.out.println("Inside runnable 2 ");
        };
        new Thread(runnable2).start();


        new Thread(() -> System.out.println("Inside runnable 3")).start();




    }
}
