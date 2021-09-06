package com.dambrz.ecommercbookstoreapi.service;

import com.dambrz.ecommercbookstoreapi.model.Book;
import com.dambrz.ecommercbookstoreapi.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> getListOfBooks() {
        return bookRepository.findAll();
    }
}
