package dasniko.spring.graphql;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author Niko Köbler, http://www.n-k.de, @dasniko
 */
@Component
@RequiredArgsConstructor
public class Query implements GraphQLQueryResolver {

    private final AuthorDao authorDao;
    private final BookDao bookDao;

    public List<Author> authors() {
        return authorDao.getAuthors();
    }

    public List<Book> books(int count, int offset) {
        return bookDao.getBooks(count, offset);
    }
}
