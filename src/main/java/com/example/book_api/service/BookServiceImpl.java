package com.example.book_api.service;

import com.example.book_api.model.Book;
import com.example.book_api.repository.BookRepository;
import com.example.book_api.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Override
    @Cacheable(value = "books")
    public List<Book> getAllBooks() {
        simulateDelay(); // simulate slow service
        return bookRepository.findAll();
    }

    @Override
    @Cacheable(value = "book", key = "#isbn")
    public Book getBookByIsbn(String isbn) {
        return bookRepository.findById(isbn).orElse(null);
    }

    @Override
    @CachePut(value = "book", key = "#book.isbn")
    @CacheEvict(value = "books", allEntries = true)
    public Book createBook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    @CachePut(value = "book", key = "#isbn")
    @CacheEvict(value = "books", allEntries = true)
    public Book updateBook(String isbn, Book book) {
        book.setIsbn(isbn);
        return bookRepository.save(book);
    }

    @Override
    @Caching(evict = {
            @CacheEvict(value = "book", key = "#isbn"),
            @CacheEvict(value = "books", allEntries = true)
    })
    public void deleteBook(String isbn) {
        bookRepository.deleteById(isbn);
    }

    private void simulateDelay() {
        try {
            Thread.sleep(3000); // 3 sec to simulate slow response
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
