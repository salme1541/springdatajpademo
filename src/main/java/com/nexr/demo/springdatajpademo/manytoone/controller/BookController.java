package com.nexr.demo.springdatajpademo.manytoone.controller;

import com.nexr.demo.springdatajpademo.manytoone.dao.BookRepository;
import com.nexr.demo.springdatajpademo.manytoone.dao.CategoryRepository;
import com.nexr.demo.springdatajpademo.manytoone.entity.Book;
import com.nexr.demo.springdatajpademo.manytoone.entity.Category;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {

    private final BookRepository bookRepository;
    private final CategoryRepository categoryRepository;
    private final ModelMapper modelMapper;

    public BookController(BookRepository bookRepository, CategoryRepository categoryRepository, ModelMapper modelMapper) {
        this.bookRepository = bookRepository;
        this.categoryRepository = categoryRepository;
        this.modelMapper = modelMapper;
    }

    @GetMapping("/books")
    public List<Book> getBookList(){
        return bookRepository.findAll();

        //modelMapper를 사용한 converter
//        ModelMapper modelMapper = new ModelMapper();

//        return bookRepository.findAll().stream()
//                .map(m -> modelMapper.map(m, BookRes.class))
//                .collect(Collectors.toList());
    }

    @GetMapping("/categories")
    public List<Category> getCategoryList(){
        return categoryRepository.findAll();
    }
}
