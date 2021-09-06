package com.dambrz.ecommercbookstoreapi.repository;

import com.dambrz.ecommercbookstoreapi.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
