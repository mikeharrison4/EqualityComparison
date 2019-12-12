package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Duck> duckList = Arrays.asList(
                new Duck("Alpha", "Mallard", 100, 17),
                new Duck("Beta", "Mallard", 86, 12),
                new Duck("Charlie", "Mallard", 19, 24),
                new Duck("Delta", "Mallard", 583, 32),
                new Duck("Alpha", "Mallard", 100, 17)
        );

        System.out.println( duckList.get(0).equals(duckList.get(4)) );

        Collections.sort( duckList );
        duckList.forEach( duck -> System.out.println(duck.getName()) );

    }
}
