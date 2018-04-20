import com.bidi.catalog.Book;
import com.bidi.catalog.BookCollection;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        BookCollection collection = new BookCollection();
        List<Book> foundBooks = collection.findBooks(book-> book.getTitle().contains("Digital"));
        foundBooks.forEach(book -> System.out.println(book.getTitle()));
    }
}
