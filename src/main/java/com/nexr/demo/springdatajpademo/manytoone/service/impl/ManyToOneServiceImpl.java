package com.nexr.demo.springdatajpademo.manytoone.service.impl;

import com.nexr.demo.springdatajpademo.manytoone.dao.BookRepository;
import com.nexr.demo.springdatajpademo.manytoone.dao.CategoryRepository;
import com.nexr.demo.springdatajpademo.manytoone.entity.Book;
import com.nexr.demo.springdatajpademo.manytoone.entity.Category;
import com.nexr.demo.springdatajpademo.manytoone.service.ManyToOneService;
import org.springframework.stereotype.Service;

@Service("BookService")
public class ManyToOneServiceImpl implements ManyToOneService {
    private final BookRepository bookRepository;
    private final CategoryRepository categoryRepository;

    public ManyToOneServiceImpl(BookRepository bookRepository, CategoryRepository categoryRepository) {
        this.bookRepository = bookRepository;
        this.categoryRepository = categoryRepository;
    }

    @Override
    public void saveBook(Book book) {
        bookRepository.save(book);
    }

    @Override
    public void saveCategory(Category category) {
        categoryRepository.save(category);
    }
}
