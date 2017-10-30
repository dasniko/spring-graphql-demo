package dasniko.spring.graphql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@SpringBootApplication
public class SpringGraphqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringGraphqlApplication.class, args);
	}

    @Bean
    public AuthorDao authorDao() {
        List<Author> authors = new ArrayList<>();
        for (int authorId = 0; authorId < 10; ++authorId) {
            Author author = new Author();
            author.setId("Author" + authorId);
            author.setName("Author " + authorId);
            author.setThumbnail("http://example.com/authors/" + authorId);
            authors.add(author);
        }
        return new AuthorDao(authors);
    }

    @Bean
    public BookDao bookDao() {
        List<Book> books = new ArrayList<>();
        for (int bookId = 0; bookId < 10; ++bookId) {
            for (int authorId = 0; authorId < 10; ++authorId) {
                Book book = new Book();
                book.setId("Book" + authorId + bookId);
                book.setTitle("Book " + authorId + ":" + bookId);
                book.setIsbn(UUID.randomUUID().toString());
                book.setAuthorId("Author" + authorId);
                books.add(book);
            }
        }
        return new BookDao(books);
    }
}
