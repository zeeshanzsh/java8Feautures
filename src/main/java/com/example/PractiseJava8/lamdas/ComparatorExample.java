package com.example.PractiseJava8.lamdas;

import java.util.Comparator;

public class ComparatorExample {


    public static void main(String[] args) {
        /**
         * prior java 8
         */

        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2); // 0 -> o1==o2
                //1->o1>o1
                //-1 -> o1<o2
            }
        };
        System.out.println("Result of the comparator prior java 8 is :" + comparator.compare(3,2));
        /**
         * After  java 8
         */

        Comparator<Integer> integerComparator = (Integer a, Integer b) -> a.compareTo(b);
        System.out.println("Result of the comparator using Lambda is :"+ integerComparator.compare(3,2) );

        Comparator<Integer> naturalComparator = Comparator.naturalOrder();
        System.out.println("Result of the naturalOrder using Lambda is  :"+ naturalComparator.compare(3,2) );

        Comparator<Integer> reverseOrderComparator = Comparator.reverseOrder();
        System.out.println("Result of the reverseOrder using Lambda is :"+ reverseOrderComparator.compare(3,2) );
    }
}
