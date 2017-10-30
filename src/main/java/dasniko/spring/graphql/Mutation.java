package dasniko.spring.graphql;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.UUID;

/**
 * @author Niko Köbler, http://www.n-k.de, @dasniko
 */
@Component
@RequiredArgsConstructor
public class Mutation implements GraphQLMutationResolver {

    private final BookDao bookDao;

    public Book addBook(String title, String isbn, String category, String author) {
        Book book = new Book();
        book.setId(UUID.randomUUID().toString());
        book.setTitle(title);
        book.setIsbn(isbn);
        book.setCategory(category);
        book.setAuthorId(author);
        bookDao.saveBook(book);
        return book;
    }
}
