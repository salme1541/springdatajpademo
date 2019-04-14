package com.nexr.demo.springdatajpademo;

import com.nexr.demo.springdatajpademo.manytoone.dao.BookRepository;
import com.nexr.demo.springdatajpademo.manytoone.dao.CategoryRepository;
import com.nexr.demo.springdatajpademo.manytoone.entity.Book;
import com.nexr.demo.springdatajpademo.manytoone.entity.Category;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements ApplicationRunner {

    private final BookRepository bookRepository;
    private final CategoryRepository categoryRepository;

    public AppRunner(BookRepository bookRepository, CategoryRepository categoryRepository) {
        this.bookRepository = bookRepository;
        this.categoryRepository=categoryRepository;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        //Category 생성 및 저장
        Category cate1 = new Category();
        cate1.setName("coding");
        Category cate2 = new Category();
        cate2.setName("data");

        categoryRepository.save(cate1);
        categoryRepository.save(cate2);

        //Book 생성
        Book book1 = new Book();
        book1.setTitle("스프링 Jpa");
        Book book2 = new Book();
        book2.setTitle("Data Lake");

        //Book에 Category 설정
        book1.setCategory(cate1);
        book2.setCategory(cate2);

        //Book 저장
        bookRepository.save(book1);
        bookRepository.save(book2);
    }
}
