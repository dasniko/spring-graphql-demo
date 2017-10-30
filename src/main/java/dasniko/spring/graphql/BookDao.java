package dasniko.spring.graphql;

import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Niko Köbler, http://www.n-k.de, @dasniko
 */
@RequiredArgsConstructor
public class BookDao {

    private final List<Book> books;

    public List<Book> getBooks(int count, int offset) {
        return books.stream()
            .skip(offset)
            .limit(count)
            .collect(Collectors.toList());
    }

    public List<Book> getAuthorBooks(String author) {
        return books.stream()
            .filter(book -> author.equals(book.getAuthorId()))
            .collect(Collectors.toList());
    }

    public void saveBook(Book book) {
        books.add(0, book);
    }
}
