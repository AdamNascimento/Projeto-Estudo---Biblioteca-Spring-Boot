package service;
import model.Books;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import repository.BooksRepository;

import java.awt.print.Book;
import java.util.List;

@Service
public class BooksService {

    private final BooksRepository booksRepository;

    public BooksService(BooksRepository booksRepository) {
        this.booksRepository = booksRepository;
    }

    //LISTAR
    @GetMapping
    public List<Books> getAll() {
        return booksRepository.findAll();
    }

    //CRIAR
    public Books save(Books books){
        return booksRepository.save(books);
    }

    //DELETAR
    public void delete(Long id){
        booksRepository.deleteById(id);
    }

}
