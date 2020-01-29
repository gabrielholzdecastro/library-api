package com.gabrielholz.libraryapi.service.impl;

import com.gabrielholz.libraryapi.model.entity.Book;
import com.gabrielholz.libraryapi.model.repository.BookRepository;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements com.gabrielholz.libraryapi.service.BookService {

    private BookRepository repository;

    public BookServiceImpl(BookRepository repository) {
        this.repository = repository;
    }

    @Override
    public Book save(Book book) {
        return repository.save(book);
    }
}
