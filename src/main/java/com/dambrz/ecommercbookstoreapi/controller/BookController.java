package com.dambrz.ecommercbookstoreapi.controller;

import com.dambrz.ecommercbookstoreapi.model.Book;
import com.dambrz.ecommercbookstoreapi.service.BookService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
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

    @PostMapping("/uploadImage")
    public void uploadImage(@RequestParam("imageFile") MultipartFile file) throws IOException {
        bookService.uploadImage(file);
    }

    @PostMapping
    public void createBook(@RequestBody Book book) {
        bookService.createBook(book);
    }

    @DeleteMapping(path = { "/{id}"})
    public void deleteBook(@PathVariable("id") long id) {
        bookService.deleteBook(id);
    }

    @PutMapping
    public void updateBook(@RequestBody Book book) {
        bookService.updateBook(book);
    }
}
