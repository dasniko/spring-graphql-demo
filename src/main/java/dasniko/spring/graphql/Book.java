package dasniko.spring.graphql;

import lombok.Data;

/**
 * @author Niko Köbler, http://www.n-k.de, @dasniko
 */
@Data
public class Book {
    private String id;
    private String title;
    private String isbn;
    private String category;
    private String authorId;
}
