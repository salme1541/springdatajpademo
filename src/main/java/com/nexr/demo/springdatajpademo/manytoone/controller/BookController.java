package com.nexr.demo.springdatajpademo.manytoone.controller;

import com.nexr.demo.springdatajpademo.manytoone.dao.BookRepository;
import com.nexr.demo.springdatajpademo.manytoone.dao.CategoryRepository;
import com.nexr.demo.springdatajpademo.manytoone.entity.Book;
import com.nexr.demo.springdatajpademo.manytoone.entity.Category;
import com.nexr.demo.springdatajpademo.manytoone.service.ManyToOneService;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {

    private final BookRepository bookRepository;
    private final CategoryRepository categoryRepository;
    private final ModelMapper modelMapper;
    private final ManyToOneService manyToOneService;

    public BookController(BookRepository bookRepository, CategoryRepository categoryRepository, ModelMapper modelMapper, ManyToOneService manyToOneService) {
        this.bookRepository = bookRepository;
        this.categoryRepository = categoryRepository;
        this.modelMapper = modelMapper;
        this.manyToOneService = manyToOneService;
    }

    @GetMapping("/fakeaddbook")
    public String fakeAddBook(){
        manyToOneService.saveBook(new Book("Effective Java"));
        return "{\"message\" :  \"ok\"}";
    }

    @GetMapping("/bookAndCategory")
    public List<Book> getBookAndCategoryList(){
        return bookRepository.findBookAndCategory();
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
