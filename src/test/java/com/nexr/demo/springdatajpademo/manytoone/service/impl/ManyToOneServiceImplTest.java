package com.nexr.demo.springdatajpademo.manytoone.service.impl;

import com.nexr.demo.springdatajpademo.manytoone.dao.BookRepository;
import com.nexr.demo.springdatajpademo.manytoone.entity.Book;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.assertj.core.api.Java6Assertions.assertThat;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ManyToOneServiceImplTest {

    @Autowired
    private ManyToOneServiceImpl bookService;

    @MockBean
    private BookRepository mockBookRepository;

    @Test
    public void testGetBookById(){
        Book book = new Book();
        book.setTitle("testBook");

        when(mockBookRepository.findById(1L)).thenReturn(Optional.of(book));

        assertThat(bookService.getBookById(1L).getTitle()).isEqualTo("testBook");
    }
}