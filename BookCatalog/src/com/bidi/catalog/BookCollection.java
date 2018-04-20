package com.bidi.catalog;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class BookCollection {

    private List<Book> books;

    public List<Book> findBooks(Predicate<Book> criteria) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (criteria.test(book)) {
                result.add(book);
            }
        }
        return result;
    }

    public List<Book> findBooksFunction(Function<List<Book>, List<Book>> criteria) {
       return criteria.apply(books);
    }

    public BookCollection() {
        books = new ArrayList<>();
        books.add(new Book(31, "Algorithm Complexity", "Bidi"));
        books.add(new Book(22, "The Scientist and Engineer's Guide to Digital Signal Process", "Tiep VD"));
        books.add(new Book(43, "Understanding Digital Signal Processing 3rd E", "Phuong PT"));
        books.add(new Book(14, "Head First to Servlets and JSP", "Luat TD"));
        books.add(new Book(5, "Effective Java 2nd Edition", "Duc TT"));
        books.add(new Book(96, "The well-grounded Java Developer", "Lua NQ"));
        books.add(new Book(157, "SCJP Sun Certified Programmer for Java 6 Exam 310-065", "LongHP"));

    }
}
