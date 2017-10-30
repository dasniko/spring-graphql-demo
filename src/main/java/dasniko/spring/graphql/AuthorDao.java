package dasniko.spring.graphql;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Optional;

/**
 * @author Niko Köbler, http://www.n-k.de, @dasniko
 */
@RequiredArgsConstructor
public class AuthorDao {

    @Getter
    private final List<Author> authors;

    public Optional<Author> getAuthor(String id) {
        return authors.stream()
            .filter(author -> id.equals(author.getId()))
            .findFirst();
    }
}
