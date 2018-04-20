package com.bidi.sortingObjects;

import com.bidi.sortingObjects.Book;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListMain {

    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book(31, "Algorithm Complexity", "Bidi"));
        books.add(new Book(22, "The Scientist and Engineer's Guide to Digital Signal Process", "Tiep VD"));
        books.add(new Book(43, "Understanding Digital Signal Processing 3rd E", "Phuong PT"));
        books.add(new Book(14, "Head First to Servlets and JSP", "Luat TD"));
        books.add(new Book(5, "Effective Java 2nd Edition", "Duc TT"));
        books.add(new Book(96, "The well-grounded Java Developer", "Lua NQ"));
        books.add(new Book(157, "SCJP Sun Certified Programmer for Java 6 Exam 310-065", "LongHP"));

        Collections.sort(books, (book1, book2) -> {
            return book1.getAuthor().compareTo(book2.getAuthor());
        });
        books.forEach(book -> {
            System.out.println(book);
        });


        Map<String, String> stringMap = new HashMap<>();


    }
}
