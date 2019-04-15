package com.nexr.demo.springdatajpademo.manytoone.service;

import com.nexr.demo.springdatajpademo.manytoone.entity.Book;
import com.nexr.demo.springdatajpademo.manytoone.entity.Category;

public interface ManyToOneService {
    public void saveBook(Book book);

    public void saveCategory(Category category);

    public Book getBookById(Long id);
}
