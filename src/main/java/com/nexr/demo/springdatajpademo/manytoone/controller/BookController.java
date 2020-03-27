package com.nexr.demo.springdatajpademo.manytoone.controller;

import com.nexr.demo.springdatajpademo.manytoone.dao.BookRepository;
import com.nexr.demo.springdatajpademo.manytoone.dao.CategoryRepository;
import com.nexr.demo.springdatajpademo.manytoone.entity.Book;
import com.nexr.demo.springdatajpademo.manytoone.service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    //CON-3179 의 수정

    private final BookRepository bookRepository;
    private final CategoryRepository categoryRepository;
    private final BookService bookService;

    public BookController(BookRepository bookRepository, CategoryRepository categoryRepository, BookService bookService) {
        this.bookRepository = bookRepository;
        this.categoryRepository = categoryRepository;
        this.bookService = bookService;
    }

    @PostMapping
    public Book createBook(@RequestBody Book book){
        return bookService.createBook(book);
    }

    @PutMapping
    public Book updateBook(Long id, @RequestBody Book book){
        return bookService.updateBook(id, book);
    }

    @GetMapping
    public List<Book> getBookList(){
        return bookRepository.findAll();
    }
}
