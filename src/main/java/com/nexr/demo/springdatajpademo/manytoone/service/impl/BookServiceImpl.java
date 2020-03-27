package com.nexr.demo.springdatajpademo.manytoone.service.impl;

import com.nexr.demo.springdatajpademo.manytoone.dao.BookRepository;
import com.nexr.demo.springdatajpademo.manytoone.entity.Book;
import com.nexr.demo.springdatajpademo.manytoone.service.BookService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.NoSuchElementException;

@Service("BookService")
public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Transactional
    @Override
    public Book createBook(Book book) {
        return bookRepository.save(book);
    }

    @Transactional
    @Override
    public Book updateBook(Long id, Book book) {
        Book foundBook = bookRepository.findById(id).orElseThrow(() -> new NoSuchElementException("not Found"));
        foundBook.setTitle(book.getTitle());
        foundBook.setCategory(book.getCategory());
        return foundBook;
    }
}
