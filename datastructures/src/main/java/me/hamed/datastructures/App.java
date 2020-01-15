package me.hamed.datastructures;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello Datastructures...");
        List<String> myList = new SinglyLinkedList<>();
        myList.add("Hamed");
        myList.add("Uzair");
        myList.add("Adeeba");
        myList.add("Thahiyya");

        myList.forEach(System.out::println);
        System.out.println(myList.size());
        System.out.println(myList.isEmpty());
        System.out.println(myList.contains("Hamed"));

        System.out.println(myList.get(0));
        System.out.println(myList.get(1));
        System.out.println(myList.get(2));
        System.out.println(myList.get(3));
        System.out.println(myList.set(3,"THAHIYYA"));
        System.out.println(myList.get(3));
//        System.out.println(myList.get(4));

        System.err.println("STandard linked list operations!");
        List<String> javaList = new ArrayList<>();
        javaList.add("Hamed");
        javaList.add("Uzair");
        javaList.add("Adeeba");
        javaList.add("Thahiyya");

        myList.forEach(System.err::println);
        System.err.println(javaList.size());
        System.err.println(javaList.isEmpty());
        System.err.println(javaList.contains("Hamed"));

        System.err.println(javaList.get(0));
        System.err.println(javaList.get(1));
        System.err.println(javaList.get(2));
        System.err.println(javaList.get(3));
        System.err.println(javaList.set(3, "THAHIYYA"));
        System.err.println(javaList.get(3));
//        System.err.println(javaList.get(4));
    }
}
