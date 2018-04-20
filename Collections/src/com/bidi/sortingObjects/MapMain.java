package com.bidi.sortingObjects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapMain {

    public static void main(String[] args) {
        Map<Book, Integer> books = new HashMap<>();
        books.put(new Book(31, "Algorithm Complexity", "Bidi"), 2);
        books.put(new Book(22, "The Scientist and Engineer's Guide to Digital Signal Process", "Tiep VD"), 15);
        books.put(new Book(43, "Understanding Digital Signal Processing 3rd E", "Phuong PT"), 6);
        books.put(new Book(14, "Head First to Servlets and JSP", "Luat TD"), 48);
        books.put(new Book(5, "Effective Java 2nd Edition", "Duc TT"), 4);
        books.put(new Book(96, "The well-grounded Java Developer", "Lua NQ"), 21);
        books.put(new Book(157, "SCJP Sun Certified Programmer for Java 6 Exam 310-065", "LongHP"), 78);

        Integer result = books.get(new Book(31, "Algorithm Complexity", "Bidi"));
        System.out.println(result);

    }
}
