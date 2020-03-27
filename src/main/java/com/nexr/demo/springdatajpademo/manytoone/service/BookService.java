package com.nexr.demo.springdatajpademo.manytoone.service;

import com.nexr.demo.springdatajpademo.manytoone.entity.Book;

public interface BookService {
    Book createBook(Book book);

    Book updateBook(Long id, Book book);
}
