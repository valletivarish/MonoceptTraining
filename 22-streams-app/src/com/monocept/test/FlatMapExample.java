package com.monocept.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {
    public static void main(String[] args) {
        List<List<Integer>> test1 = Arrays.asList(Arrays.asList(1, 2, 3, 4), Arrays.asList(5, 6, 7, 8), Arrays.asList(9, 10, 11, 12));
        System.out.println("List of lists: " + test1);

        List<Integer> test2 = test1.stream()
                                   .flatMap(x->x.stream())
                                   .collect(Collectors.toList());
        System.out.println("Flattened list: " + test2);

        List<Integer> doubledListUsingFlatMap = test2.stream()
                                                     .flatMap(x -> Arrays.asList(x * 2).stream())
                                                     .collect(Collectors.toList());
        System.out.println("Doubled list using flatMap: " + doubledListUsingFlatMap);
        List<Integer> doubledListUsingMap = test2.stream()
                                                 .map(x -> x * 2)
                                                 .collect(Collectors.toList());
        System.out.println("Doubled list using map: " + doubledListUsingMap);
    }
}
