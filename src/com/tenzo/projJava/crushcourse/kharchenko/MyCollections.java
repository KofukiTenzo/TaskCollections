package com.tenzo.projJava.crushcourse.kharchenko;

import com.sun.jdi.IntegerType;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class MyCollections {
    private static ArrayList<Integer> arrList = new ArrayList<>();
    private static LinkedList<Integer> linkList = new LinkedList<>();

    static {
        for (int i = 0; i < 1_000_000; i++) {
            arrList.add(i);
        }

        for (int i = 0; i < 1_000_000; i++) {
            linkList.add(i);
        }
    }

    public void arrayListVsLinkedListInsertionAtTheEnd() {
        System.out.println("Insertion at the end.");
        System.out.println("ArrayList: ");
        LocalTime startForArr = LocalTime.now();

        arrList.add(1_000_001);

        LocalTime endForArr = LocalTime.now();
        long arrTime = ChronoUnit.MILLIS.between(startForArr, endForArr);
        System.out.println("Time: " + arrTime);

        System.out.println("LinkedList: ");
        LocalTime startForLink = LocalTime.now();

        linkList.add(1_000_001);

        LocalTime endForLink = LocalTime.now();
        long linkTime = ChronoUnit.MILLIS.between(startForLink, endForLink);
        System.out.println("Time: " + linkTime);
    }

    public void arrayListVsLinkedListInsertionAtTheBeginning() {
        System.out.println("Insertion at the beginning.");
        System.out.println("ArrayList: ");
        LocalTime startForArr = LocalTime.now();

        arrList.add(0, -1);

        LocalTime endForArr = LocalTime.now();
        long arrTime = ChronoUnit.MILLIS.between(startForArr, endForArr);
        System.out.println("Time: " + arrTime);

        System.out.println("LinkedList: ");
        LocalTime startForLink = LocalTime.now();

        linkList.add(0, -1);

        LocalTime endForLink = LocalTime.now();
        long linkTime = ChronoUnit.MILLIS.between(startForLink, endForLink);
        System.out.println("Time: " + linkTime);
    }

    public void arrayListVsLinkedListDeleting() {
        System.out.println("Deleting.");
        System.out.println("ArrayList: ");
        LocalTime startForArr = LocalTime.now();

        arrList.remove(arrList.size() - 1);

        LocalTime endForArr = LocalTime.now();
        long arrTime = ChronoUnit.MILLIS.between(startForArr, endForArr);
        System.out.println("Time: " + arrTime);

        System.out.println("LinkedList: ");
        LocalTime startForLink = LocalTime.now();

        linkList.remove(linkList.size() - 1);

        LocalTime endForLink = LocalTime.now();
        long linkTime = ChronoUnit.MILLIS.between(startForLink, endForLink);
        System.out.println("Time: " + linkTime);
    }

    public void arrayListVsLinkedListIteration() {
        System.out.println("Iteration.");
        System.out.println("ArrayList: ");
        LocalTime startForArr = LocalTime.now();

        int countArr = 0;
        for(Integer num : arrList){
            countArr++;
        }
        System.out.println("Array List count: " + countArr);

        LocalTime endForArr = LocalTime.now();
        long arrTime = ChronoUnit.MILLIS.between(startForArr, endForArr);
        System.out.println("Time: " + arrTime);

        System.out.println("LinkedList: ");
        LocalTime startForLink = LocalTime.now();

        int countList = 0;
        for(Integer num : linkList){
            countList++;
        }
        System.out.println("Linked List count: " + countList);

        LocalTime endForLink = LocalTime.now();
        long linkTime = ChronoUnit.MILLIS.between(startForLink, endForLink);
        System.out.println("Time: " + linkTime);
    }

    private static HashMap<Integer, Integer> hashMap = new HashMap<>();
    private static HashSet<Integer> hashSet = new HashSet<>();

    static {
        for (int i = 0; i < 1_000_000; i++) {
            hashMap.put(i, i);
        }

        for (int i = 0; i < 1_000_000; i++) {
            hashSet.add(i);
        }
    }

    public void arrayListAndLinkedListVsHashMapAndHashSetInSearch() {

        System.out.println("Search (ArrayList/LinkedList and HashMap/HashSet).");
        System.out.println("ArrayList: ");
        LocalTime startForArr = LocalTime.now();

        for(Integer num : arrList){
            if(num == 600_000) System.out.println("Has find");
        }

        LocalTime endForArr = LocalTime.now();
        long arrTime = ChronoUnit.MILLIS.between(startForArr, endForArr);
        System.out.println("Time: " + arrTime);

        System.out.println("LinkedList: ");
        LocalTime startForLink = LocalTime.now();

        for(Integer num : linkList){
            if(num == 600_000) System.out.println("Has find");
        }

        LocalTime endForLink = LocalTime.now();
        long linkTime = ChronoUnit.MILLIS.between(startForLink, endForLink);
        System.out.println("Time: " + linkTime);

        System.out.println("HashMap: ");
        LocalTime startForMap = LocalTime.now();

        for(Map.Entry<Integer, Integer> entry : hashMap.entrySet()){
            if (entry.getValue() == 600_000) System.out.println("Has find");
        }

        LocalTime endForMap = LocalTime.now();
        long mapTime = ChronoUnit.MILLIS.between(startForMap, endForMap);
        System.out.println("Time: " + mapTime);

        System.out.println("HashSet: ");
        LocalTime startForSet = LocalTime.now();

        for(Integer num : hashSet){
            if(num == 600_000) System.out.println("Has find");
        }

        LocalTime endForSet = LocalTime.now();
        long setTime = ChronoUnit.MILLIS.between(startForSet, endForSet);
        System.out.println("Time: " + setTime);
    }

    private static TreeMap<Integer, Integer> treeMap = new TreeMap<>();
    private static TreeSet<Integer> treeSet = new TreeSet<>();

    static {
        for (int i = 0; i < 1_000_000; i++) {
            treeMap.put(i, i);
        }

        for (int i = 0; i < 1_000_000; i++) {
            treeSet.add(i);
        }
    }

    public void hashMapAndHashSetVsTreeMapAndTreeSetInSearch() {

        System.out.println("Search (HashMap/HashSet vs TreeMap/TreeSet).");

        System.out.println("HashMap: ");
        LocalTime startForMap = LocalTime.now();

        for(Map.Entry<Integer, Integer> entry : hashMap.entrySet()){
            if (entry.getValue() == 600_000) System.out.println("Has find");
        }

        LocalTime endForMap = LocalTime.now();
        long mapTime = ChronoUnit.MILLIS.between(startForMap, endForMap);
        System.out.println("Time: " + mapTime);

        System.out.println("HashSet: ");
        LocalTime startForSet = LocalTime.now();

        for(Integer num : hashSet){
            if(num == 600_000) System.out.println("Has find");
        }

        LocalTime endForSet = LocalTime.now();
        long setTime = ChronoUnit.MILLIS.between(startForSet, endForSet);
        System.out.println("Time: " + setTime);

        System.out.println("TreeMap: ");
        LocalTime startForTreeM = LocalTime.now();

        for(Map.Entry<Integer, Integer> entry : treeMap.entrySet()){
            if (entry.getValue() == 600_000) System.out.println("Has find");
        }

        LocalTime endForTreeM = LocalTime.now();
        long treeMTime = ChronoUnit.MILLIS.between(startForTreeM, endForTreeM);
        System.out.println("Time: " + treeMTime);

        System.out.println("TreeSet: ");
        LocalTime startForTreeS = LocalTime.now();

        for(Integer num : treeSet){
            if(num == 600_000) System.out.println("Has find");
        }

        LocalTime endForTreeS = LocalTime.now();
        long treeSTime = ChronoUnit.MILLIS.between(startForTreeS, endForTreeS);
        System.out.println("Time: " + treeSTime);
    }
}
