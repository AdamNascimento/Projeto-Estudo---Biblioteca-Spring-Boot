package controller;

import model.Books;
import org.springframework.web.bind.annotation.*;
import repository.BooksRepository;
import service.BooksService;

import java.awt.print.Book;
import java.util.List;

@RestController
@RequestMapping("/books")

public class ControllerBooks {

    // injeção de dependencia
    private final BooksService booksService;

    public ControllerBooks(BooksService booksService) {
        this.booksService = booksService;
    }

    //LISTAR
    @GetMapping
    public List<Books> getAll() {return booksService.getAll(); }

    @PostMapping
    public Books create(@RequestBody Books book){return booksService.save(book);}
}
