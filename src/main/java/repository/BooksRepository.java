package repository;

import model.Books;
import org.springframework.data.jpa.repository.JpaRepository;

import java.awt.print.Book;
import java.util.List;

public interface BooksRepository extends JpaRepository<Books, Long> {
    List<Book> getAll();
}
