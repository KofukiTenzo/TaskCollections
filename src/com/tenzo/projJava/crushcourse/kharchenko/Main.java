package com.tenzo.projJava.crushcourse.kharchenko;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        MyCollections collections = new MyCollections();
        collections.arrayListVsLinkedListInsertionAtTheEnd();
        collections.arrayListVsLinkedListInsertionAtTheBeginning();
        collections.arrayListVsLinkedListDeleting();
        collections.arrayListVsLinkedListIteration();
        collections.arrayListAndLinkedListVsHashMapAndHashSetInSearch();
        collections.hashMapAndHashSetVsTreeMapAndTreeSetInSearch();

        MyGenerics<String, Integer> firstPair = new MyGenerics<>("Hello World", 10);
        MyGenerics<String, Integer> secondPair = new MyGenerics<>("Bye World", 50);

        boolean equals = firstPair.equals(secondPair);
        String format = "First pair: %s and second pair: %s are equals: %s";

        System.out.printf(format, firstPair.getFirst(), secondPair.getFirst(), equals);
    }
}
