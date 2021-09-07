package com.dambrz.ecommercbookstoreapi.service;

import com.dambrz.ecommercbookstoreapi.model.Book;
import com.dambrz.ecommercbookstoreapi.repository.BookRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
public class BookService {

    private byte[] imageBytes;

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> getListOfBooks() {
        return bookRepository.findAll();
    }

    public void uploadImage(MultipartFile file) throws IOException {
        this.imageBytes = file.getBytes();
    }

    public void createBook(Book book) {
        book.setPicByte(this.imageBytes);
        bookRepository.save(book);
        this.imageBytes = null;
    }

    public void deleteBook(long id) {
        bookRepository.deleteById(id);
    }
}
