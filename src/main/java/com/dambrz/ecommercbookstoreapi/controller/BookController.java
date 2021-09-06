package com.dambrz.ecommercbookstoreapi.controller;

import com.dambrz.ecommercbookstoreapi.model.Book;
import com.dambrz.ecommercbookstoreapi.service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(path = "books")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public List<Book> getAllBooks() {
        return bookService.getListOfBooks();
    }

}
