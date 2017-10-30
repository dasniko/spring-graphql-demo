package dasniko.spring.graphql;

import com.coxautodev.graphql.tools.GraphQLResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author Niko Köbler, http://www.n-k.de, @dasniko
 */
@Component
@RequiredArgsConstructor
public class AuthorResolver implements GraphQLResolver<Author> {

    private final BookDao bookDao;

    public List<Book> getBooks(Author author) {
        return bookDao.getAuthorBooks(author.getId());
    }
}
