package dasniko.spring.graphql;

import com.coxautodev.graphql.tools.GraphQLResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

/**
 * @author Niko Köbler, http://www.n-k.de, @dasniko
 */
@Component
@RequiredArgsConstructor
public class BookResolver implements GraphQLResolver<Book> {

    private final AuthorDao authorDao;

    public Optional<Author> getAuthor(Book book) {
        return authorDao.getAuthor(book.getAuthorId());
    }
}
